package formation.poo.zoo;

public class Animal {
    protected double poids;
    protected double taille;

    public Animal() {
        System.out.println("creation d'un animal");
    }

    public Animal(double poids, double taille) {
        this.poids = poids;
        this.taille = taille;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "poids=" + poids +
                ", taille=" + taille +
                '}';
    }
}
