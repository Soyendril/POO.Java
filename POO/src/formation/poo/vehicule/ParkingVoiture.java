package formation.poo.vehicule;
import formation.poo.Produit;

import java.util.ArrayList;
import java.util.List;

public class ParkingVoiture {

    private List<Voiture> voitures = new ArrayList<>();


    public ParkingVoiture(){
    }

    public ParkingVoiture(List<Voiture>voitures){
        this.voitures = voitures;
    }
}
