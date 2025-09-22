// tableau = {
// 1,
// 2,
// 3,
// 4,
// 5,
// 6,
// 7,
// 8,
// 9}


package module3;

public class Exemple_affichage {
    public static void main(String[] args) {
        int i = 0;
        System.out.print("tableau = { ");
        for ( i = 1; i < 9 ; i++) {
            System.out.print(i + ", ");
        }
        System.out.println(i + " }");
    }
}
