package Module8;

public class Exemple1 {
    public static void main(String[] args) {
        // appel de la methode
        afficherMenu();
        calculCirconference( 5);
        calculSuperficie(5);
        calculCirconference( 10);
        calculSuperficie(10);
        calculCirconference( 50);
        calculSuperficie(50); // methode sans retour et 1 param
        double resultat = calculCarre(10);// méthode avec retouret 1 param
        System.out.println(resultat);
    }
    // declaration méthode superficie
    public static void calculSuperficie(double rayon){
        double sup = rayon * rayon * Math.PI;
        System.out.println("superficie : " + sup);
    }
    // déclaration de la méthode
    public static void calculCirconference(double rayon) {
        double cir = 2 * rayon * Math.PI;
        System.out.println("circonference : " + cir);
    }
    public static void afficherMenu()
    {
        System.out.println("==================================");
        System.out.println("==========     MENU    ===========");
        System.out.println("==================================");
    }
    public static double calculCarre(double x)
    {
        double resultat = x * x;
        return resultat;
    }
    public static double max(int a, int b, int c)
    {
        int max = a;
        if(b > max ) max = b;
        if(c > max ) max = c;
        return max;
    }
    public static void estTriangleA(int a, int b, int c)
    {
        double max =  max(a,b,c);
        if(a+b+c-max>=max)
        {
            System.out.println("Est un triangle");
        }else
        {
            System.out.println("Ce n'est pas un triangle");
        }
    }
    public static boolean estTriangle(int a, int b, int c)
    {
        boolean estTriangle;
        double max =  max(a,b,c);
        if(a+b+c-max>=max) {
            estTriangle = true;
        }else {
            estTriangle = false;
        }
        return estTriangle;
    }






}
