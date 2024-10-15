package objet.game;

import objet.game.morpion.Grille;
import objet.game.morpion.Joueur;

public class Morpion extends Jeu {
    private Grille grille;
    private Joueur joueurX;
    private Joueur joueurO;
    private Joueur winner;

    @Override
    public void demarrer() {
        System.out.println("Le morpion démarre ...");
        
        this.grille = new Grille();
        this.joueurX = new Joueur('X');
        this.joueurO = new Joueur('O');

        Joueur currentPlayer = this.joueurX;

        // Tant qu'on a pas de gagnant et que la grille n'est pas remplie
        while (this.winner == null && !this.grille.isBoardFull()) {
            this.grille.print(); // On appelle l'affichage de la grille

            // On demande au joueur de saisir la position ligne puis colonne
            System.out.println(currentPlayer + ", entrez votre ligne (0-2) puis votre colonne (0-2) :");
            
            int row = Integer.parseInt(System.console().readLine());
            int col = Integer.parseInt(System.console().readLine());

            // On exécute le mouvement du joueur
            if (this.grille.makeMove(currentPlayer, row, col)) {
                // On change de joueur en alternant entre X et O si le mouvement a pu se faire
                currentPlayer = (currentPlayer == this.joueurX) ? this.joueurO : this.joueurX;
                
                // On vérifie si on a un gagnant
                this.checkWinner();
            }
        }

        // On termine en affichant la grille et en précisant le gagnant s'il y en a
        this.grille.print();

        if (winner != null) {
            System.out.println(this.winner.getPion() + " gagne !");
        }
        
        else {
            System.out.println("Match nul !");
        }
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
