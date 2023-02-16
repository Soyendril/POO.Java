package formation.poo;

public class Voiture {

    private String marque ="";

    private String modele="";

    private double nbkm=0;


    Voiture(String marque, String modele, double nbkm) {
        this.marque = marque;
        this.modele = modele;
        this.nbkm = nbkm;
    }

    public Voiture() {
    }
    public Voiture(String marque, String modele) {
        this.marque = marque;
        this.modele = modele;
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

    public double getNbkm() {
        return nbkm;
    }

    public void setNbkm(double nbkm) {
        this.nbkm = nbkm;
    }

    public void rouler(double km){
        this.nbkm+=km;


    }
    public void afficher(){
        System.out.println(this.marque+" "+this.modele+" "+this.nbkm+" km");
    }
}
