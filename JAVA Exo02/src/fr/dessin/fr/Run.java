package fr.dessin.fr;

import fr.dessin.POint3Dbis;
import fr.dessin.Point2D;
import fr.dessin.Point3D;

public class Run {
    public static void main(String[] args) {
        Point2D point1 =new Point2D(55,-25);
        Point2D point2 =new Point2D();
        point1.translater(-444,5);
        System.out.println(point1.toString());
        System.out.println(point2.toString());
        Point2D.afficheCompteur();
        Point3D point3D1 =new Point3D();
        point3D1.translater(12,25,5);
        System.out.println(point3D1.toString());
        POint3Dbis pOint3Dbis =new POint3Dbis(5,5,24);
        pOint3Dbis.translater(1,4,6);
        pOint3Dbis.afficher();

    }
}
