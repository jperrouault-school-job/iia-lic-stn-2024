package fonctionnelle.game;

import java.util.function.Consumer;
import java.util.function.Function;

public class Puissance4 extends Jeu {
    @Override
    public void demarrer(Function<String, Integer> demander, Consumer<Joueur> finDePartie) {
        System.out.println("Le puissance4 démarre ...");

        finDePartie.accept(null);
    }
}
