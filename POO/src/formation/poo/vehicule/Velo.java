package formation.poo.vehicule;

public class Velo extends Vehicule {


    private int nbPlateau;

    public Velo() {
    }

    public Velo(String marque, String modele, double nbKm, int nbPlateau) {
        super(marque, modele, nbKm);
        this.nbPlateau = nbPlateau;
    }

    public int getNbPlateau() {
        return nbPlateau;
    }

    public void setNbPlateau(int nbPlateau) {
        this.nbPlateau = nbPlateau;
    }


}
