package fr.formation;

import reactor.core.publisher.Sinks;

public class AppExercice {
    public static void main(String[] args) {
        Sinks.Many<String> saisies = Sinks.many().multicast().directAllOrNothing();

        saisies.asFlux().subscribe(saisie -> System.out.println("L'utilisateur a saisi : " + saisie));

        for (int i = 0; i < 10; i++) {
            saisies.tryEmitNext(System.console().readLine());
        }
    }
}
