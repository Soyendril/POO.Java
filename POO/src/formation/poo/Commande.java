package formation.poo;

import java.util.ArrayList;
import java.util.List;

public class Commande {
    private List<Produit> produits = new ArrayList<>();

    public Commande(){}

    public Commande(List<Produit>produits){
        this.produits = produits;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public double getPrixTotal(){
        double total =0;
        for (Produit produit:this.produits) {
            total+=produit.getPrix();



        }
        return total;
    }

    public int getNbArticleTotal(){
        int quantite=0;
        for (Produit produit:this.produits) {
            quantite+=produit.getQuantite();

        }
        return quantite;
    }

    public void addProduit(Produit produit){
        this.produits.add(produit);
    }

    public String toString() {
        String strProduits="";
        for (Produit produit:this.produits) {
            strProduits+=produit+"\n";

        }
        return "Commande\n" +
                "-----------------------------\n"+
                strProduits +"\n"+
                "-----------------------------\n"+
                "Total: "+this.getPrixTotal()+" € \n";
    }
}
