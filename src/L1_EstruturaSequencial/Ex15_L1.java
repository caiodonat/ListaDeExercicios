package L1_EstruturaSequencial;

import java.util.Scanner;

public class Ex15_L1 {
    public static void main(String[] args) {System.out.println("quanto você ganha por hora?");
        Scanner myObj = new Scanner(System.in);
        float ganhoPHora = myObj.nextFloat();
        System.out.println("Quantas horas você trabalhou esse mês?");
        float Horas = myObj.nextFloat();
        double ganhoMes = ganhoPHora * Horas;
        System.out.println("+ Salário Bruto : R$" +ganhoMes);
        System.out.println("- IR (11%) : R$" + (ganhoMes * 0.11));
        System.out.println("- INSS (8%) : R$" + (ganhoMes * 0.08));
        System.out.println("- Sindicato ( 5%) : R$" + (ganhoMes * 0.05));
        System.out.println("= Salário Liquido : R$" + (ganhoMes * 0.76));
    }
}
