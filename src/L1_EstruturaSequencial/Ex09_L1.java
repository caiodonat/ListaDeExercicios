package L1_EstruturaSequencial;

import java.util.Scanner;

public class Ex09_L1 {
    public static void main(String[] args) {System.out.println("Temperatura em Fahrenheit");
        Scanner myObj = new Scanner(System.in);
        float tempFah = myObj.nextFloat();
        float tempCel = 5 * ((tempFah-32) / 9);
        System.out.println("temperatura em graus Celsius: " + tempCel);
    }
}
