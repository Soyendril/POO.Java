package formation.poo.zoo;

public class Chien extends Mammifere{



    public Chien() {
        super();
    }

    public Chien(double poids, double taille, String couleurPelage) {
        super(poids, taille, couleurPelage);
    }

    private void aboiement(){
        System.out.println("ouaf ouaf");
    }

    @Override
    public String toString() {
        return "Chien{" +
                "couleurPelage='" + couleurPelage + '\'' +
                ", poids=" + poids +
                ", taille=" + taille +
                '}';
    }
}
