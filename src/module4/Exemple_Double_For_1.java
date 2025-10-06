package module4;

public class Exemple_Double_For_1 {
    public static void main(String[] args) {
        int m = 20;
        int n = 20;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(i * j);
                if (i * j < 10)
                {
                    System.out.print("   ");
                }else if (i * j < 100)
                {
                    System.out.print("  ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
