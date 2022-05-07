package org.ec.forum.domain.forum.util.converter;

import org.ec.forum.domain.forum.exception.dto.ForumRegistrationForm;
import org.ec.forum.domain.forum.exception.dto.ForumResponseForm;
import org.ec.forum.domain.forum.entity.Forum;

public class ForumEntityConverter {

    public static Forum convert(ForumRegistrationForm form) {
        long createdAt = System.currentTimeMillis();
        long updatedAt = -1L;
        long views = 0;
        String writer = form.getWriter();
        String title = form.getTitle();
        String content = form.getContent();

        return new Forum(createdAt, updatedAt, views, writer, title, content);
    }

    public static ForumResponseForm convert(Forum forum) {
        long id = forum.getId();
        long createdAt = forum.getCreatedAt();
        long updatedAt = forum.getUpdatedAt();
        long views = forum.getViews();
        String writer = forum.getWriter();
        String title = forum.getTitle();
        String content = forum.getContent();

        return new ForumResponseForm(id, createdAt, updatedAt, views, writer, title, content);
    }
}
