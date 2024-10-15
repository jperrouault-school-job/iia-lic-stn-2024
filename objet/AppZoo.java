package objet;

import objet.zoo.Animal;
import objet.zoo.Chasseur;
import objet.zoo.Chat;

public class AppZoo {
    public static void main(String[] args) {
        Chasseur pica = new Chat("Pica");
        // Animal animal = new Animal(); // IMPOSSIBLE CAR ABSTRAIT

        // System.out.println(pica.getNom());

        // pica.manger();
        pica.dormir();
        System.out.println(pica);
        pica.chasser();


        Animal pitchoune = new Chat("Pitchoune");

        // On va caster
        if (pitchoune instanceof Chasseur chasseur) {
            // ((Chasseur)pitchoune).chasser();
            chasseur.chasser();
        }
    }
}
