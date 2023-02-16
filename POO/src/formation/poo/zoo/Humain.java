package formation.poo.zoo;

public class Humain extends Mammifere{
    private void crier(){
        System.out.println("MERDE !!!");
    }
    public Humain(){
        super();
    }

    public Humain(double poids, double taille, String couleurPelage) {

        super(poids, taille, couleurPelage);
    }

    @Override
    public String toString() {
        return "Humain{" +
                "couleurPelage='" + couleurPelage + '\'' +
                ", poids=" + poids +
                ", taille=" + taille +
                '}';
    }
}

