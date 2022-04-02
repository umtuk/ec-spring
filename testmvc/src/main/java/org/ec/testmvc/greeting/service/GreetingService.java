package org.ec.testmvc.greeting.service;

import org.ec.testmvc.greeting.domain.Greeting;

public interface GreetingService {

    Greeting create(Greeting greeting);
    Iterable<Greeting> readAll();
}
