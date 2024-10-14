Character[][] board = {
    {' ', ' ', ' '},
    {' ', ' ', ' '},
    {' ', ' ', ' '}
};

// On démarre avec le joueur X
Character currentPlayer = 'X';

// Afficher le plateau
void printBoard() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            print(board[i][j]);

            if (j < 2) {
                print("|");
            }
        }

        println();

        if (i < 2){
            println("-----");
        }
    }
}

// Vérifier si le coup est valide
boolean isMoveValid(int row, int col) {
    return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
}

// Jouer un coup
void makeMove(int row, int col) {
    // Si le coup est valide
    if (isMoveValid(row, col)) {
        board[row][col] = currentPlayer; // On joue le coup en plaçant X ou O selon le joueur
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // On change de joueur en alternant entre X et O
    }
    
    else {
        println("Coup invalide ! Redonner un autre coup.");
    }
}

// Vérifier s'il y a un gagnant
Character checkWinner() {
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
boolean isBoardFull() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (board[i][j] == ' ') {
                return false; // Si on trouve une seule case vide, c'est que la grille n'est pas pleine
            }
        }
    }

    return true;
}

// Jouer le jeu : appeler cette fonction pour démarrer le jeu
void playGame() {
    Character winner = ' ';

    // Tant qu'on a pas de gagnant et que la grille n'est pas remplie
    while (winner == ' ' && !isBoardFull()) {
        printBoard(); // On appelle l'affichage de la grille

        // On demande au joueur de saisir la position ligne puis colonne
        println("Joueur " + currentPlayer + ", entrez votre ligne (0-2) puis votre colonne (0-2) :");
        
        int row = Integer.parseInt(System.console().readLine());
        int col = Integer.parseInt(System.console().readLine());

        // On exécute le mouvement du joueur
        makeMove(row, col);

        // On vérifie si on a un gagnant
        winner = checkWinner();
    }

    // On termine en affichant la grille et en précisant le gagnant s'il y en a
    printBoard();

    if (winner != ' ') {
        println("Le joueur " + winner + " gagne !");
    }
    
    else {
        println("Match nul !");
    }
}
