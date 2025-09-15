package module1;

import java.util.Scanner;
public class Exemple_5 {
    public static void main(String[] args) {
        // DEBUT
        // créer l'objet scanner une fois
        Scanner clavier = new Scanner(System.in);
        // afficher un message
        System.out.println("veuillez inserer votre nom : ");
        // Lire un nom
        String nom = clavier.nextLine();
        // afficher un message
        System.out.println("veuillez inserer votre age : ");
        // Lire un nom
        String age = clavier.nextLine();
        // utiliser ce nom pour ecrire un message
        System.out.println("Bonjour " + nom + " votre age :" + age);
        // transformer une chaine de caractere en entier ...
        int ageNumerique = Integer.parseInt(age);
        ageNumerique = ageNumerique + 20 ;
        System.out.println("votre age dans 20 ans sera de : " + ageNumerique);
        // FIN
    } //main
}// class