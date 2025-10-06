package module4;

public class Exemple_Double_For_4 {
    public static void main(String[] args) {
        int m = 5; int n = 5;
        for (int i = 0; i <= m; i++) // nombre de lignes
        {
            for (int j = n; j >= i; j--) // triangle iverse d'espaces
                System.out.print("  ");
            for (int j = 0; j <= i; j++) // triangle 1 []
                System.out.print("[]");
            for (int j = 0; j <= i; j++) // triangle 2 _
                System.out.print("_ ");
            System.out.println(); // retour a la ligne
        }
    }
}
