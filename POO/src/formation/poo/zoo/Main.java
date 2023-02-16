package formation.poo.zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animaux = new ArrayList<>();
        animaux.add(new Chien(12.5,1.5,"marron"));
        animaux.add(new Chat());
        animaux.add(new Lezard());
        animaux.add(new Serpent());
        animaux.add(new Mouche());
        animaux.add(new Humain());
        System.out.println(animaux);
    }
}
