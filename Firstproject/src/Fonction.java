public class Fonction {


    public static void maFonction() {
        System.out.println("je suis une fonction");

    }
    public static void chat(String nom, String message) {
        System.out.println("[" + nom + "]:" + message);
    }
    public static String pourcentage( double a, double b) {
        String pourcent = (100*a/b)+"%";
        return pourcent;
    }
    public static void main(String[] args) {
        chat("Soyendril", "Yo les gars");
        System.out.println(pourcentage(25,35));

    }
}
