package formation.poo.vehicule;

import java.util.ArrayList;
import java.util.List;

public class Parking {

private List<Vehicule> vehicules =new ArrayList<>();

public void garer(Vehicule vehicule){
    this.vehicules.add(vehicule);
}

public void sortir(Vehicule vehicule){
    this.vehicules.remove(vehicule);
}

public void listerVehicule(){
    for (Vehicule v:this.vehicules) {
        System.out.println(v);

    }
}

    @Override
    public String toString() {
        return "Parking{" +
                vehicules +
                '}';
    }
}