package formation.poo.zoo;

public class Serpent extends Reptile{

    private boolean venimeux;
    public Serpent(){
        super();
    }
    public Serpent(double poids, double taille, double temperature, boolean venimeux) {
        super(poids, taille, temperature);
        this.venimeux = venimeux;
        System.out.println("création d'un serpent");
    }

    public boolean isVenimeux() {
        return venimeux;
    }

    public void setVenimeux(boolean venimeux) {
        this.venimeux = venimeux;
    }

    @Override
    public String toString() {
        return "Serpent{" +
                "venimeux=" + venimeux +
                ", temperature=" + temperature +
                ", poids=" + poids +
                ", taille=" + taille +
                '}';
    }
}
