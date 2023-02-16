package formation.poo.zoo;

public class Mammifere extends Animal{

    protected String couleurPelage;

    public Mammifere() {
        super();
    }

    public Mammifere(double poids, double taille, String couleurPelage) {
        super(poids, taille);
        this.couleurPelage = couleurPelage;
    }

    public String getCouleurPelage() {
        return couleurPelage;
    }

    public void setCouleurPelage(String couleurPelage) {
        this.couleurPelage = couleurPelage;
    }

    @Override
    public String toString() {
        return "Mammifere{" +
                "couleurPelage='" + couleurPelage + '\'' +
                ", poids=" + poids +
                ", taille=" + taille +
                '}';
    }
}
