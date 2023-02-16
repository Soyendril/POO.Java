package formation.poo.zoo;

public class Insectes extends Animal{

    protected Boolean necrophage;
    public Insectes(){
        super();
    }
    public Insectes(double poids, double taille, Boolean necrophage) {
        super(poids, taille);
        this.necrophage = necrophage;
    }

    public Boolean getNecrophage() {
        return necrophage;
    }

    public void setNecrophage(Boolean necrophage) {

        this.necrophage = necrophage;
    }

    public String toString() {
        return "Insectes{" +
                "necrophage=" + necrophage +
                ", poids=" + poids +
                ", taille=" + taille +
                '}';
    }
}
