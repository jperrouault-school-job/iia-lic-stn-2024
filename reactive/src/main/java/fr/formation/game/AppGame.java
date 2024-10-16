package fr.formation.game;

import java.util.function.Consumer;
import java.util.function.Function;

import reactor.core.publisher.Sinks;

public class AppGame {
    public static void main(String[] args) {
        Function<String, Integer> demander = texte -> {
            System.out.println(texte + " :");
            
            return Integer.parseInt(System.console().readLine());
        };

        Consumer<Joueur> finDePartie = joueur -> {
            if (joueur == null) {
                System.out.println("Match nul !");
            }

            else {
                System.out.println(joueur + " gagne !");
            }
        };

        Sinks.Many<Grille> sink = Sinks.many().multicast().directAllOrNothing();

        sink.asFlux().subscribe(Grille::print);

        Jeu monJeu = new Morpion();

        monJeu.demarrer(demander, finDePartie, sink);
    }
}
