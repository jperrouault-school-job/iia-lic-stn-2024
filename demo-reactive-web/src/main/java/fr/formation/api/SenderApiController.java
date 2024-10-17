package fr.formation.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.service.MessageService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/send")
@RequiredArgsConstructor
public class SenderApiController {
    private final MessageService service;

    @GetMapping
    public void send(@RequestParam String message) {
        this.service.getMessages().tryEmitNext(message);
    }
}
