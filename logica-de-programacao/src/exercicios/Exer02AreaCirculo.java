package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class Exer02AreaCirculo {
    public static void main(String[] args) {

        /*Crie um programa que calcule a área de um círculo*/

        //A ordem do Locale define o tratamento da entrada:
        //- antes dos scanner

        // Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Locale.setDefault(Locale.US);

        final double PI = 3.14f;
        double raio, area;

        System.out.print("Digite o raio: ");
        raio = sc.nextDouble();

        area = PI * (raio * raio);

        System.out.println();
        // print sem formatação
        System.out.println("A área do cículo com o raio: " + raio +
                " é igual a: " + area);
        System.out.println();
        // print com formatacao
        System.out.printf("A área do círculo com raio %.2f é igual a %.2f", raio, area);

        sc.close();
    }
}
