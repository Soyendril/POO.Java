public class Condition {
    public static void main(String[] args) {
        boolean vrai = true;
        boolean faux = false;

        int age = 25;
        double height = 1.8;
        System.out.println(age < 18);

        if (age > 18) {
            System.out.println("vous pouvez entrer car vous avez " + age + "ans");
        } else if (age ==18) {
            System.out.println("mouais");
        } else {
            System.out.println("vous ne pouvez pas entrer car vous avez seulement " + age+ "ans");
        }
    }
}