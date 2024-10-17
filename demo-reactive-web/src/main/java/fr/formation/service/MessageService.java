package fr.formation.service;

import org.springframework.stereotype.Service;

import lombok.Getter;
import reactor.core.publisher.Sinks;

@Service
@Getter
public class MessageService {
    private Sinks.Many<String> messages = Sinks.many().multicast().directAllOrNothing();    
}
