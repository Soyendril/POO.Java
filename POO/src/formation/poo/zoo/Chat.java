package formation.poo.zoo;

public class Chat extends Mammifere{

    private void miauler(){

        System.out.println("MIAOUUU");
    }

    public Chat(){
        super();
    }
    public Chat(double poids, double taille, String couleurPelage) {
        super(poids, taille, couleurPelage);
    }

    @Override
    public String toString() {
        return "Chat{" +
                "couleurPelage='" + couleurPelage + '\'' +
                ", poids=" + poids +
                ", taille=" + taille +
                '}';
    }
}
