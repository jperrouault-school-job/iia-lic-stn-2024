package fr.formation.game;

import java.util.function.Consumer;
import java.util.function.Function;

import reactor.core.publisher.Sinks;

public abstract class Jeu {
    public abstract void demarrer(Function<String, Integer> demander, Consumer<Joueur> finDePartie, Sinks.Many<Grille> sink);
}
