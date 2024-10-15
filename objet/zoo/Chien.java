package objet.zoo;

public class Chien extends Chasseur {
    public void dormir() {
        System.out.println("Le chien dort ...");
    }

    @Override
    public void chasser() {
        System.out.println("Le chien aboie et mort sa proie ...");
    }
}
