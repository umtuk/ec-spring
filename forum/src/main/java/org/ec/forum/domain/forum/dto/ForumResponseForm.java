package org.ec.forum.domain.forum.exception.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ForumResponseForm {

    private Long id;

    private Long createdAt;
    private Long updatedAt;

    private Long views;

    private String writer;
    private String title;
    private String content;
}
