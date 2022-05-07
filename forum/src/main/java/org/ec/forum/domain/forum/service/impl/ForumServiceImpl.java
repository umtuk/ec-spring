package org.ec.forum.domain.forum.service.impl;

import lombok.RequiredArgsConstructor;
import org.ec.forum.domain.forum.dto.ForumRegistrationForm;
import org.ec.forum.domain.forum.dto.ForumResponseForm;
import org.ec.forum.domain.forum.dto.ForumUpdateForm;
import org.ec.forum.domain.forum.entity.Forum;
import org.ec.forum.domain.forum.exception.ForumNotFoundException;
import org.ec.forum.domain.forum.repository.ForumRepository;
import org.ec.forum.domain.forum.service.ForumService;
import org.ec.forum.domain.forum.util.converter.ForumEntityConverter;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ForumServiceImpl implements ForumService {

    private final ForumRepository forumRepository;

    @Override
    public ForumResponseForm readById(Long id) {
        Forum forum = forumRepository.findById(id)
                .orElseThrow(() -> new ForumNotFoundException(id));

        forum.setViews(forum.getViews() + 1);

        return ForumEntityConverter.convert(forumRepository.save(forum));
    }


    @Override
    public Iterable<ForumResponseForm> readAll(Pageable pageable) {
        Iterable<Forum> forums = forumRepository.findAll(pageable);
        List<ForumResponseForm> forms = new ArrayList<>();

        for (Forum forum : forums)
            forms.add(ForumEntityConverter.convert(forum));

        return forms;
    }

    @Override
    public ForumResponseForm create(ForumRegistrationForm form) {
        Forum forum = forumRepository.save(ForumEntityConverter.convert(form));
        return ForumEntityConverter.convert(forum);
    }

    @Override
    public ForumResponseForm updateById(Long id, ForumUpdateForm form) {
        Forum forum = forumRepository.findById(id)
                .orElseThrow(() -> new ForumNotFoundException(id));

        forum.setUpdatedAt(System.currentTimeMillis());
        forum.setContent(form.getContent());

        return ForumEntityConverter.convert(forumRepository.save(forum));
    }

    @Override
    public void deleteById(Long id){
        if (forumRepository.existsById(id))
            forumRepository.deleteById(id);
        else throw new ForumNotFoundException(id);
    }
}
