package Bibliotheque;

public class Revue extends Document {
    private String periodicite; // mensuelle, hebdo...
    private int numero;

    public Revue(String titre, int annee, String periodicite, int numero) {
        super(titre, annee);
        this.periodicite = periodicite;
        this.numero = numero;
    }

    public String getPeriodicite() { return periodicite; }
    public int getNumero() { return numero; }
    public void setPeriodicite(String p) { this.periodicite = p; }
    public void setNumero(int n) { this.numero = n; }

    @Override
    public String toString() {
        return "Revue{num=" + getNumEnreg() + ", titre='" + getTitre() + "', annee=" + getAnnee() +
               ", periodicite='" + periodicite + "', numero=" + numero + "}";
    }
}
