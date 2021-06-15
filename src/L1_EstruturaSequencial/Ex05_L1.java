package L1_EstruturaSequencial;

import java.util.Scanner;

public class Ex05_L1 {
    public static void main(String[] args) {
        System.out.println("Digite a distancia em metros, para ser comvertida em centimetros");
        Scanner myObj = new Scanner(System.in);
        float metros = myObj.nextFloat();
        float centimetros = metros * 100;
        System.out.println("A distancia em metros e: " + centimetros);
    }
}
