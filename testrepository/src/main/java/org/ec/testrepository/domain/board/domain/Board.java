package org.ec.testrepository.domain.board.domain;

import javax.persistence.*;

@Entity
@Table(name = "Board")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "content")
    private String content;

    public Board(String content) {
        this.content = content;
    }

    public Board() {

    }
}
