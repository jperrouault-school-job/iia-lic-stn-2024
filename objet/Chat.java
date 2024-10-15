package objet;

public class Chat {
    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Chat(String nom) {
        System.out.println("CREATION DU CHAT " + nom);
        this.nom = nom;
    }
}
