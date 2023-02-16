public class SwitchCase {
    public static void main(String[] args) {
       // menu();
        String etape =Outils.demande("Quelle est l'etape de votre repas?");
        switch(etape){
            case "entree":
                System.out.println("Entrée");
            case "plat":
                System.out.println("Plat");
            case "fromage":
                System.out.println("Fromage");
            case "dessert":
                System.out.println("Dessert");
        }
    }

    private static void menu() {
        System.out.println("les choix:");
        System.out.println("1: Afficher hello!");
        System.out.println("2: Afficher Salam!");
        System.out.println("3: Afficher Capybara");
        System.out.println("4: retour");

        String res = Outils.demande("?");
        /*if (res.equals("1")){
            System.out.println("Hello!");
        } else if (res.equals("2")) {
            System.out.println("Salam!");

        }else if (res.equals("3")) {
            System.out.println("Capybara!");
        }else{
            System.out.println("Retour!");
        }*/

        switch (res) {
            case "1":
                System.out.println("Hello!");
                break;
            case "2":
                System.out.println("Salam!");
                break;
            case "3":
                System.out.println("Capybara");
                break;
            case "4":
                System.out.println("retour");
                break;
            default:
                System.out.println("apprendre en programmer en PASCAL?");
                break;
        }
    }
}
