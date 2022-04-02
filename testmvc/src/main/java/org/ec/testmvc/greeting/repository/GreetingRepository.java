package org.ec.testmvc.greeting.repository;

import org.ec.testmvc.greeting.domain.Greeting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends CrudRepository<Greeting, Long> {
}
