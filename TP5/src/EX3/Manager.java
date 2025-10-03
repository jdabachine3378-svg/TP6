package EX3;

import EX3.Personne;

 /**
  * Manager avec prime de 30%.
  */
public class Manager extends Personne {
    public Manager(String nom, double salaireBase) {
        super(nom, salaireBase);
    }

    @Override
    public double calculerSalaire() {
        return salaireBase * 1.30;  // +30%
    }
}