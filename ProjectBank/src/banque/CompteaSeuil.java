package banque;

public class CompteaSeuil extends Compte implements iCompteaSeuil {

    private double seuil;

    public CompteaSeuil(int numero, double solde) {
       this(numero,solde,0.);
    }

    public CompteaSeuil(int numero, double solde, double seuil) {
    }

    @Override
    public void retirer(double unMontant) {
        if(this.solde - unMontant<this.seuil){
            System.out.println("vous n'avez pas assez d'argent!");
        }else {
            this.solde-= unMontant;
            System.out.println("votre solde est de : "+solde);
        }

    }

    @Override
    public String toString() {
        return "CompteaSeuil{" +
                "seuil=" + seuil +
                ", solde=" + solde +
                '}';
    }
}
