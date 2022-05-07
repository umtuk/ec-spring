package org.ec.forum.domain.forum.exception.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor
@Getter
public class ForumRegistrationForm {

    @NotNull @Size(min = 4, max = 30)
    private String writer;

    @NotNull @Size(min = 4, max = 40)
    private String title;

    @NotNull @Size(max = 3000)
    private String content;
}
