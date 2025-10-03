package Bibliotheque;

public class Livre extends Document {
    private String auteur;
    private String isbn;

    public Livre(String titre, int annee, String auteur, String isbn) {
        super(titre, annee);
        this.auteur = auteur;
        this.isbn = isbn;
    }

    @Override
    public String getAuteur() { return auteur; }
    public String getIsbn() { return isbn; }

    public void setAuteur(String auteur) { this.auteur = auteur; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    @Override
    public String toString() {
        return "Livre{num=" + getNumEnreg() + ", titre='" + getTitre() + "', annee=" + getAnnee() +
               ", auteur='" + auteur + "', isbn='" + isbn + "'}";
    }
}