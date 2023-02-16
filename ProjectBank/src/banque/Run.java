package banque;

public class Run {
    public static void main(String[] args) {
        Client client =new Client("RAKKASSY","Souleymane",29,1);
        Compte compte = new Compte(1,550);
        Compte compte1 =client.getCompte(1);
        client.ajouterCompte(compte);
        System.out.println(client.getCompte(1));
        client.ajouterCompte(new Compte(2,1850));
        System.out.println(client);





    }
}
