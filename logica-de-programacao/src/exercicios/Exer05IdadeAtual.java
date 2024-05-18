package exercicios;

import java.util.Scanner;

public class Exer05IdadeAtual {
    public static void main(String[] args) {
    //Escreva um programa que a pessoa entre com o ano atual e depois entre com
    //o ano que nasceu, e mostre a idade dela.

    Scanner sc = new Scanner(System.in);
    int ano_nascimento, ano_atual, idade;

        System.out.print("Informe o ano do nascimento: ");
        ano_nascimento = sc.nextInt();
        System.out.print("Informe o ano atual: ");
        ano_atual = sc.nextInt();

        idade = ano_atual - ano_nascimento;

        System.out.printf("Sua idade é: %d", idade);

        sc.close();
    }
}
