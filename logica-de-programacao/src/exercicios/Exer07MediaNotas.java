package exercicios;

import java.util.Scanner;

public class Exer07MediaNotas {
    public static void main(String[] args) {
        /*Escreva um programa onde o aluno entre com seu nome e RA, depois coloque 3 notas
        * de prova e tire a média dele
        * No final mostre o seguinte texto:
        *
        * QUERIDO ALUNO {NOME DO ALUNO} DO RA {RA DO ALUNO} SUA MÉDIA FOI IGUAL A
        * {MÉDIA DO ALUNO}. OBRIGADO PELA ATENÇÃO!
        * */

        Scanner sc = new Scanner(System.in);
        String nome;
        int ra;
        double n1, n2, n3, media;

        System.out.printf("Informe o nome do aluno: ");
        nome = sc.nextLine();
        System.out.printf("Informe o RA do aluno: ");
        ra = sc.nextInt();
        System.out.printf("Informe a nota da prova 1: ");
        n1 = sc.nextDouble();
        System.out.printf("Informe a nota da prova 2: ");
        n2 = sc.nextDouble();
        System.out.printf("Informe a nota da prova 3: ");
        n3 = sc.nextDouble();

        media = (n1 + n2 + n3) / 3;

        System.out.printf("QUERIDO ALUNO %s DO RA %d SUA MÉDIA FOI IGUAL A %.2f.OBRIGADO PELA ATENÇÃO!", nome, ra, media);

    }
}
