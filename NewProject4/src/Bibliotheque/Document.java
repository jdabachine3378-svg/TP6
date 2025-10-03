package Bibliotheque;

public class Document {
    private static int compteur = 0;     // auto-incr
    private final int numEnreg;
    private String titre;
    private int annee;

    public Document(String titre, int annee) {
        this.numEnreg = ++compteur;
        this.titre = titre;
        this.annee = annee;
    }

    public int getNumEnreg() { return numEnreg; }
    public String getTitre() { return titre; }
    public int getAnnee() { return annee; }

    public void setTitre(String titre) { this.titre = titre; }
    public void setAnnee(int annee) { this.annee = annee; }

  
    public String getAuteur() { return null; }

    @Override
    public String toString() {
        return "Document{num=" + numEnreg + ", titre='" + titre + "', annee=" + annee + "}";
    }
}