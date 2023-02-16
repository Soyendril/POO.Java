package banque;

public interface ICompteRemunere extends ICompte {
    double getTaux();

    void setTaux(double taux);

    double calculerInterets();
}
