
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

// Dans l'exercice précédent, afficher un message "OK !" quand l'index = 2
Integer i = 0;
while (i < monTab.length) {
    print(monTab[i]);

    if (monTab[i] == monTab[2]) {
        print("OK !");
    }

    i++;
}

// Exercice faire la somme de tous les entiers, puis afficher le résultat
Integer[] monTab = { 5, 4, 10, 3, 14 };

// monTab[0] + monTab[1] + monTab[2] + monTab[3];

Integer resultat = 0;

for (Integer i = 0; i < monTab.length; i++) {
    resultat = resultat + monTab[i];
}

print(resultat);



// Les tableaux 2D :
Integer[][] monTab = {
    { 1, 2, 3 },
    { 4, 5, 6 },
    { 7, 8, 9 }
};

print(monTab[1][0]); // Affichera 4





// Les fonctions : blocs d'instructions qu'on peut rappeler autant de fois que nécessaire
// > Une fonction peut avoir 0, 1 ou n paramètres (qu'on appelle arguments)
// > Une fonction peut retourner 0 ou 1 valeur (valeur de retour)

// > Une fonction est définie par sa signature
// >> Type de retour nom(type arg1, type arg2, ...)

Integer additionner(Integer a, Integer b, Integer c) {
    Integer resultat = a + b + c;

    return resultat;
}

// Pour appeler la fonction (l'exécuter)
Integer ab = additionner(5, 10, 5);

void afficher(String laPhrase) {
    print(laPhrase);
}

afficher("La phrase");

// Mettre la somme du tableau en fonction qu'on appelera "somme"
// > Attendre en paramètre le tableau à sommer
// > Retourner le résultat des opérations
Integer somme(Integer[] leTab) {
    Integer resultat = 0;
    
    for (Integer i = 0; i < leTab.length; i++) {
        resultat = resultat + leTab[i];
    }

    return resultat;
}

Integer[] monTab = { 5, 4, 10, 3, 14 };
Integer[] monTab2 = { 10, 3, 18, 56 };

print( somme(monTab) );
print( somme(monTab2) );

