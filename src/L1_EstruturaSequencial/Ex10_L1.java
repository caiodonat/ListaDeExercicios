package L1_EstruturaSequencial;

import java.util.Scanner;

public class Ex10_L1 {
    public static void main(String[] args) {System.out.println("Temperatura em graus Celcius");
        Scanner myObj = new Scanner(System.in);
        float tempCel = myObj.nextFloat();
        float tempFah = (tempCel * 9/5) + 32;
        System.out.println("Temperatura em Fahrenheit: " + tempFah);
    }
}
