package com.app;

import java.time.Instant;

public class Etudiants extends Personne {
    private String groupe;
    private Tuteurs tuteur;

    public Etudiants(int id, String nom, String prenom, String email, Instant dateNaissance, int telephone, String groupe, Tuteurs tuteur) {
        super(id,nom,prenom,dateNaissance,email,telephone);
        this.groupe = groupe;
        this.tuteur = tuteur;
    }
}
