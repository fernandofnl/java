package exercicios;

import java.util.Scanner;
import java.util.Random;

public class Exer06CadastroAluno {
    public static void main(String[] args) {
        /*Escreva um programa em java de cadastro de aluno, em que ele irá colocar um nome,
        sua idade, seu gênero, seu curso e gere um RA aleatório onde o primeiro item
        é a primeira letra do seu nome e depois são números aleatórios.
        mostre depois para o usuário seu nome todo em letra maiúscula, diga quantos
        caracteres tem o seu nome, mostre todas as outras informações que ele
        cadastrou e mostre o nome do curso todo em letra minúscula. */

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String nome, curso, genero;
        int idade;
        int numero_aleatorio = 2000 + random.nextInt(9999);

        System.out.printf("Informe seu nome: ");
        nome = sc.nextLine();
        System.out.print("Idade: ");
        idade = sc.nextInt(); // Tipo int, float e double deixam lixo de memória
        sc.nextLine(); // Limpar o buffer do teclado
        System.out.print("Gênero: ");
        genero = sc.nextLine();
        System.out.print("Curso: ");
        curso = sc.nextLine();
        char primeiraLetra = nome.charAt(0);
        String ra = primeiraLetra + "" + numero_aleatorio;

        System.out.println("Nome completo: " + nome.toUpperCase());
        System.out.println("Número de caracteres do nome: " + nome.length());
        System.out.println("Idade: " + idade);
        System.out.println("Gênero: " + genero);
        System.out.println("Curso: " + curso.toLowerCase());
        System.out.println("RA gerado: " + ra);




    }
}
