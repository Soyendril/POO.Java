package banque;

public interface ICompte {
    int getNumero();

    double getSolde();

    double setSolde();

    void ajouter(double unMontant);

    void retirer(double unMontant);
}
