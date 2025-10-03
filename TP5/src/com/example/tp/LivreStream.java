package com.example.tp;

public class LivreStream extends Media {
    private String url;

    public LivreStream(String titre, String url) {
        super(titre);
        this.url = url;
    }

    @Override
    public void lire() {
        System.out.println("Démarrage du flux en direct : "
            + titre + " – " + url);
    }

    /** Durée non déterminée */
    @Override
    public int getDuree() {
        return -1;
    }
}