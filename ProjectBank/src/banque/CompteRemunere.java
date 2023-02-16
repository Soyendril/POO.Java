package banque;

import java.lang.reflect.Array;

public class CompteRemunere extends Compte implements ICompteRemunere {

    private double taux;








    public CompteRemunere() {
    }

    public CompteRemunere(int numero, double solde) {
        super(numero, solde);
    }

    public CompteRemunere(Array[] comptes) {
        super(comptes);
    }

    public CompteRemunere(double taux) {
        this.taux = taux;
    }

    public CompteRemunere(int numero, double solde, double taux) {
        super(numero, solde);
        this.taux = taux;
    }

    public CompteRemunere(Array[] comptes, double taux) {
        super(comptes);
        this.taux = taux;
    }

    @Override
    public double getTaux() {
        return taux;
    }

    @Override
    public void setTaux(double taux) {
        if(taux<0){
            System.out.println("le taux ne peut etre inferieur a 0%");
            this.taux=0.;
        }else if (taux>1){
            System.out.println("le taux ne peut etre superieur à 100%");
            this.taux=1.;
        }else{
            this.taux=taux;
        }
        this.taux = taux;
    }
    @Override
    public double calculerInterets(){
        this.solde*taux;

    }

}
