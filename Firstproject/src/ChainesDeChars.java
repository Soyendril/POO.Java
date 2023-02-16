import java.util.Locale;

public class ChainesDeChars {
    public static void main(String[] args) {
        String message ="Message Hyper Secret";
        System.out.println(message.toLowerCase());
        System.out.println(message);
        System.out.println(message.toUpperCase(Locale.ROOT));
        System.out.println(message);
        System.out.println(message.length());
        System.out.println(message.contains("secret"));
        System.out.println(message.contains("Secret"));
        System.out.println(message.trim());
        System.out.println(message.charAt(1));

        }

    }

