package com.example.tp;

public class MediaLibrary {
    private Media[] items = new Media[4];
    private int     count = 0;

    /** Ajoute un média, agrandit le tableau si nécessaire */
    public void add(Media m) {
        if (count == items.length) {
            Media[] tmp = new Media[items.length * 2];
            System.arraycopy(items, 0, tmp, 0, items.length);
            items = tmp;
        }
        items[count++] = m;
    }

    /** Joue tous les médias via polymorphisme */
    public void playAll() {
        System.out.println("=== Lecture de la bibliothèque ===");
        for (int i = 0; i < count; i++) {
            items[i].lire();
        }
    }

    /** Calcule la durée totale (ignore les -1) */
    public int totalDuration() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            int d = items[i].getDuree();
            if (d > 0) sum += d;
        }
        return sum;
    }
}