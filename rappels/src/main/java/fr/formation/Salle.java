package fr.formation;

import java.util.ArrayList;
import java.util.List;

public class Salle {
    private String nom;
    private List<Personne> participants;

    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public List<Personne> getParticipants() {
        return participants;
    }
    
    public void setParticipants(List<Personne> participants) {
        this.participants = participants;
    }

    public Salle() {
        this.participants = new ArrayList<>();
    }
}
