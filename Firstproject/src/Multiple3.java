public class Multiple3 {
    public static void main(String[] args) {
        int nombre = 0;
        while(nombre < 100){
            if (nombre % 3 == 0){
                System.out.println(nombre +" est divisible par 3");
            }else {
                System.out.println(nombre + " n'est pas divisible par 3");
            }
            nombre+=1;
        }

//          Meme version mais avec la boucle for


        for (int nombre2 = 0; nombre2 <100; nombre2++){
            if (nombre2 % 3 == 0){
                System.out.println(nombre2 +" est divisible par 3");
            }else {
                System.out.println(nombre2 + " n'est pas divisible par 3");
            }
        }

    }
}
