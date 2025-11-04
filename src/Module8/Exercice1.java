package Module8;

import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        System.out.println(convertVersFarh(lireTemperature()));
    }
    public static double convertVersFarh(double celsius)
    {
        return (celsius * 1.8) + 32;
    }
    // definition de la methode
    public static double lireTemperature()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("saisir temp en C : ");
        double temperature = sc.nextDouble();
        sc.close();
        return temperature;
    }
}
