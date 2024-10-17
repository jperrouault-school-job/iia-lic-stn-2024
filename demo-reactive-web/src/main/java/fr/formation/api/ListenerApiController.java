package fr.formation.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.service.MessageService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/listen")
@RequiredArgsConstructor
public class ListenerApiController {
    private final MessageService service;

    @GetMapping
    public Flux<String> listen() {
        return this.service.getMessages().asFlux();
    }
}
