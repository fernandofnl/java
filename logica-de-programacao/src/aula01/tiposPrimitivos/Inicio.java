package aula01.tiposPrimitivos;

public class Inicio {

    public static void main(String[] args) {

        //byte
        //short
        //int
        //long
        //float (1.35F)
        //double
        //char
        //String

        String gameRPG = "Hogwarts Legacy";
        String gameIndie = "Hollow Knight";

        int age = 35;
        int code = 2367;
        char gender = 'M';

        double priceRPG = 107.80;
        double priceIndie = 46.99;

        double media = (priceRPG + priceIndie)/2;
        double media_pracima = Math.ceil(media);
        double media_prabaixo = Math.floor(media);
        double media_round = Math.round(media);
        String resultado = String.format("%.2f", media);

        System.out.println("Prosutos:");
        System.out.println(gameRPG + " está custando R$" + priceRPG);
        System.out.println(gameIndie + " está custando R$" + priceIndie);
        System.out.println();

        System.out.println("O comprador tinha " + age + " anos, code " + code + " e genero: " + gender);
        System.out.println("Média de valor de R$" + media);
        System.out.printf("Média de valor de R$%.2f%n", media);
        System.out.println("Média do valor arredondado: R$" + media_pracima);
        System.out.println("Média do valor arredondado: R$" + media_prabaixo);
        System.out.println("Média do valor arredondado: R$" + media_round);
        System.out.println("Média do valor arredondado no padrão americano: R$" + resultado);

        System.out.printf("Idade %d codigo %d genero: %s%n", age, code, gender);
        // %n é para quebra de linha






    }
}
