package banque;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class Client {
    private String nom;

    private String prenom;

    private int age;

    private int numero;

    private Compte[]comptes=new Compte[5];


    public Client(){

    }

    public Client(String nom, String prenom, int age, int numero) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumero() {
        return numero;
    }


    /**
     * Recherche un compte parmis la liste des comptes du client.
     * en fonction du numero de compte, si aucun compte n'est trouvé
     * affiche un message dans la console pour le notifier qu'il y a un soucis.
     * et retourne null
     * @param numeroCompte
     * @return un compte ou null
     */
    public Compte getCompte(int numeroCompte){
        for (Compte compte:this.comptes){
            if (compte !=null && compte.getNumero()== numeroCompte) {
                return compte;
            }

        }
        System.out.println("pas de compte trouvé! ");
        return null;
    }

    public void ajouterCompte(Compte compte){
        for (int index = 0; index < 5; index++) {
            if(this.comptes[index]==null){
                this.comptes[index]=compte;
                return;
            }

        }
        System.out.println("vous avez deja 5 comptes!");
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", numero=" + numero +
                ", comptes=" + Arrays.toString(comptes) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age && numero == client.numero && Objects.equals(nom, client.nom) && Objects.equals(prenom, client.prenom);
    }


}
