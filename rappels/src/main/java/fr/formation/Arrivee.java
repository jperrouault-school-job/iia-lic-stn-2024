package fr.formation;

public class Arrivee {
    private Personne personne;
    private Salle salle;

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public Arrivee(Personne personne, Salle salle) {
        this.personne = personne;
        this.salle = salle;

        this.salle.getParticipants().add(personne);
    }
}
