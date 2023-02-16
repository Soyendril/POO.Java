package formation.poo.societe;

public class Main {
    public static void main(String[] args) {

        Personne personne1 = new Personne("RAKKASSY","Souleymane",0);
        Entreprise monEntreprise =new Entreprise(personne1);
        RH rh = new RH("Couvreur","Kathia",6500,1550.75,monEntreprise);
        Salarie s =rh.recruter(personne1);
        System.out.println(s.equals(personne1));
        System.out.println("nom: "+s.getNom()+", prenom: "+s.getPrenom()+", salaire: "+s.getSalaire()+" entreprise:"+s.getEntreprise());





    }
}
