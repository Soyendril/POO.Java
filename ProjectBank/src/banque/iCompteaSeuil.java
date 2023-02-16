package banque;

public interface iCompteaSeuil extends ICompte {


    void setSeuil(double Seuil);
    @Override
    void retirer(double unMontant);
}
