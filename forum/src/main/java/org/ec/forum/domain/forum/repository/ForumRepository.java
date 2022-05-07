package org.ec.forum.domain.forum.repository;

import org.ec.forum.domain.forum.entity.Forum;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ForumRepository extends PagingAndSortingRepository<Forum, Long> {
}
