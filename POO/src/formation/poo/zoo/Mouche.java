package formation.poo.zoo;

public class Mouche extends Insectes{
    private boolean chiant;
    public Mouche(){
        super();
    }
    public Mouche(double poids, double taille, Boolean necrophage, boolean chiant) {
        super(poids, taille, necrophage);
        this.chiant = chiant;
    }

    public boolean isChiant() {
        return chiant;
    }

    public void setChiant(boolean chiant) {
        this.chiant = chiant;
    }

    public String toString() {
        return "Mouche{" +
                "chiant=" + chiant +
                ", necrophage=" + necrophage +
                ", poids=" + poids +
                ", taille=" + taille +
                '}';
    }
}
