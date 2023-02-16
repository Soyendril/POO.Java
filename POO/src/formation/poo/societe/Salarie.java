package formation.poo.societe;

import java.util.Objects;

public class Salarie extends Personne {

    private Personne personne;
    private double salaire;
    protected  Entreprise entreprise;

    public Salarie(){

    }

    public Salarie(Personne personne,double salaire,Entreprise entreprise){
        this.personne=personne;
        this.salaire=salaire;
        this.entreprise= entreprise;
    }

    public Salarie(String nom, String prenom, double solde, double salaire,Entreprise entreprise) {
        this.personne= new Personne(nom,prenom,solde);
        this.salaire = salaire;
        this.entreprise = entreprise;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {

        this.salaire = salaire;
    }

    @Override
    public String getNom() {
        return personne.getNom();
    }

    @Override
    public void setNom(String nom) {
        personne.setNom(nom);
    }

    @Override
    public String getPrenom() {
        return personne.getPrenom();
    }

    @Override
    public void setPrenom(String prenom) {
        personne.setPrenom(prenom);
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    @Override
    public double getSolde() {
        return personne.getSolde();
    }

    @Override
    public void setSolde(double solde) {
        personne.setSolde(solde);
    }

    public void travailler(){
        System.out.println("je travaille!");
    }

    public void recevoirSalaire(){
        System.out.println("Jour de paye ! j'ai touché"+this.salaire);
        this.solde+=salaire;

    }
    @Override
    public String toString() {
        return "Salarie{" +
                "salaire=" + this.salaire +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if ( other instanceof Personne ){
            return this.personne== other;
        }
        return false;
    }

}
