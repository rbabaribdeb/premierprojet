package module1;

import java.util.Scanner;

public class Exemple_3 {
    public static void main(String[] args) {
        // DEBUT

        // créer l'objet scanner une fois
        Scanner clavier = new Scanner(System.in);
        // afficher un message
        System.out.println("veuillez inserer votre nom : ");
        // Lire un nom
        String nom = clavier.nextLine();




        // utiliser ce nom pour ecrire un message
        System.out.println("Bonjour" + nom);

        // FIN

    } //main
}// class