package module4;

public class Exemple_Double_For_3 {
    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        for (int i = 0; i <= m; i++) // nombre de lignes
        {
            for (int j = 0; j <= i; j++) // nombre de caractères dans une ligne
            {
                System.out.print("* ");

            }

            System.out.println(); // retour a la ligne
        }
    }
}
