package fonctionnelle;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class AppFonctionnelle2 {
    public static void main(String[] args) {
        // Les fonctions multiplier et diviser
        BiFunction<Integer, Integer, Integer> multiplication = (a, b) -> a * b;
        BiFunction<Integer, Integer, Integer> division = (a, b) -> a / b;
        
        beaucoupPlusSimple(multiplication);
        beaucoupPlusSimple(division);

        moinsSimple(multiplication, resultat -> System.out.println(resultat));
        moinsSimple(division, System.out::println);
    }

    static void beaucoupPlusSimple(BiFunction<Integer, Integer, Integer> operation) {
        Integer resultat = operation.apply(5, 7);

        System.out.println(resultat);
    }

    static void moinsSimple(BiFunction<Integer, Integer, Integer> operation, Consumer<String> afficher) {
        Integer resultat = operation.apply(5, 7);

        afficher.accept("" + resultat);
    }
}
