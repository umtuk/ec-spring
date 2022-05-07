package org.ec.forum.domain.forum.exception;

public class ForumUpdateInvalid extends RuntimeException {

    public ForumUpdateInvalid() {
        super("Forum update is invalid");
    }
}
