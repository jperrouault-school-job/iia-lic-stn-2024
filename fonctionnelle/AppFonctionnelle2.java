package fonctionnelle;

import java.util.function.BiFunction;

public class AppFonctionnelle2 {
    public static void main(String[] args) {
        // Les fonctions multiplier et diviser
        BiFunction<Integer, Integer, Integer> multiplication = (a, b) -> a * b;
        BiFunction<Integer, Integer, Integer> division = (a, b) -> a / b;
        
        beaucoupPlusSimple(multiplication);
        beaucoupPlusSimple(division);
    }

    static void beaucoupPlusSimple(BiFunction<Integer, Integer, Integer> operation) {
        Integer resultat = operation.apply(5, 7);

        System.out.println(resultat);
    }
}
