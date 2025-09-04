package com.app;

import java.time.Instant;
import java.time.LocalDate;

public class Enseignants extends Personne{
    private String specialite;

    public Enseignants(int id, String nom, String prenom, String email, LocalDate dateNaissance, int telephone, String specialite) {
        super(id, nom, prenom, dateNaissance, email, telephone);
        this.specialite = specialite;
    }
}
