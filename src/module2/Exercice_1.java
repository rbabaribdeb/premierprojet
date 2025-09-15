package module2;

import java.util.Scanner;

public class Exercice_1 {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.print("veuillez saisir une lettre  : ");
        String lettre = clavier.nextLine();
        lettre = lettre.toLowerCase();

        if (lettre.equals("a") || lettre.equals("i") || lettre.equals("o") ||
            lettre.equals("u") || lettre.equals("e")|| lettre.equals("y"))
        {
            System.out.println("C'est une voyelle ");
        }
        else
        {
            System.out.println("C'est autre chose qu'une voyelle");
        }




    }


}
