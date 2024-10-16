package fr.formation.game;

import java.util.function.Consumer;
import java.util.function.Function;

import fr.formation.game.morpion.GrilleMorpion;
import fr.formation.game.morpion.JoueurMorpion;
import reactor.core.publisher.Sinks;

public class Morpion extends Jeu {
    private GrilleMorpion grille;
    private JoueurMorpion joueurX;
    private JoueurMorpion joueurO;
    private JoueurMorpion winner;

    @Override
    public void demarrer(Function<String, Integer> demander, Consumer<Joueur> finDePartie, Sinks.Many<Grille> sink) {
        System.out.println("Le morpion démarre ...");
        
        this.grille = new GrilleMorpion();
        this.joueurX = new JoueurMorpion('X');
        this.joueurO = new JoueurMorpion('O');

        JoueurMorpion currentPlayer = this.joueurX;

        // Tant qu'on a pas de gagnant et que la grille n'est pas remplie
        while (this.winner == null && !this.grille.isBoardFull()) {
            // On appelle l'affichage de la grille
            sink.tryEmitNext(this.grille);

            // On demande au joueur de saisir la position ligne puis colonne
            int row = demander.apply(currentPlayer + ", entrez votre ligne (0-2)");
            int col = demander.apply(currentPlayer + ", entrez votre colonne (0-2)");

            // On exécute le mouvement du joueur
            if (this.grille.makeMove(currentPlayer, row, col)) {
                // On change de joueur en alternant entre X et O si le mouvement a pu se faire
                currentPlayer = (currentPlayer == this.joueurX) ? this.joueurO : this.joueurX;
                
                // On vérifie si on a un gagnant
                this.checkWinner();
            }
        }

        // On termine en affichant la grille et en précisant le gagnant s'il y en a
        sink.tryEmitNext(this.grille);

        finDePartie.accept(winner);
    }

    // Vérifier s'il y a un gagnant
    private void checkWinner() {
        Character winner = this.grille.checkWinner();

        if (winner == 'X') {
            this.winner = this.joueurX;
        }

        if (winner == 'O') {
            this.winner = this.joueurO;
        }
    }
}
