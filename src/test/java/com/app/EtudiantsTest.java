package com.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EtudiantsTest {
    private Notes note1;
    private Notes note2;
    private Examens examen1;
    private Examens examen2;
    private Cours PROG2;
    private Etudiants etudiant1;
    private Enseignants enseignant1;
    private Tuteurs tuteur1;
    private List<Notes> notes;

    @BeforeEach
    void setUp() {
        examen1 = new Examens(
                1,"First exam",PROG2, Instant.now(),3
        );
        examen2 = new Examens(
                2,"Second exam",PROG2, Instant.now(),4
        );
        PROG2 = new Cours(
                1,"PROG2",7,enseignant1
        );
        etudiant1 = new Etudiants(
                1,"AMBININTSOA" ,"Ranto", "ranto@gmail.com", LocalDate.parse("2008-02-19"),03245623121,"K4",tuteur1, notes
        );
        note1 = new Notes(
                10,examen1,"Premimere note de PROG2",  Instant.parse("2025-06-01T08:00:00Z"),etudiant1
        );
        note2 = new Notes(
                10,examen2,"Deuxieme note de PROG2",  Instant.parse("2025-08-01T08:00:00Z"),etudiant1
        );
        notes.add(note1);
        notes.add(note2);
    }

    @Test
    void get_exam_grade_at_instant_t_OK(){
        var noteJuillet = etudiant1.getExamGrade(examen1, etudiant1,Instant.parse("2025-07-01T08:00:00Z"));
        assertEquals(noteJuillet,note1);
    }

    void get_cours_grade_at_instant_t_OK(){
        var notePROG2 = etudiant1.getCourseGrade(PROG2,etudiant1,Instant.parse("2025-10-01T08:00:00Z"));
        assertEquals(notePROG2,10);
    }
}