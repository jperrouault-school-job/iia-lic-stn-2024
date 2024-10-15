package objet;

import objet.game.Jeu;
import objet.game.Morpion;

public class AppGame {
    public static void main(String[] args) {
        Jeu monJeu = new Morpion();

        monJeu.demarrer();
    }
}
