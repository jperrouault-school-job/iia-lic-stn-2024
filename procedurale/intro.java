
// Une instruction : c'est un ordre qu'on va donner à notre programme
// En Java, on termine une instruction par ";"
// > SAUF quand vous avez une accolade (un bloc d'instructions)

// Exemples d'instructions :
// Conditions
// > SI (if) ... SINON SI (else if) ... SINON (else)
// > SWITCH

// Types de variables
// > Boolean, Integer, String, Float, Double, Long, Short, Charactere

// Déclaration de variables
// > Sachant que a est une variable, et b est une variable
// > On déclare toujours une variable avec son Type puis son nom, éventuellement sa valeur
// >> Integer a = 5;
// >> Long maVariable = 8;

// Réaffecter une valeur à une variable
// > a = 7;

// Imprimer un message (print, println)
// Opérations maths
// Comparaisons
// > a == b
// > a <= b
// > a >= b
// > a != b

// Boucles
// > while (TANT QUE .. FAIRE)
// > do .. while (FAIRE .. TANT QUE)
// > for (POUR)
// > for (POUR CHAQUE)





// Boucles
// While (TANT QUE ...)
Integer a = 1;
while (a <= 10) {
    // Ici, un bloc d'instruction(s)
    print(a);
    // a = a + 1;
    a++;
}

// Faire ... Tant que
Integer a = 11;
do {
    // Ici, un bloc d'instruction(s)
    print(a);
    // a = a + 1;
    a++;
} while (a <= 10);

// Pour
for (Integer i = 0; i < 10; i++) {
    print(i);
}

// Les chaines de caractères :
String abc = "Entre guillemets";

// Les caractères :
Charactere c = 'c';

// Les tableaux 1D :
Integer[] monTab = new Integer[5];

Integer[] monTab = { 4, 10, 5, 3, 7 };

print(monTab[1]);

// Exercice : Afficher dans jshell chaque valeur du tableau
// Avec For
for (Integer i = 0; i < monTab.length; i++) {
    print(monTab[i]);
}

// Avec While
Integer i = 0;
while (i < monTab.length) {
    print(monTab[i]);
    i++;
}


// Les tableaux 2D :
Integer[][] monTab = {
    { 1, 2, 3 },
    { 4, 5, 6 },
    { 7, 8, 9 }
};

print(monTab[1][0]); // Affichera 4
