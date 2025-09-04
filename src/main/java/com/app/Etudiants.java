package com.app;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class Etudiants extends Personne {
    private String groupe;
    private Tuteurs tuteur;
    private List<Notes> notes;

    public Etudiants(int id, String nom, String prenom, String email, LocalDate dateNaissance, int telephone, String groupe, Tuteurs tuteur, List<Notes> notes) {
        super(id,nom,prenom,dateNaissance,email,telephone);
        this.groupe = groupe;
        this.tuteur = tuteur;
        this.notes = notes;
    }

    public double getExamGrade(Examens examen, Etudiants etudiant, Instant t) {
        return notes.stream()
                .filter(notes-> notes.getDateChangement().isBefore(t))
                .max(Comparator.comparing(Notes::getDateChangement))
                .map(Notes::getValeur)
                .get();
    }
//
//    public double getCourseGrade(Cours cours, Etudiants etudiant, Instant t) {
//        var noteFinale = 0;
//        for (Notes note : notes) {
//
//        }
//    }
}
