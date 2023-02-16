package formation.poo.societe;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {

    private List<Salarie> salaries =new ArrayList<>();
    Personne directeur;

    public Entreprise(Personne directeur) {
        this.directeur = directeur;
    }

    public Entreprise() {
    }

    public List<Salarie> getSalaries() {
        return salaries;
    }

    public void setSalaries(List<Salarie> salaries) {
        this.salaries = salaries;
    }




    private void verserSalaire(){
        //pour chaque Salarie salarie dans la liste salaries
        for (Salarie salarie:this.salaries) {
            salarie.recevoirSalaire();

        }


    };

    private void virer(Salarie salarie){
        this.salaries.remove(salarie);
    }

    private void recruter(Salarie salarie){
        this.salaries.add(salarie);

    }
    public void ajoutSalarie(Salarie salarie){
        this.salaries.add(salarie);
    }
}
