import java.util.Arrays;
public class Tableau {

    public static double maximum(double[] params){
        double max = params[0];
        for(double valeur: params){
            if (valeur > max){
                max = valeur;
            }
        }
        return max;
    }

    //Retourne la valeur moyenne d'un tableau de décimaux

    public static double moyenne(double[] valeurs){
        double somme = 0;
        for (double val: valeurs) {
            somme+= val;
        }
        return somme/valeurs.length;
    }
    /**
     * Tri un tableau de décimaux en utilisant l'alorithme du tri selection
     * @param valeurs un tableau de décimaux
     * @return le tableau trié
*/
    public static double[] triSimple(double[] valeurs){
        double[] result = new double[valeurs.length];
        for (int i = 0; i < valeurs.length; i++) {
            double min = valeurs[0];
            int minIndex = 0;
            for (int j = 0; j < valeurs.length; j++) {
                if(valeurs[j] < min){
                    min = valeurs[j];
                    minIndex = j;
                }
            }
            result[i] = min;
            valeurs[minIndex] = Double.MAX_VALUE;
        }
        return result;
    }

    // * Tri un tableau de décimaux en utilisant l'alorithme du tri bulle
    public static int[] triBulle(int[] valeurs){
        int nbchgt = 1;
        while (nbchgt>0){
            nbchgt =0;
            for (int i = 0; i < valeurs.length-1; i++) {
                if (valeurs[i] > valeurs[i + 1]) {
                    int x = valeurs[i];
                    int y = valeurs[i + 1];
                    valeurs[i] = y;
                    valeurs[i + 1] = x;
                    nbchgt++;
                }
            }
        }


        return valeurs;}
    public static void main(String[] args) {
        int[] t = new int[]{1,8,3,4,12,6,25,144,875,10,25,38,19,10};
       // System.out.println(t);
       // t[0] = Integer.MAX_VALUE;
       // System.out.println(t[0]);
        triBulle(t);
        System.out.println(Arrays.toString(t));


    }

}
