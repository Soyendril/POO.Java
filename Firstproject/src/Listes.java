import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Listes {
    public static void main(String[] args) {
        // List<String> messages = new ArrayList<>();
        // messages.add("hello");
        // messages.add("World");
        // messages.get(1);
        // messages.set(0,"Bonjour");
        // messages.size();
        List<Integer> maliste = new ArrayList<>();
        maliste.add(1);
        maliste.add(2);
        maliste.add(15);
        maliste.add(145);
        maliste.add(1);
        maliste.add(1);
        maliste.add(15);
        maliste.add(788);
        triSimpleListe(maliste);
        //melanger(maliste);


    }


    public static List<Integer> triSimpleListe(List<Integer> valeurs) {
        List<Integer> result = new ArrayList<>();
        List<Integer> donnee = new ArrayList<>(valeurs);
        while (!donnee.isEmpty()) {
            int min = donnee.get(0);
            int minIndex = 0;
            for (int i = 0; i < donnee.size(); i++) {
                if (donnee.get(i) < min) {
                    minIndex = i;
                    min = donnee.get(i);
                }

            }
            donnee.remove(minIndex);
            result.add(min);
        }
        System.out.println(result);
        return result;
    }


    public static List<Integer> melanger(List<Integer> valeurs) {

        List<Integer> result = new ArrayList<>();
        List<Integer> donnee = new ArrayList<>(valeurs);
        while (!donnee.isEmpty()) {
            int min = donnee.get(0);
            int minIndex = 0;

            for (int i = 0; i < donnee.size(); i++) {
                minIndex = i;
                min = donnee.get(Outils.randInt(0,donnee.size()));
            }
            donnee.remove(minIndex);
            result.add(min);


        }

        System.out.println(result);
        return result;


    }

}
