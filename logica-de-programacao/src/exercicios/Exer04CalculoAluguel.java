package exercicios;
import java.util.Scanner;

public class Exer04CalculoAluguel {
    public static void main(String[] args) {
        /*Escreva um programa que faça o cálculo de aluguel a ser pago ao alugar
        * um carro, onde a cada dia que a pessoa ficar com o carro seja cobrado
        * R$ 86,75 e a cada Km rodado seja cobrado R$ 1,23 */

        Scanner sc = new Scanner(System.in);
        double aluguel, km_rodado, qtd_dias;
        int dia;

        System.out.print("Informe a quantidade de dias: ");
        dia = sc.nextInt();
        System.out.println("Informe a quantidade de Quilometros rodados: ");
        km_rodado = sc.nextInt();

        qtd_dias = 86.75 * dia;
        aluguel = qtd_dias + (km_rodado * 1.23);

        System.out.printf("O valor do aluguel do carro por %d dias é: %.2f reais", dia, aluguel);

    }
}
