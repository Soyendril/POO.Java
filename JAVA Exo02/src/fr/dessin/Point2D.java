package fr.dessin;

public class Point2D {


    private static int compteur;
    private int x;

    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public static int getCompteur() {
        return compteur;
    }

    public static void setCompteur(int compteur) {
        Point2D.compteur = compteur;
    }

    public Point2D(){
        this(0,0);

    }
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
        compteur++;
    }








    public void translater(int dX, int dY){
        this.x+=dX;
        this.y+=dY;
    }
    public void afficher(){

        System.out.println("[ "+this+"]");

    }
    public static void afficheCompteur(){
        System.out.println("vous avez crée "+compteur+" Point2D");
    }

    @Override
    public String toString() {
        return "x=" + x + ", y=" + y
                ;
    }
}
