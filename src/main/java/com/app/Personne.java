package com.app;

import java.time.Instant;

public class Personne {
    private int id;
    private String nom;
    private String prenom;
    private Instant dateNaissance;
    private String email;
    private int telephone;

    public Personne(int id, String nom, String prenom, Instant dateNaissance, String email, int telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.telephone = telephone;
    }
}
