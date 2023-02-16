package formation.poo.societe;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Salarie{
    private List<Salarie>equipe =new ArrayList<>();

    public Manager(){

    }

    public Manager(String nom, String prenom, double solde, double salaire, List<Salarie> equipe,Entreprise entreprise) {
        super(nom, prenom, solde, salaire,entreprise);
        this.equipe = equipe;
    }

    public List<Salarie> getEquipe() {
        return equipe;
    }

    public void setEquipe(List<Salarie> equipe) {
        this.equipe = equipe;
    }
}
