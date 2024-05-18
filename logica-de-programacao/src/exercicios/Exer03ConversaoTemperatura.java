package exercicios;
import  java.util.Scanner;

public class Exer03ConversaoTemperatura {
    public static void main(String[] args) {
        /*Escreva um programa que leia uma temperatura em Graus Celsios
        e a converta em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F)
        Depois mostre a conversão para os usuários
        */

        Scanner sc = new Scanner(System.in);
        double t, k, re, ra, f;

        t = sc.nextDouble();
        f = 9.0 / 5.0 * t + 32;
        k = t + 273.15;
        re = 5.0 / 4.0 * t;
        ra = (t + 273.15) * (9.0 / 5.0);

        // %n é comando para quebra de linha, também pode ser usado \n
        System.out.printf("A temperatura %.2f Celsius em Fahrenheit é %.2f%n", t, f);
        System.out.printf("A temperatura %.2f Celsius em Kelvin é %.2f%n", t, k);
        System.out.printf("A temperatura %.2f Celsius em Réamur é %.2f%n", t, re);
        System.out.printf("A temperatura %.2f Celsius em Rankine é %.2f", t, ra);

        sc.close();


    }
}
