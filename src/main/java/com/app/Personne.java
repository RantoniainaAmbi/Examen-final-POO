package com.app;

import java.time.LocalDate;


public class Personne {
    private int id;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String email;
    private int telephone;

    public Personne(int id, String nom, String prenom, LocalDate dateNaissance, String email, int telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.telephone = telephone;
    }
}
