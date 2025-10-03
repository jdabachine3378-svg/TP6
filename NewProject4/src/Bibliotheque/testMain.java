package Bibliotheque;



 
      import java.util.Scanner;

public class testMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Capacité initiale de la bibliothèque ? ");
        int cap = safeInt(sc);
        Bibliotheque biblio = new Bibliotheque(cap);

        biblio.ajouter(new Livre("Clean Code", 2008, "Robert C. Martin", "9780132350884"));
        biblio.ajouter(new Revue("Science & Vie", 2024, "Mensuelle", 1278));

        int choix;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Ajouter document");
            System.out.println("2. Afficher tous les documents");
            System.out.println("3. Supprimer document (par numEnreg)");
            System.out.println("4. Rechercher document (par numEnreg)");
            System.out.println("5. Afficher auteurs");
            System.out.println("0. Quitter");
            System.out.print("Votre choix: ");
            choix = safeInt(sc);

            switch (choix) {
                case 1 -> ajouterDepuisClavier(sc, biblio);
                case 2 -> biblio.afficherDocuments();
                case 3 -> {
                    System.out.print("numEnreg à supprimer: ");
                    int num = safeInt(sc);
                    var doc = biblio.document(num);
                    boolean ok = biblio.supprimer(doc);
                    System.out.println(ok ? "Supprimé." : "Introuvable.");
                }
                case 4 -> {
                    System.out.print("numEnreg à chercher: ");
                    int num = safeInt(sc);
                    var d = biblio.document(num);
                    System.out.println(d == null ? "Introuvable." : d);
                }
                case 5 -> biblio.afficherAuteurs();
                case 0 -> System.out.println("Au revoir!");
                default -> System.out.println("Choix invalide.");
            }
        } while (choix != 0);

        sc.close();
    }

    private static void ajouterDepuisClavier(Scanner sc, Bibliotheque biblio) {
        System.out.println("Type de document ? (1= Livre, 2= Revue)");
        int type = safeInt(sc);
        sc.nextLine(); // flush

        System.out.print("Titre: ");
        String titre = sc.nextLine();
        System.out.print("Année: ");
        int annee = safeInt(sc);

        switch (type) {
            case 1 -> {
                System.out.print("Auteur: ");
                sc.nextLine();
                String auteur = sc.nextLine();
                System.out.print("ISBN: ");
                String isbn = sc.nextLine();
                biblio.ajouter(new Livre(titre, annee, auteur, isbn));
            }
            case 2 -> {
                System.out.print("Périodicité: ");
                sc.nextLine();
                String per = sc.nextLine();
                System.out.print("Numéro: ");
                int num = safeInt(sc);
                biblio.ajouter(new Revue(titre, annee, per, num));
            }
            default -> System.out.println("Type inconnu.");
        }
    }

    private static int safeInt(Scanner sc) {
        while (!sc.hasNextInt()) { sc.next(); System.out.print("Entrez un nombre: "); }
        return sc.nextInt();
    }
}