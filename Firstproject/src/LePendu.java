import java.sql.SQLOutput;

public class LePendu {
    public static void Pendu(){
        boolean erreur = true;
        //creation du mot a deviner
        String mot ="TonTon";
        boolean isGameEnded = false;
        String reponse ="______";
        int hp = 10;
        while (isGameEnded){
            String input = Outils.demande("Entrez une lettre");
            if (input.length()!=1){
                System.out.println("vous devez entrer une seule lettre");
            }
            else {

                for (int i = 0; i < mot.length(); i++) {
                    String lettre = "" + mot.charAt(i);
                    if (lettre.toLowerCase().equals(input.toLowerCase())) {
                        reponse = reponse.substring(0, i) + lettre + reponse.substring(i + 1);
                        erreur =false;

                    }
                }
                if (erreur) {
                    hp--;
                }
                erreur=true;


                }
                System.out.println("il vous reste " + hp + " vie");
                System.out.println(reponse);


                if (hp <= 0) {
                    System.out.println("Perdu le mot à trouver etait " + mot);
                    isGameEnded = true;
                }
                if (!reponse.contains("_")) {
                    System.out.println("Bravo!!");
                    isGameEnded = true;
                }
            }
        }





    public static void main(String[] args) {
        Pendu();

    }
}





