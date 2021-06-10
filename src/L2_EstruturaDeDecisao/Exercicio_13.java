package L2_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
        int diaSemana = 0;
        do {
            System.out.println("Digiate um numero correspondente ao dia da semana");
            Scanner myObj = new Scanner(System.in);
            diaSemana = myObj.nextInt();

            if (diaSemana > 7){
                System.out.println("Numero digitado e invalido");
            }
        } while (diaSemana > 7);

        switch (diaSemana){
            case 1: {
                System.out.println("Domingo");
                break;
            }
            case 2: {
                System.out.println("Segunda-Feira");
                break;
            }
            case 3: {
                System.out.println("Terça-Feira");
                break;
            }
            case 4: {
                System.out.println("Quarta-Feira");
                break;
            }
            case 5: {
                System.out.println("Quinta-Feira");
                break;
            }
            case 6: {
                System.out.println("Sexta-Feira");
                break;
            }
            case 7: {
                System.out.println("Sabado");
                break;
            }
        }
    }
}
