package formation.poo.zoo;

public class Fourmis extends Insectes{

    private boolean piquante;
    public Fourmis(){
        super();
    }
    public Fourmis(double poids, double taille, Boolean necrophage, boolean piquante) {
        super(poids, taille, necrophage);
        this.piquante = piquante;
    }

    public boolean isPiquante() {
        return piquante;
    }

    public void setPiquante(boolean piquante) {

        this.piquante = piquante;
    }

    @Override
    public String toString() {
        return "Fourmis{" +
                "piquante=" + piquante +
                ", necrophage=" + necrophage +
                ", poids=" + poids +
                ", taille=" + taille +
                '}';
    }
}
