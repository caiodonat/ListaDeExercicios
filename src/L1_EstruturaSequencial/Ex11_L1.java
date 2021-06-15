package L1_EstruturaSequencial;

import java.util.Scanner;

public class Ex11_L1 {
    public static void main(String[] args) {int numI1 = 0;
        int numI2 = 0;
        int numR = 0;
        System.out.println("Digite o 1 Numero Inteiro");
        Scanner myObj = new Scanner(System.in);
        numI1 = myObj.nextInt();

        System.out.println("Digite o 2 Numero Inteiro");
        numI2 = myObj.nextInt();

        do {
            System.out.println("Digite o um Numero Real");
            numR = myObj.nextInt();
            if (numR<0){
                System.out.println("(Um numero real é sempre possitivo)");
            }
        }while (numR<0);

        System.out.println("a: " + (numI1 * 2 *(numI2/2)));
        System.out.println("b: " + ((numI1 * 3) + numR));
        System.out.println("c: " + (numR * numR));
    }
}
