package formation.poo.vehicule;

import formation.poo.zoo.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Voiture voiture1 = new Voiture("OPEL","ADAM",158_057.25,5);
        Camion camion1 = new Camion("Mercedes","Astric",158_541,7.85);
        Parking tropCher = new Parking();
        tropCher.garer(voiture1);
        tropCher.garer(camion1);
        tropCher.listerVehicule();
        System.out.println(tropCher);
        tropCher.sortir(voiture1);
        System.out.println(tropCher);

        List<Amoteur>aMoteurs =new ArrayList<>();
        aMoteurs.add(new Voiture());
        aMoteurs.add(new Camion());
    }
}
