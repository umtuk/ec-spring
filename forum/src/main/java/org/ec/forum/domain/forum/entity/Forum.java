package org.ec.forum.domain.forum.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Forum")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Forum {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) private Long createdAt;
    @Column(nullable = false) private Long updatedAt;

    @Column(nullable = false) private Long views;

    @Column(nullable = false, length = 30) private String writer;
    @Column(nullable = false, length = 40) private String title;
    @Column(nullable = false, columnDefinition = "TEXT") private String content;

    public Forum(Long createdAt, Long updatedAt, Long views, String writer, String title, String content) {
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.views = views;
        this.writer = writer;
        this.title = title;
        this.content = content;
    }
}
