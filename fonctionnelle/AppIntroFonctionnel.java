package fonctionnelle;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class AppIntroFonctionnel {
    public static void main(String[] args) {
        Maths maths = new Maths();

        // Ca, c'est de la programmation orientée objet, classique ...
        // On exécute additionner et on stock son résultat de retour
        Integer resultat = maths.additionner(4, 5);

        System.out.println(resultat);

        // Pour passer sur de la programmation fonctionnelle, il faut utiliser des interfaces fonctionnelles
        // > On peut les créer
        // > On peut aussi utiliser celles déjà présentes dans Java

        // Supplier -> Il retourne un résultat, et n'attend pas de paramètre
        // Consumer -> Il retourne pas de résultat, et attend un paramètre
        // Function -> Il retourne un résultat, et attend un paramètre

        // On exécute PAS additionner, on stock simplement la référence à cette méthode
        BiFunction<Integer, Integer, Integer> addFunction = maths::additionner;

        // Et c'est ICI, qu'on exécute additionner et qu'on stock son résultat
        resultat = addFunction.apply(8, 16);
        
        System.out.println(resultat);

        demoFonction(maths::additionner);

        BiFunction<Integer, Integer, Integer> minusFunction = (a, b) -> {
            return a * b;
        };
        
        demoFonction(minusFunction);

        demoFonction((a, b) -> {
            return a / b + 1;
        });

        demoFonction((a, b) -> a / b + 8);




        // MaPropreInterfaceFonctionnelle monIface = (a, b, c) -> {
        //     return "la chaine " + (a + b / c);
        // };
        MaPropreInterfaceFonctionnelle monIface = (a, b, c) -> "la chaine " + (a + b / c);

        String leResultat = monIface.avecTroisParametres(8, 4, 9);
        System.out.println(leResultat);




        List<String> prenoms = new ArrayList<>();

        prenoms.add("Jérémy");
        prenoms.add("Maxens");
        prenoms.add("Maxence");
        prenoms.add("Marine");
        prenoms.add("Léo");

        for (String prenom : prenoms) {
            System.out.println(prenom);
        }

        Consumer<String> aExecuterPlusTard = System.out::println;

        for (String prenom : prenoms) {
            aExecuterPlusTard.accept(prenom);
        }

        prenoms.forEach(aExecuterPlusTard);
        prenoms.forEach(System.out::println);
        prenoms.forEach(prenom -> System.out.println(prenom));
        
        // Exercice : afficher que les prénoms qui ont 6 lettres
        prenoms.stream()
            // On filtre chaque prénom
            .filter(prenom -> prenom.length() == 6)
            .forEach(System.out::println)
        ;


        // Somme des éléments d'une liste
        List<Integer> maListeEntiers = List.of(8, 9, 10, 50, 47, 63);

        Integer sommeListe = maListeEntiers.stream()
            .reduce(0, (total, valeur) -> total + valeur)
        ;

        System.out.println(sommeListe);

        BinaryOperator<Integer> leReduce = (total, valeur) -> total + valeur;

        sommeListe = maListeEntiers.stream().reduce(-10, leReduce);

        System.out.println(sommeListe);
    }

    static void demoFonction(BiFunction<Integer, Integer, Integer> fonctionAExecuterPlusTard) {
        // Du traitement blabla
        Integer val1 = 8;
        Integer val2 = 7;

        Integer resultat = fonctionAExecuterPlusTard.apply(val1, val2);

        System.out.println(resultat);
    }
}
