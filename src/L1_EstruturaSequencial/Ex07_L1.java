package L1_EstruturaSequencial;

import java.util.Scanner;

public class Ex07_L1 {
    public static void main(String[] args) {
        System.out.println("Digite o altura do quadrado");
        Scanner myObj = new Scanner(System.in);
        float altura = myObj.nextFloat();
        double areaQuadrada = 2 * (altura * altura);
        System.out.println("O dobro da area do quadrado: " + areaQuadrada);
    }
}
