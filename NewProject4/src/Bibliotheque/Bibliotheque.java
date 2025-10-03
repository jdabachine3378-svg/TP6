package Bibliotheque;


public class Bibliotheque {
    private Document[] docs;
    private int n; 
    public Bibliotheque(int capacite) {
        if (capacite <= 0) capacite = 5;
        this.docs = new Document[capacite];
        this.n = 0;
    }

    public void afficherDocuments() {
        if (n == 0) {
            System.out.println("(aucun document)");
            return;
        }
        for (int i = 0; i < n; i++) System.out.println(docs[i]);
    }

    public boolean ajouter(Document doc) {
        if (doc == null) return false;
        if (n == docs.length) {
            Document[] tmp = new Document[docs.length * 2];
            System.arraycopy(docs, 0, tmp, 0, docs.length);
            docs = tmp;
        }
        docs[n++] = doc;
        return true;
    }

    public boolean supprimer(Document doc) {
        if (doc == null) return false;
        for (int i = 0; i < n; i++) {
            if (docs[i].getNumEnreg() == doc.getNumEnreg()) {
                for (int j = i; j < n - 1; j++) docs[j] = docs[j + 1];
                docs[--n] = null;
                return true;
            }
        }
        return false;
    }

    public Document document(int numEnreg) {
        for (int i = 0; i < n; i++) {
            if (docs[i].getNumEnreg() == numEnreg) return docs[i];
        }
        return null;
    }

    public void afficherAuteurs() {
        boolean found = false;
        for (int i = 0; i < n; i++) {
            String auteur = docs[i].getAuteur();
            if (auteur != null && !auteur.isEmpty()) {
                System.out.println("- " + auteur + " (doc #" + docs[i].getNumEnreg() + ")");
                found = true;
            }
        }
        if (!found) System.out.println("(aucun auteur à afficher)");
    }
}