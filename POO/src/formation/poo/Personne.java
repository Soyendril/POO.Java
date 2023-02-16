package formation.poo;
//Attributs
public class Personne {
    private String nom;
    private String prenom;
    private double taille;

// Constructeur
    public Personne(String nom, String prenom, double taille){
        this.nom = nom;
        this.prenom = prenom;
        this.taille = taille;
    }



    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom.toLowerCase();
    }
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
//  Méthodes
    public void afficher(){
        System.out.println("je suis "+this.prenom+" "+ this.nom+" je mesure "+this.taille);
    }
}
