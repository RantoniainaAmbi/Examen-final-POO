package com.app;

public class Cours {
    private int id;
    private String label;
    private int credits;
    private Enseignants enseignant;

    public Cours(int id, String label, int credits, Enseignants enseignant) {
        this.id = id;
        this.label = label;
        this.credits = credits;
        this.enseignant = enseignant;
    }
}
