package com.app;

import java.time.LocalDate;

public class Tuteurs extends Personne{
    private String descrption;

    public Tuteurs(int id, String nom, String prenom, String email, LocalDate dateNaissance, int telephone, String descrption) {
        super(id, nom, prenom, dateNaissance, email, telephone);
        this.descrption = descrption;
    }
}
