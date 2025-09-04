package com.app;

import java.time.Instant;

public class Notes {
    private int valeur;
    private Examens examen;
    private Instant dateChangement;
    private String description;
    private Etudiants etudiant;

    public Notes(int valeur, Examens examen, String description, Instant dateChangement, Etudiants etudiant) {
        this.valeur = valeur;
        this.examen = examen;
        this.description = description;
        this.dateChangement = dateChangement;
        this.etudiant = etudiant;
    }

    public int getValeur() {
        return valeur;
    }

    public Instant getDateChangement() {
        return dateChangement;
    }

    public Examens getExamen() {
        return examen;
    }
}
