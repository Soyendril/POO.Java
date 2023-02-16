import java.util.InputMismatchException;
import java.util.Scanner;

public class Jeux {
    public static void main(String[] args) {
        menu();
    }



        private static void menu() {
            System.out.println("les choix de Jeu:");
            System.out.println("1: Jouer au pile ou face!");
            System.out.println("2: Jouer au Blackjack");
            System.out.println("3: Jouer au jeu de dés");
            System.out.println("4: Jouer au Tic Tac Toe ");
            System.out.println("5: Jouer au Nombre Mystère");
            System.out.println("6: Quitter");

            String res = Outils.demande("à quoi voulez vous jouer???");

            switch (res) {
                case "1":
                    pileouface();
                    break;
                case "2":
                    blackjack();
                    break;
                case "3":
                    jeudedes();
                    break;
                case "4":
                    tictactoefacile();
                    break;

                case "5":
                    nombremystere();
                    break;
                case "6":
                    return;
                default:
                    System.out.println("voulez vous apprendre en programmer en PASCAL?");
                    break;
            }


    }
    public static void pileouface() {
        System.out.println("Pile ou Face lancé");

        String res = Outils.demande("voulez vous jouer au pile ou face Y ou N?");

        switch (res) {
            case "Y":
                pileoufacelaunched();
                break;
            case "N":
                menu();
                break;
        }
    }
    public static void pileoufacelaunched() {

        System.out.println("Pile ou Face lancé");
        String demande = Outils.demande("Pile ou Face");
        int tiragejoueur = 0;
        switch (demande){
            case "Pile":
                tiragejoueur = 0;
                break;
            case "Face":
                tiragejoueur = 1;
                break;
            default:
                System.out.println("Veuillez n'entrer que Pile OU Face !");
                pileoufacelaunched();
        }
        int tirage = Outils.randInt(0,2);
        if (tirage == tiragejoueur){
            System.out.println(demande+" Bravo vous avez gagné!!");
            String rejouer = Outils.demande("Voulez vous rejouer ? Y ou N");
            switch (rejouer) {
                case "Y":
                    pileoufacelaunched();
                    break;
                case "N":
                    menu();
                    break;
            }

        }else{
            System.out.println("Dommage vous avez perdu!!");
            String rejouer = Outils.demande("Voulez vous rejouer ? Y ou N");
            switch (rejouer) {
                case "Y":
                    pileoufacelaunched();
                    break;
                case "N":
                    menu();
                    break;
            }

        }

    }
    public static void blackjack() {
        System.out.println("Blackjack lancé");

        String res = Outils.demande("voulez vous jouer au Blackjack Y ou N?");

        switch (res) {
            case "Y":
                blackjacklaunched();
                break;
            case "N":
                menu();
                break;
        }
    }
    public static void blackjacklaunched() {
        System.out.println("BlackJack lancé");
    }

    public static void jeudedes() {
        System.out.println("Jeu de Dés lancé");

        String res = Outils.demande("voulez vous jouer au Jeu de Dés Y ou N?");

        switch (res) {
            case "Y":
                jeudedeslaunched();
                break;
            case "N":
                menu();
                break;
        }
    }
    public static void jeudedeslaunched() {
        System.out.println("Jeu de Dés lancé");
    }

    public static void tictactoefacile() {
        System.out.println("Tic Tac Toe Facile lancé");

        String res = Outils.demande("voulez vous jouer au Tic Tac Toe Facile Y ou N?");

        switch (res) {
            case "Y":
                tictactoefacilelaunched();
                break;
            case "N":
                menu();
                break;
        }
    }
    public static void tictactoefacilelaunched() {
        System.out.println("Tic Tac Toe Facile lancé");

        Scanner in = new Scanner(System.in);
        Tictactoe.plateau = new String[9];
        Tictactoe.tour = "X";
        String winner = null;

        for (int a = 0; a < 9; a++) {
            Tictactoe.plateau[a] = String.valueOf(a + 1);
        }

        System.out.println("bienvenue sur le tic tac toe");
        Tictactoe.afficherplateau();

        System.out.println(
                "les X commencent la partie, veuillez entrer un numero d'emplacement");

        while (winner == null) {
            int numInput;

            // les cas d'erreur
            // numInput prends l'entrée de l'utilisateur entre 1 et 9.
            // si l'input n'est pas entre 1 et 9
            // le jeu va afficher une erreur
            try {
                numInput = in.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println(
                            "entrée incorrecte veuillez redonner un numéro d'emplacement compris entre 1 et 9");
                    continue;
                }
            }
            catch (InputMismatchException e) {
                System.out.println(
                        "entrée incorrecte veuillez redonner un numéro d'emplacement");
                continue;
            }


            // choix du tour
            if (Tictactoe.plateau[numInput - 1].equals(
                    String.valueOf(numInput))) {
                Tictactoe.plateau[numInput - 1] = Tictactoe.tour;

                if (Tictactoe.tour.equals("X")) {
                    Tictactoe.tour = "O";
                }
                else {
                    Tictactoe.tour = "X";
                }

                Tictactoe.afficherplateau();
                winner = Tictactoe.checkWinner();
            }
            else {
                System.out.println(
                        "la position est deja possédée, veuillez entrer un autre emplacment");
            }
        }

        // si aucun des deux joueurs ne gagne
        // on affiche égalitée.
        if (winner.equalsIgnoreCase("Egalitée")) {
            System.out.println(
                    "Egalitée! ");
            tictactoefacile();
        }

        // affichage du message de victoire
        else {
            System.out.println(
                    "Bravo! " + winner + " a gagné la partie");
            tictactoefacile();
        }




    }

    public static void nombremystere() {
        System.out.println("Nombre Mystère lancé");

        String res = Outils.demande("voulez vous jouer au Nombre Mystère Y ou N?");

        switch (res) {
            case "Y":
                nombremysterelaunched();
                break;
            case "N":
                menu();
                break;
        }
    }
    public static void nombremysterelaunched() {
        System.out.println("Nombre Mystère lancé");
        int mystere = Outils.randInt(1,100);

        int hp =10;
        int essai =0;
        boolean enjeu=true;



        while(enjeu){
            String demande = Outils.demande("Veuillez entrer un nombre compris entre 1 et 100:");
            if (mystere == Integer.parseInt(demande)){
                System.out.println("bravo vous avez trouvé le nombre mystère en "+essai+" tentatives");
                enjeu=false;

            }else if (mystere<Integer.parseInt(demande)&&hp>0){
                System.out.println("plus petit, il vous reste encore "+hp+" tentatives");
                hp--;
                essai++;

            }
            else if(mystere>Integer.parseInt(demande)&&hp>0){
                System.out.println("plus grand, il vous reste encore "+hp+" tentatives");
                hp--;
                essai++;

            }else{
                System.out.println("Perdu le nombre mystère etait: "+mystere);
                enjeu= false;
            }

        }

}








}

