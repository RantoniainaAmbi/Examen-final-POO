package com.app;

import java.time.Instant;

public class Examens {
    private int id;
    private String titre;
    private Cours cours;
    private Instant dateEtHeureDeLExamen;
    private int coefficient;

    public Examens(int id,String titre,Cours cours,Instant dateEtHeureDeLExamen,int coefficient) {
        this.id = id;
        this.titre = titre;
        this.cours = cours;
        this.dateEtHeureDeLExamen = dateEtHeureDeLExamen;
        this.coefficient = coefficient;
    }

    public Cours getCours() {
        return cours;
    }

    public int getCoefficient(){
        return coefficient;
    }
}
