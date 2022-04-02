package org.ec.testmvc.greeting.service.impl;

import lombok.RequiredArgsConstructor;
import org.ec.testmvc.greeting.domain.Greeting;
import org.ec.testmvc.greeting.repository.GreetingRepository;
import org.ec.testmvc.greeting.service.GreetingService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GreetingServiceImpl implements GreetingService {

    private final GreetingRepository greetingRepository;

    @Override
    public Greeting create(Greeting greeting) {
        return greetingRepository.save(greeting);
    }

    @Override
    public Iterable<Greeting> readAll() {
        return greetingRepository.findAll();
    }
}
