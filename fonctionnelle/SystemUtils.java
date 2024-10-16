package fonctionnelle;

public class SystemUtils {
    public static String demander(String texte) {
        System.out.println("Saisir " + texte + " :");

        return System.console().readLine();
    }
}
