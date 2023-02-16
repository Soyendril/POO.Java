public class VariableStatic {

    public static void inc(int i){
        i++;
        System.out.println(i);
    }
    public static void main(String[] args) {
        int i =5;
        inc(i);
        System.out.println(i);
    }
}
