package org.ec.testrepository.domain.board.repository;

import org.ec.testrepository.domain.board.domain.Board;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends CrudRepository<Board, Long> {
}
