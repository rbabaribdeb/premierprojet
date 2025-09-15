package module2;

import java.util.Scanner;

public class Exemple_5 {
    public static void main(String[] args) {
        //psvm
        int x;
        int y;
        Scanner clavier = new Scanner(System.in);

        System.out.print("veuillez saisir une valeur pour x : ");
        x = clavier.nextInt();

        System.out.print("veuillez saisir une valeur pour y : ");
        y = clavier.nextInt();

        double z = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println("racine (x^2 + y^2 = " + z);



    }


}
