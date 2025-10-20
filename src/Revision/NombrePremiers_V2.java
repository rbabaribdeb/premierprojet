package Revision;

public class NombrePremiers_V2 {
    public static void main(String[] args) {
        for (int nombre = 2; nombre < 100; nombre++) {

           // System.out.println("============= AFFICHER LES DIVISEURS =========== : " + nombre);
            // est un diviseur
            //  int nombre = 37;
            boolean estPremier = true; // suppose que le nombre est premier
            // si je trouve un diviseur
            // est premier
            for (int i = 2; i < nombre; i++) {

                if (nombre % i == 0) {
                 //   System.out.println(i + " est diviseur");
                    estPremier = false;
                }
            }
           // System.out.println("============= AFFICHER SI PREMIER ===========");

            if (estPremier)
            {
                System.out.println(nombre + " estPremier " + estPremier);
            }

        }


    }

}
