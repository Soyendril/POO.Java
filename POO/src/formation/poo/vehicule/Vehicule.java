package formation.poo.vehicule;

public class Vehicule {
    protected String marque;

    protected String modele;

    protected double nbKm;

    public Vehicule() {
    }

    public Vehicule(String marque, String modele, double nbKm) {
        this.marque = marque;
        this.modele = modele;
        this.nbKm = nbKm;
    }

    public String getMarque() {
        return marque;
    }



    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public double getNbKm() {
        return nbKm;
    }

    public void setNbKm(double nbKm) {
        this.nbKm = nbKm;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "marque='" + this.marque + '\'' +
                ", modele='" + this.modele + '\'' +
                ", nbKm=" + this.nbKm +
                '}';
    }
}
