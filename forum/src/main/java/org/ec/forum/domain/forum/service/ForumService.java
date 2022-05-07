package org.ec.forum.domain.forum.service;

import org.ec.forum.domain.forum.dto.ForumRegistrationForm;
import org.ec.forum.domain.forum.dto.ForumResponseForm;
import org.ec.forum.domain.forum.dto.ForumUpdateForm;
import org.springframework.data.domain.Pageable;

public interface ForumService {

    public ForumResponseForm readById(Long id);
    public Iterable<ForumResponseForm> readAll(Pageable pageable);
    public ForumResponseForm create(ForumRegistrationForm form);
    public ForumResponseForm updateById(Long id, ForumUpdateForm form);
    public void deleteById(Long id);
}
