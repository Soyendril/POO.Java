package formation.poo.vehicule;

public class Camion extends Vehicule implements Amoteur{

    private double tailleRemorque;

    public Camion() {
    }

    public Camion(String marque, String modele, double nbKm, double tailleRemorque) {
        super(marque, modele, nbKm);
        this.tailleRemorque = tailleRemorque;
    }

    public double getTailleRemorque() {
        return tailleRemorque;
    }

    public void setTailleRemorque(double tailleRemorque) {
        this.tailleRemorque = tailleRemorque;
    }

    public String toString() {
        return "Camion{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", nbKm=" + nbKm +
                ", tailleRemorque=" + tailleRemorque +
                '}';
    }

    public void demarrer() {

    }

    public void arreter() {

    }
}
