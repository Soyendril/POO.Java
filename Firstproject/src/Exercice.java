public class Exercice {
    public static void spam(int nombre,String texte) {
        for (int compteur=0; compteur< nombre;compteur+=1){

            System.out.println(texte);
        }


    }

    public static boolean bisextile(int annee) {
        if (annee % 4 == 0 && annee % 100 != 0) {
            return true;
        }else if(annee%400 == 0){
            return true;
        }else{
            return false;
        }

    }


    public static void fizzbuzz (int n,int fizz, int buzz){
        for (int compteur=1; compteur<= n;compteur+=1)
        {
            if ((compteur % fizz) == 0 && (compteur % buzz) == 0)
            {
                System.out.println("Fizzbuzz");}
            else if (compteur%fizz == 0)
            {
                System.out.println("Fizz");}
            else if (compteur%buzz== 0)
            {
                System.out.println(("Buzz"));}
            else
            {
                System.out.println(compteur);}
        }
    }

    public static void pyramidecroissante(int nombre) {
        for (int compteurligne = 0; compteurligne <= nombre; compteurligne += 1) {
            for (int compteuretoile = 0; compteuretoile < compteurligne; compteuretoile++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
   /*  public static void pyramidedecroissante(int nombre2){
        for (int compteurligne = nombre2;compteurligne>=0; compteurligne -=1){
            for( int compteuretoile = nombre2; compteuretoile>compteurligne;compteuretoile--){
                System.out.print("*");
            }
            System.out.println();
        }
    }*/

    public static void pyramideDecroissante(int taille){
        for (int i=taille; i>0; i--){
            for(int niveau=0; niveau < i; niveau++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        spam(1,"test");
        boolean res=bisextile(2024);
        System.out.println(res);
        fizzbuzz(10,2,5);
        pyramidecroissante(10);
        pyramideDecroissante(10);
    }

}
