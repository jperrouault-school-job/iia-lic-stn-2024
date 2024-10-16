package fr.formation.game;

import java.util.function.Consumer;
import java.util.function.Function;

import reactor.core.publisher.Sinks;

public class Puissance4 extends Jeu {
    @Override
    public void demarrer(Function<String, Integer> demander, Consumer<Joueur> finDePartie, Sinks.Many<Grille> sink) {
        System.out.println("Le puissance4 démarre ...");

        finDePartie.accept(null);
    }
}
