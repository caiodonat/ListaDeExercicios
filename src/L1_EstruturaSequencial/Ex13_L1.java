package L1_EstruturaSequencial;

import java.util.Scanner;

public class Ex13_L1 {
    public static void main(String[] args) {float altura = 0;
        char sexo;

        System.out.println("Qual sua altura?");
        Scanner myObj = new Scanner(System.in);
        altura = myObj.nextFloat();

        while (true) {
            System.out.println("Qual é seu sexo?");
            sexo = myObj.next().charAt(0);

            if (sexo == 'f') {
                System.out.printf("Seu peso ideal é: %.2f Kg", ((62.1 * altura) - 44.7));
                break;
            } else if (sexo == 'm') {
                System.out.printf("Seu peso ideal é: %.2f Kg", ((72.7 * altura) - 58));
                break;
            } else {
                System.err.println("Alguma informação digitada é invalida.");
            }
        }

    }
}
