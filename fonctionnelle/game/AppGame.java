package fonctionnelle.game;

import java.util.function.Consumer;
import java.util.function.Function;

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

        Jeu monJeu = new Morpion();

        monJeu.demarrer(demander, finDePartie);
    }
}
