package objet;

public class AppIntro {

    public static void main(String[] args) {
        Personne jeremy = new Personne("PERROUAULT", "Jérémy", 27);
        Personne albert = new Personne("DUPONT", "Albert", 28);

        // jeremy.setNom("PERROUAULT");
        // jeremy.setPrenom("Jérémy");
        // jeremy.setAge(27);

        System.out.println(jeremy.getAge());
        jeremy.setAge(-50);
        System.out.println(jeremy.getAge());

        // albert.setPrenom("Albert");

        jeremy.ecrireQuelquechose();
        albert.ecrireQuelquechose();

        System.out.println(jeremy.getPrenom() + ", " + jeremy.getAge() + " ans.");
    }

    
}


// Créer une classe Personne (nom, prénom, age)
// Vous instancier
