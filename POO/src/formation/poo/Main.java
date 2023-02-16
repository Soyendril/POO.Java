package formation.poo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Personne p = new Personne("Truc", "Jean",1.70);
        p.afficher();
        Personne p2 = new Personne("Machin","Michel",1.88);
        p2.afficher();
        System.out.println(p.getNom());

        Voiture voiture1 = new Voiture("Renault","Megane");
        voiture1.rouler(165_000.850);
        voiture1.afficher();

        Temperature temp =new Temperature();
        temp.setFahrenheit(50);
        System.out.println(temp.getCelsius());
        Temperature temp2 =new Temperature();
        temp2.setFahrenheit(50);
        System.out.println(temp == temp2);
        System.out.println(temp);
        System.out.println("message" + temp);

        Produit produit1 =new Produit();
        Produit nutella =new Produit("Nutella",5.95,2);
        Produit crepes = new Produit("crepes",0.95,25);
        produit1.setNom("shampoo");
        produit1.setPrixUnitaire(1.25);
        produit1.setQuantite(15);
        System.out.println(produit1);

        Commande commande1 =new Commande();
        commande1.addProduit(nutella);
        commande1.addProduit(crepes);
        commande1.addProduit(produit1);
        System.out.println(commande1);



        System.out.println(commande1);



    }

}
