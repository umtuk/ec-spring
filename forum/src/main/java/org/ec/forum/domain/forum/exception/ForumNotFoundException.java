package org.ec.forum.domain.forum.exception;

public class ForumNotFoundException extends RuntimeException {

    public ForumNotFoundException(Long id) {
        super("Forum is not found: " + id);
    }
}
