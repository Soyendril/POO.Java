package formation.poo.societe;

public class RH extends Salarie{

    public RH() {
    }

    public RH(String nom, String prenom, double solde, double salaire,Entreprise entreprise) {
        super(nom, prenom, solde, salaire,entreprise);
    }

    public Salarie recruter(Personne personne){
        return new Salarie(personne,1785.25,this.entreprise);









    }
}
