package org.ec.forum.domain.forum.controller;

import org.ec.forum.domain.forum.exception.ForumNotFoundException;
import org.ec.forum.domain.forum.exception.ForumRegistrationInvalid;
import org.ec.forum.domain.forum.exception.ForumUpdateInvalid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class ForumControllerAdvice {

    @ResponseBody
    @ExceptionHandler(ForumNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String forumNotFoundException(ForumNotFoundException e) {
        return e.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(ForumRegistrationInvalid.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String forumRegistrationInvalid(ForumRegistrationInvalid e) {
        return e.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(ForumUpdateInvalid.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String forumUpdateInvalid(ForumUpdateInvalid e) {
        return e.getMessage();
    }
}
