package fr.formation;

import java.time.Duration;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

public class App {
    public static void main(String[] args) throws InterruptedException {
        // Dans cet exemple, le flux est alimenté automatiquement de 1 à 10
        Flux<Integer> lesEntiers = Flux.range(1, 10).delayElements(Duration.ofMillis(500));

        // Dès qu'une nouvelle valeur arrive, on exécute le sout ci-dessous
        lesEntiers.subscribe(valeur -> System.out.println("La valeur est " + valeur));

        // Dans cet exemple, on alimente manuellement le flux
        Sinks.Many<Integer> monSink = Sinks.many().multicast().directAllOrNothing();

        // Dès qu'une nouvelle valeur arrive, on exécute le sout ci-dessous
        monSink.asFlux().subscribe(valeur -> System.out.println("L'autre valeur : " + valeur));

        // Alimenter le Sink
        Thread.sleep(10);
        monSink.tryEmitNext(50);
        Thread.sleep(1000);
        monSink.tryEmitNext(500);


        // Créer 2 Sinks d'entiers : "aSink", "bSink"
        Sinks.Many<Integer> aSink = Sinks.many().multicast().directAllOrNothing();
        Sinks.Many<Integer> bSink = Sinks.many().multicast().directAllOrNothing();

        // On va générer un nouveau Flux à partir des 2 Sinks aSink & bSink
        Flux<Integer> laSomme = Flux.combineLatest(
            aSink.asFlux(),
            bSink.asFlux(),
            (a, b) -> a + b
        );

        // On va s'inscrire à ce nouveau Flux laSomme
        laSomme.subscribe(resultat -> System.out.println("Le nouveau résultat est : " + resultat));

        // Emettre dans "a" 3, dans "b" 8, puis dans "a" émettre 10
        aSink.tryEmitNext(3);

        bSink.tryEmitNext(8);
        
        aSink.tryEmitNext(10);

        Thread.sleep(20000);
    }
}
