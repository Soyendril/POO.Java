package banque;

public class CompeteaSeuilRemunere extends CompteRemunere implements iCompteaSeuil{
    private double seuil;

    public CompeteaSeuilRemunere(double seuil) {
        this.seuil = seuil;
    }

    public CompeteaSeuilRemunere(int numero, double solde, double seuil) {
        super(numero, solde);
        this.seuil = seuil;
    }

    public CompeteaSeuilRemunere(double taux, double seuil) {
        super(taux);
        this.seuil = seuil;
    }

    public CompeteaSeuilRemunere(int numero, double solde, double taux, double seuil) {
        super(numero, solde, taux);
        this.seuil = seuil;
    }

    public double getSeuil() {
        return seuil;
    }

    public void setSeuil(double seuil) {
        this.seuil = seuil;
    }
    public void retirer(double unMontant) {
        if(this.solde - unMontant<this.seuil){
            System.out.println("vous n'avez pas assez d'argent!");
        }else {
            this.solde-= unMontant;
            System.out.println("votre solde est de : "+solde);
        }

    }
}
