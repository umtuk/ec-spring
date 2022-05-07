package org.ec.forum.domain.forum.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor
@Getter
public class ForumUpdateForm {

    @NotNull
    private Long id;

    @NotNull @Size(max = 3000)
    private String content;
}
