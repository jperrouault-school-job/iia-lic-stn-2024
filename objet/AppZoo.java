package objet;

public class AppZoo {
    public static void main(String[] args) {
        Animal pica = new Chat("Pica");
        // Animal animal = new Animal(); // IMPOSSIBLE CAR ABSTRAIT

        // System.out.println(pica.getNom());

        // pica.manger();
        pica.dormir();
        System.out.println(pica);
    }
}
