package org.ec.forum.domain.forum.controller;

import lombok.RequiredArgsConstructor;
import org.ec.forum.domain.forum.exception.dto.ForumRegistrationForm;
import org.ec.forum.domain.forum.exception.dto.ForumResponseForm;
import org.ec.forum.domain.forum.exception.dto.ForumUpdateForm;
import org.ec.forum.domain.forum.exception.ForumNotFoundException;
import org.ec.forum.domain.forum.exception.ForumRegistrationInvalid;
import org.ec.forum.domain.forum.exception.ForumUpdateInvalid;
import org.ec.forum.domain.forum.service.ForumService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/forum")
public class ForumController {

    private final ForumService forumService;

    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable Long id) throws ForumNotFoundException {
        ForumResponseForm form = forumService.readById(id);
        return ResponseEntity.ok(form);
    }

    @GetMapping("/page")
    public ResponseEntity getAll(@PageableDefault() Pageable pageable) {
        Iterable<ForumResponseForm> forms = forumService.readAll(pageable);
        return ResponseEntity.ok(forms);
    }

    @PostMapping
    public ResponseEntity postForum(@RequestBody @Valid ForumRegistrationForm form, BindingResult errors) {
        if (errors.hasErrors())
            throw  new ForumRegistrationInvalid();

        ForumResponseForm responseForm = forumService.create(form);
        return ResponseEntity.ok(responseForm);
    }

    @PutMapping("/{id}")
    public ResponseEntity putForum(@PathVariable Long id, @RequestBody @Valid ForumUpdateForm form, BindingResult errors) {
        if (errors.hasErrors())
            throw new ForumUpdateInvalid();

        ForumResponseForm responseForm = forumService.updateById(id, form);
        return ResponseEntity.ok(responseForm);
    }

    @DeleteMapping("/{id}")
    public  ResponseEntity deleteForum(@PathVariable Long id) {
        forumService.deleteById(id);
        return ResponseEntity.ok("success");
    }
}
