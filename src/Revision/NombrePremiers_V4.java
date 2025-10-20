package Revision;

public class NombrePremiers_V4 {
    public static void main(String[] args) {
        for (int nombre = 2; nombre < 5; nombre++) {
            boolean estPremier = true;
            int i = 2;
            while(estPremier && i<nombre) {
                if (nombre % i == 0) {
                    estPremier = false;
                }
                i++;
            }
            if (estPremier) {
                System.out.println(nombre + " estPremier " + estPremier);
            }
        }
    }
}
