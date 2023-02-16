package formation.poo.zoo;

public class Reptile extends Animal{

    protected double temperature;
    public Reptile(){
        super();
    }
    public Reptile(double poids, double taille, double temperature) {
        super(poids, taille);
        this.temperature = temperature;
        System.out.println("creation d'un reptile");
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Reptile{" +
                "temperature=" + temperature +
                ", poids=" + poids +
                ", taille=" + taille +
                '}';
    }
}
