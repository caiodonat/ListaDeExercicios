package L2_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio_19 {
    public static void main(String[] args) {
        int num;
        int unidade = 0;
        int dezena = 0;
        int centena = 0;
        int minhar = 0;
        System.out.println("Digite um numero menor que 1000");
        Scanner myObj = new Scanner(System.in);
        num = myObj.nextInt();

        if (num >= 1000) {
            minhar = num / 1000;
            centena = (num / 100) % 10;
        } else {
            centena = num / 100;
        }
        dezena = (num % 100) / 10;
        unidade = (num % 100) % 10;

        if (num <= 0) {
            System.out.println("Algo de errado nao esta certo (1000 < num < 0)");
        }

        if (num >= 1000){
            System.out.println(minhar + " unidades de milhares");
        }
        if (num >= 100){
            System.out.println(centena + " centenas");
        }
        System.out.println(dezena + " dezenas");
        System.out.println(unidade + " unidades");
    }
}
