package formation.poo.societe;

import java.util.ArrayList;
import java.util.List;

public class Dev extends Salarie{

    private List<String> langages = new ArrayList<>();

    public Dev(){

    }
    public Dev(String nom, String prenom, double solde, double salaire, List<String> langages,Entreprise entreprise) {
        super(nom, prenom, solde, salaire,entreprise);
        this.langages = langages;
    }

    public List<String> getLangages() {
        return langages;
    }

    public void setLangages(List<String> langages) {
        this.langages = langages;
    }
    public void ajouterLangage(String langage){
        this.langages.add(langage);
    }
}
