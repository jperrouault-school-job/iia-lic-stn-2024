package fr.formation.game.morpion;

import fr.formation.game.Joueur;

public class JoueurMorpion extends Joueur {
    private Character pion;

    public Character getPion() {
        return this.pion;
    }

    public JoueurMorpion(Character pion) {
        this.pion = pion;
    }

    @Override
    public String toString() {
        return "Joueur " + this.pion;
    }
}
