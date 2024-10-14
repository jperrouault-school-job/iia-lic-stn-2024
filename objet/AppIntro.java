package objet;

public class AppIntro {

    public static void main(String[] args) {
        Personne jeremy = new Personne();

        jeremy.nom = "PERROUAULT";
        jeremy.prenom = "Jérémy";
        jeremy.age = 27;

        System.out.println(jeremy.prenom + ", " + jeremy.age + " ans.");
    }

    Crayon crayonBleu = new Crayon();

    // crayonBleu.couleur = 1;
    // crayonBleu.epaisseur = 2;
    // crayonBleu.niveauEncre = 0;



    
}


// Créer une classe Personne (nom, prénom, age)
// Vous instancier
