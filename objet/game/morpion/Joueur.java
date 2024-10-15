package objet.game.morpion;

public class Joueur {
    private Character pion;

    public Character getPion() {
        return this.pion;
    }

    public Joueur(Character pion) {
        this.pion = pion;
    }

    @Override
    public String toString() {
        return "Joueur " + this.pion;
    }
}
