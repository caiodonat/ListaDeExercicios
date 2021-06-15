package L1_EstruturaSequencial;

import java.util.Scanner;

public class Ex06_L1 {
    public static void main(String[] args) {
        System.out.println("Digite o raio do circulo");
        Scanner myObj = new Scanner(System.in);
        float raio = myObj.nextFloat();
        double area = Math.PI * (raio * raio);
        System.out.println("Area do circulo: " + area);
    }
}
