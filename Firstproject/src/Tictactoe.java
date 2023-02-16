import java.util.*;
public class Tictactoe {



        public static String[] plateau;
        public static String tour;


        // CheckWinner permet de savoir qui a gagner en verifiant les possibilités de victoire
        //avec le switch case suivant:
        //0 la premiere ligne, 1 la deuxieme ligne, 2 la troisieme ligne
        //3 la premiere colonne, 4 la deuxieme colonne, 5 la derniere colonne
        //6 la diagonale commencant en haut a gauche ou 7  celle commencant en haut a droite
        public static String checkWinner()
        {
            for (int i = 0; i < 8; i++) {
                String ligne = null;

                switch (i) {
                    case 0:
                        ligne = plateau[0] + plateau[1] + plateau[2];
                        break;
                    case 1:
                        ligne = plateau[3] + plateau[4] + plateau[5];
                        break;
                    case 2:
                        ligne = plateau[6] + plateau[7] + plateau[8];
                        break;
                    case 3:
                        ligne = plateau[0] + plateau[3] + plateau[6];
                        break;
                    case 4:
                        ligne = plateau[1] + plateau[4] + plateau[7];
                        break;
                    case 5:
                        ligne = plateau[2] + plateau[5] + plateau[8];
                        break;
                    case 6:
                        ligne = plateau[0] + plateau[4] + plateau[8];
                        break;
                    case 7:
                        ligne = plateau[2] + plateau[4] + plateau[6];
                        break;
                }
                //si les X gagnent
                if (ligne.equals("XXX")) {
                    return "X";
                }

                // si les O Gagnent
                else if (ligne.equals("OOO")) {
                    return "O";
                }
            }

            for (int i = 0; i < 9; i++) {
                if (Arrays.asList(plateau).contains(
                        String.valueOf(i + 1))) {
                    break;
                }
                else if (i == 8) {
                    return "Egalitée";
                }
            }

            // Afficher les X/O sur le plateau.
            System.out.println("c'est le tour de "+tour +" veuillez entrer un numero d'emplacement pour placer le: " + tour );
            return null;
        }



        public static void afficherplateau()
        {
            System.out.println("|___.___.___|");
            System.out.println("| " + plateau[0] + " | " + plateau[1] + " | " + plateau[2] + " |");
            System.out.println("|-----------|");
            System.out.println("| " + plateau[3] + " | " + plateau[4] + " | " + plateau[5] + " |");
            System.out.println("|-----------|");
            System.out.println("| " + plateau[6] + " | " + plateau[7] + " | " + plateau[8] + " |");
            System.out.println("|___.___.___|");
        }

        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            plateau = new String[9];
            tour = "X";
            String winner = null;

            for (int a = 0; a < 9; a++) {
                plateau[a] = String.valueOf(a + 1);
            }

            System.out.println("bienvenue sur le tic tac toe");
            afficherplateau();

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
                if (plateau[numInput - 1].equals(
                        String.valueOf(numInput))) {
                    plateau[numInput - 1] = tour;

                    if (tour.equals("X")) {
                        tour = "O";
                    }
                    else {
                        tour = "X";
                    }

                    afficherplateau();
                    winner = checkWinner();
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
            }

            // affichage du message de victoire
            else {
                System.out.println(
                        "Bravo! " + winner + " a gagné la partie");
            }
            in.close();
        }
    }


