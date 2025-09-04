package com.app;

import java.time.Instant;

public class Notes {
    private double valeur;
    private Examens examen;
    private Instant dateChangement;
    private String description;
    private Etudiants etudiant;

    public Notes(double valeur, Examens examen, String description, Instant dateChangement, Etudiants etudiant) {
        this.valeur = 0;
        this.examen = examen;
        this.description = description;
        this.dateChangement = dateChangement;
        this.etudiant = etudiant;
    }

    public double getValeur() {
        return valeur;
    }

    public Instant getDateChangement() {
        return dateChangement;
    }

    public Examens getExamen() {
        return examen;
    }

}
