package org.ec.testrepository.domain.board.controller;

import org.ec.testrepository.domain.board.domain.Board;
import org.ec.testrepository.domain.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/board")
public class BoardController {

    private final BoardRepository boardRepository;

    @Autowired
    public BoardController(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @GetMapping
    public Iterable<Board> readAll() {
        return boardRepository.findAll();
    }

    @PostMapping
    public void save(@RequestBody Board board) {
        boardRepository.save(board);
    }

}
