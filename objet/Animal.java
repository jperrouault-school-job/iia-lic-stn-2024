package objet;

public abstract class Animal {
    public Animal() {
        System.out.println("CREATION D'UN ANIMAL");
    }

    // public void dormir() {
    //     System.out.println("L'animal dort ...");
    // }

    // On rend toutes les classes filles responsable de décrire comment dormir s'exécute
    public abstract void dormir();
}
