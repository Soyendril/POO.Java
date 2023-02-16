package formation.poo.vehicule;

public class Voiture extends Vehicule implements Amoteur{

    private int nbPlace;

    public Voiture() {
    }

    public Voiture(String marque, String modele, double nbKm, int nbPlace) {
        super(marque, modele, nbKm);
        this.nbPlace = nbPlace;
    }


    public int getNbPlace() {
        return nbPlace;
    }

    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "nbPlace=" + nbPlace +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", nbKm=" + nbKm +
                '}';
    }

    public void demarrer() {

    }

    public void arreter() {

    }
}
