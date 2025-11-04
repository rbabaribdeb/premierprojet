package Module7_Tableau_Suite;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Exemple1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quelle est la taille du tableau");
        int taille = sc.nextInt();
        double somme =0;
        // créer un tableau de taille
        int[] tableau = new int [taille];

        for (int i = 0; i < tableau.length; i++) {
            System.out.println("saisir la valeur " + i + " :");
            int val = sc.nextInt();
            tableau[i] = val;
            somme = somme + val;
        }
        System.out.println("Somme = " + somme);
        System.out.println("Moyenne = " + (somme/ tableau.length));
    }

    // ecrire un programme qui demande à
    // l'utilisateur la taille du tableau qu'il veut créer
    // saisit des valeurs
    // Calcul la somme et la moyenne


}
