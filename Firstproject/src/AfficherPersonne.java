public class AfficherPersonne {
    public static void main(String[] args) {
        String firstname = "souleymane";
        String lastname = "RAKKASSY";
        int age = 29;
        double height = 1.87;

        Outils.afficher("je suis:");
        Outils.afficher(firstname);
        Outils.afficher(lastname);
        Outils.afficher("j'ai "+ age + " ans");
        Outils.afficher("je mesure "+height +"m");


    }
}
