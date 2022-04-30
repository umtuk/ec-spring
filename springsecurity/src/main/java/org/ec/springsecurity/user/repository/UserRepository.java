package org.ec.springsecurity.user.repository;

import org.ec.springsecurity.user.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
