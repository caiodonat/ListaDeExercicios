package L1_EstruturaSequencial;

import java.util.Scanner;

public class Ex02_L1 {
    public static void main(String[] args) {
        System.out.println("Digite um numero para ser exibido");
        Scanner myObj = new Scanner(System.in);
        int userName = myObj.nextInt();
        System.out.println("O número informado foi: " + userName);
    }
}
