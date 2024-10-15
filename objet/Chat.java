package objet;

public class Chat extends Animal {
    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Chat() {
        System.out.println("CREATION D'UNE CHAT");
    }

    public Chat(String nom) {
        System.out.println("CREATION DU CHAT " + nom);
        this.nom = nom;
    }

    public void manger() {
        System.out.println("Le chat " + this.nom + " mange ...");
    }

    public void dormir() {
        System.out.println("Le chat " + this.nom + " dort dans son panier neuf ...");    
    }

    @Override
    public String toString() {
        return "Le chat " + this.nom;
    }
}
