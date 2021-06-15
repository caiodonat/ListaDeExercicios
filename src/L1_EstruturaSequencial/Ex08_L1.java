package L1_EstruturaSequencial;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex08_L1 {
    public static void main(String[] args) {System.out.println("quanto você ganha por hora e o número de horas trabalhadas no mês?");
        Scanner myObj = new Scanner(System.in);
        float ganhoPHora = myObj.nextFloat();
        float Horas = myObj.nextFloat();
        double ganhoMes = ganhoPHora * Horas;

        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MMM");
        String formattedDate = myDateObj.format(myFormatObj);

        System.out.println("Voce ganhara no mes de " + formattedDate + " o valor de: " + ganhoMes);
    }
}
