package L1_EstruturaSequencial;

import java.util.Scanner;

public class Ex18_L1 {
    public static void main(String[] args) {System.out.println("Qual o tamanho do arquivo em MB?");
        Scanner myObj = new Scanner(System.in);
        float tamanhaArquivo = myObj.nextFloat();
        System.out.println("Qual é sua velocidade de internet? (em Mbps)");
        float velocidadeInt = myObj.nextFloat();
        int segundosMinutos = 60;
        float segundosTotal = tamanhaArquivo/velocidadeInt;
        int minutos = 0;
        do {
            if (segundosTotal > segundosMinutos) {
                minutos++;
                segundosTotal = segundosTotal - segundosMinutos;
            }
        }while (segundosTotal > segundosMinutos);
        System.out.print("Tempo aproximado de download: " + minutos + " Minutos");
        System.out.printf(" e %.0f", segundosTotal);
        System.out.print(" segundos");
    }
}
