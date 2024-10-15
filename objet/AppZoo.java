package objet;

public class AppZoo {
    public static void main(String[] args) {
        Chat pica = new Chat("Pica");

        System.out.println(pica.getNom());

        pica.manger();
    }
}
