import java.util.Random;
import java.util.Scanner;

public class Outils {

    public static void afficher(String message){

        System.out.println(message);
    }

    public static void afficher(String... messages){

        System.out.println(messages);
        for (String msg:messages){
            System.out.print(msg+" ");

        }
    }

    public static void afficher(int valeur){
        System.out.println(valeur);
    }

    public static void afficher(double valeur){
        System.out.println(valeur);
    }

    public static void afficher(boolean valeur){
        System.out.println(valeur);
    }

    public static String demande(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String demande(String message){
        System.out.println(message);
        return demande();
    }

    public static int demandeInt(){
        System.out.println();
        return Integer.parseInt(demande());
    }

    public static int demandeInt(String valeur){
        System.out.println(valeur);
        return demandeInt();
    }

    public static double demandeDouble(){

        return Double.parseDouble(demande());
    }

    public static double demandeDouble(String message){
        System.out.println(message);
        return Double.parseDouble(demande());
    }


    public static boolean demandeBoolean(String message){
        String resmessage=demande(message);
        if(resmessage.toLowerCase().equals( "true")|| resmessage.toLowerCase().equals("vrai")) {
            return true;
        }
        else if (resmessage.toLowerCase().equals("false")||resmessage.toLowerCase().equals("faux")) {
            return false;
        }
        else{
            System.out.println("ceci n'est pas un boolean");
            return demandeBoolean(message);

        }
    }

    public static int randInt(int maximum){

        return new Random().nextInt(maximum);
    }

    public static int randInt (int min,int max){

        return new Random().nextInt(min,max);
    }





    public static void main(String[] args) {
        //boolean res =demandeBoolean("entrez un boolean");
        //System.out.println(res);
        //afficher("salut","comment","vas","tu","?");
        for (int i = 0; i < 100; i++) {
            System.out.println(randInt(100));

        }

    }
}
