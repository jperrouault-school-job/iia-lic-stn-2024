package fonctionnelle.game;

import java.util.function.Consumer;
import java.util.function.Function;

public abstract class Jeu {
    public abstract void demarrer(Function<String, Integer> demander, Consumer<Joueur> finDePartie);
}
