package objet;

public class Personne {
    private String nom;
    private String prenom;
    private Integer age;

    // Les getters & setters sont un principe d'encapsulation
    // On laisse les attributs en privé, et on y place des getters & setters quand c'est nécessaire

    // Getter
    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public Integer getAge() {
        return this.age;
    }

    // Setter
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(Integer age) {
        if (age  > 0) {
            this.age = age;
        }
    }

    public void ecrireQuelquechose() {
        System.out.println(this.prenom + " écrit quelque chose ...");
    }
}
