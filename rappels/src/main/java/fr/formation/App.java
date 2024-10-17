package fr.formation;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import reactor.core.publisher.Sinks;

public class App {
    public static void main(String[] args) {
        Sinks.Many<Arrivee> arrivees = Sinks.many().multicast().directAllOrNothing();

        BiConsumer<Formateur, Salle> arriveeFormateur = (formateur, salle) -> {
            System.out.println("Arrivée du formateur " + formateur + " !");

            for (Personne participant : salle.getParticipants()) {
                if (participant instanceof Eleve) {
                    System.out.println(" >> " + participant + " se lève ...");
                }
            }
        };

        Consumer<Eleve> arriveeEleve = eleve -> {
            System.out.println("L'élève " + eleve + " arrive en salle ...");
        };

        arrivees.asFlux().subscribe(arrivee -> {
            if (arrivee.getPersonne() instanceof Formateur formateur) {
                arriveeFormateur.accept(formateur, arrivee.getSalle());
            }

            else if (arrivee.getPersonne() instanceof Eleve eleve) {
                arriveeEleve.accept(eleve);
            }
        });


        // Données
        Salle noirmoutier = new Salle();
        Formateur jeremy = new Formateur("PERROUAULT", "Jérémy");
        Eleve kylian = new Eleve("BERNARD", "Kylian");
        Eleve evann = new Eleve("BOISTUAUD", "Evann");
        Eleve maxenceF = new Eleve("FRAPPIER", "Maxence");
        Eleve houssine = new Eleve("JABRI", "Houssine");
        Eleve leoSelim = new Eleve("LEGRAND", "Léo-Sélim");
        Eleve nathan = new Eleve("LEGRAND", "Nathan");
        Eleve maxens = new Eleve("LENORMAND", "Maxens");
        Eleve maxenceM = new Eleve("MAHIEUX", "Maxence");
        Eleve leo = new Eleve("MATHY", "Léo");
        Eleve marine = new Eleve("RETAILLEAU", "Marine");
        Eleve evan = new Eleve("SUIRE", "Evan");

        arrivees.tryEmitNext(new Arrivee(kylian, noirmoutier));
        arrivees.tryEmitNext(new Arrivee(evan, noirmoutier));
        arrivees.tryEmitNext(new Arrivee(leoSelim, noirmoutier));
        arrivees.tryEmitNext(new Arrivee(jeremy, noirmoutier));
        arrivees.tryEmitNext(new Arrivee(maxenceF, noirmoutier));
        arrivees.tryEmitNext(new Arrivee(marine, noirmoutier));
        arrivees.tryEmitNext(new Arrivee(evann, noirmoutier));
        arrivees.tryEmitNext(new Arrivee(nathan, noirmoutier));
        arrivees.tryEmitNext(new Arrivee(maxenceM, noirmoutier));
        arrivees.tryEmitNext(new Arrivee(maxens, noirmoutier));
        arrivees.tryEmitNext(new Arrivee(leo, noirmoutier));
        arrivees.tryEmitNext(new Arrivee(houssine, noirmoutier));
    }
}
