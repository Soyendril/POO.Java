package banque;

import java.lang.reflect.Array;

/**
 * represente un Compte bancaire
 */
public class Compte implements ICompte {
    private int numero;

    protected double solde;

    private Array comptes[]= new Array[5];

    /**
     * Constructeur du compte bancaire avec un numéro qui doit etre unique, et un montant
     */
    public Compte() {

    }

    public Compte(int numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    public Compte(Array[] comptes) {
        this.comptes = comptes;
    }

    @Override
    public int getNumero() {
        return numero;
    }

    @Override
    public double getSolde() {
        return solde;
    }

    public double setSolde(){
        this.solde = solde;
    }

    /**
     * ajoute unMontant au solde du compte.
     * il est possible de retirer unMontant au solde si la valeur de unMontant est négative.
     * dans ce cas on preferera utiliser la méthode retirer(unMontant).
     * @param unMontant
     */
    @Override
    public void ajouter(double unMontant){
        this.solde+=unMontant;


    }
    @Override
    public void retirer(double unMontant){
        this.solde-=unMontant;

    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Compte{" +
                "numero=" + numero +
                ", solde=" + solde +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Compte compte = (Compte) object;
        return numero == compte.numero && solde == compte.solde;
    }


}
