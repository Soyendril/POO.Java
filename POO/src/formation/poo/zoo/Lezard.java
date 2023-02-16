package formation.poo.zoo;

public class Lezard extends Reptile{
    private boolean regeneration;
    public Lezard(){
        super();
    }
    public Lezard(double poids, double taille, double temperature, boolean regeneration) {
        super(poids, taille, temperature);
        this.regeneration = regeneration;
    }

    public boolean isRegeneration() {
        return regeneration;
    }

    public void setRegeneration(boolean regeneration) {
        this.regeneration = regeneration;
    }

    public String toString() {
        return "Lezard{" +
                "regeneration=" + regeneration +
                ", temperature=" + temperature +
                ", poids=" + poids +
                ", taille=" + taille +
                '}';
    }
}
