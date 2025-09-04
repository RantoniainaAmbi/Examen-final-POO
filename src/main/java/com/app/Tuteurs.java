package com.app;

import java.time.Instant;

public class Tuteurs extends Personne{
    private String descrption;

    public Tuteurs(int id, String nom, String prenom, String email, Instant dateNaissance,int telephone, String descrption) {
        super(id, nom, prenom, dateNaissance, email, telephone);
        this.descrption = descrption;
    }
}
