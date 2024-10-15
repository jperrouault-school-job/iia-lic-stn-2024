package objet.game.morpion;

public class Grille {
    private Character[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };
    
    // Afficher le plateau
    public void print() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);

                if (j < 2) {
                    System.out.print("|");
                }
            }

            System.out.println();

            if (i < 2){
                System.out.println("-----");
            }
        }
    }

    private boolean isMoveValid(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    // Jouer un coup
    public boolean makeMove(Joueur joueur, int row, int col) {
        // Si le coup est valide
        if (isMoveValid(row, col)) {
            board[row][col] = joueur.getPion(); // On joue le coup en plaçant X ou O selon le joueur
            return true;
        }
        
        System.out.println("Coup invalide ! Redonner un autre coup.");
        return false;
    }
    
    // Vérifier s'il y a un gagnant
    public Character checkWinner() {
        // Vérification des lignes et colonnes
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                return board[i][0];
            }

            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') {
                return board[0][i];
            }
        }

        // Vérification des diagonales
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            return board[0][0];
        }

        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
            return board[0][2];
        }

        return ' '; // On n'a pas de gagnant
    }

    // Vérifier si la grille est pleine (match nul)
    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; // Si on trouve une seule case vide, c'est que la grille n'est pas pleine
                }
            }
        }

        return true;
    }
}
