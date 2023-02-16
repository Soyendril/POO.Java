import java.util.Arrays;

public class Array {

    public static double[] tableau = new double[]{66, 13, 4, 47, 89, 58, 38, 94, 78, 30, 43, 20, 12, 80, 51, 6, 83, 55, 3,
            18, 11, 87, 64, 21, 2, 37, 31, 45, 54, 5, 40, 16, 72, 67, 14, 15, 42, 26, 93, 77, 98, 91, 19, 85, 53,
            52, 90, 97, 23, 68, 29, 22, 33, 82, 7, 70, 57, 75, 99, 73, 36, 79, 50, 88, 65, 48, 62, 32, 28, 95, 76,
            61, 34, 84, 92, 56, 9, 39, 46, 86, 10, 35, 27, 74, 24, 25, 17, 81, 49, 96, 63, 69, 71, 59, 44, 41,
            60, 8};

    public static void minmax(double[] valeurs){
        double valMin = valeurs[0];
        double valMax = valeurs[0];
        double somme = 0;

        for (double valeur:valeurs) {
            somme+= valeur;
            if(valeur >valMax){
                valMax= valeur;
            } else if (valeur<valMin){
                valMin= valeur;
            }
        }
        double moy =somme/valeurs.length;

        System.out.println("valeur maximum du tableau "+valMax);
        System.out.println("valeur minimum du tableau "+valMin);
        System.out.println("valeur moyenne du tableau "+moy);

        }

    public static double[] triSimple(double[] valeurs){
        double[] resultat = new double[valeurs.length];
        for (int i = 0; i < valeurs.length ; i++) {
            double min =valeurs[0];
            int minIndex =0;
            for (int j =0; j<valeurs.length; j++){
                if(valeurs[j]<min){
                    minIndex=j;
                    min= valeurs[j];
                }
            }
            resultat[i]=min;
            valeurs[minIndex]= Double.MAX_VALUE;
        }
        System.out.println(resultat);
        return valeurs;
    }





    public static void main(String[] args) {
        String[] monTableau = new String[]{"salut","Hello","Hi","Hallo","Salam"
        };
        System.out.println(monTableau[0]);
        monTableau[1] = "toto mange des pommes";
        System.out.println(monTableau[1]);
        System.out.println(monTableau);
        for (String message: monTableau) {
            System.out.println(message);
        }
        System.out.println(monTableau.length);
        int[] nombres =new int[]{1,2,3,4,5};

        String[] strs = new String[5];
        for (String str:strs){
            if (str==null){
                System.out.println("vide");
            }
            }
        minmax(tableau);
        triSimple(tableau);
        System.out.println(Arrays.toString(tableau));


    }
}


