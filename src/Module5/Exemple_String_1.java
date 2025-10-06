package Module5;

public class Exemple_String_1 {
    public static void main(String[] args) {

        // création de string
        String str1 = "phrase";
        String str2 = new String("autre phrase");
        String str3 = new String(); // constructeur par defaut

        // toLowerCase
        System.out.println("Bonjour".toLowerCase());

        // toLowerCase
        System.out.println("Bonjour".toUpperCase());

        // length
        System.out.println("Taille du str : " + "Bonjour".length());


        // length
        System.out.println("caractere indice 5 : " + "Bonjour".charAt(5));

        System.out.println( " str contient un r : "+ "Bonjour".contains("p"));

        System.out.println( " str est vide : "+ "Bonjour".isEmpty());





    }
}
