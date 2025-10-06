package Module5;

public class Exemple_String_2 {
    public static void main(String[] args) {


        String str1 = "Bonjour";

        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));

        }

        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(str1.length()-i-1));

        }



    }
}
