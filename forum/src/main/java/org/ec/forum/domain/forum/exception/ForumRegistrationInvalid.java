package org.ec.forum.domain.forum.exception;

public class ForumRegistrationInvalid extends RuntimeException {

    public ForumRegistrationInvalid() {
        super("Forum Registration is invalid");
    }
}
