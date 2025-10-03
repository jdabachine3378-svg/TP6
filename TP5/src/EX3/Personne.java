package EX3;

 /**
  * Classe abstraite représentant une personne salariée.
  */
public abstract class Personne {
    protected final String nom;
    protected final double salaireBase;

    public Personne(String nom, double salaireBase) {
        this.nom = nom;
        this.salaireBase = salaireBase;
    }

    /**
     * Calcule le salaire effectif, selon le type de personne.
     * @return salaire net
     */
    public abstract double calculerSalaire();

    /** Affiche le rôle, le nom et le salaire calculé. */
    public void affiche() {
        System.out.printf(
            "Je suis %s, salaire = %.2f%n",
            nom, calculerSalaire()
        );
    }
}