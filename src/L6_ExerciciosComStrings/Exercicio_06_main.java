package L6_ExerciciosComStrings;

import java.util.Scanner;

public class Exercicio_06_main {
    public static void main(String[] args) {
        String[] dataSplit;
        do {
            System.out.println("Digite sua Data de Nascimento: (ex:12/12/2012, 23/04/2000, 1/6/2021)");
            Scanner myScanner = new Scanner(System.in);
            String dataString = myScanner.nextLine();
            dataSplit = dataString.split("/");
            if (dataSplit.length != 3){
                System.out.println("Falta alguma data, tente novamente");
            }else if (Integer.parseInt(dataSplit[1]) < 0 || Integer.parseInt(dataSplit[1]) > 12){
                System.out.println("Mes invalido, tente novamente");
            }else if (Integer.parseInt(dataSplit[0]) < 0 || Integer.parseInt(dataSplit[0]) > 31){
                System.out.println("Dia invalido, tente novamente");
            }else {
                break;
            }
        } while (true);

        dataSplit[1] = qualMesPorExtenso(dataSplit[1]);

        System.out.println("Você nasceu em: " + dataSplit[0] + " de " + dataSplit[1] + " de " + dataSplit[2]);
    }

    private static String qualMesPorExtenso(String numeroDoMes) {
        switch (Integer.parseInt(numeroDoMes)) {
            case 1 -> {
                return "Janeiro";
            }
            case 2 -> {
                return "Fevereiro";
            }
            case 3 -> {
                return "Março";
            }
            case 4 -> {
                return "Abril";
            }
            case 5 -> {
                return "Maio";
            }
            case 6 -> {
                return "Junho";
            }
            case 7 -> {
                return "Julho";
            }
            case 8 -> {
                return "Agosto";
            }
            case 9 -> {
                return "Setembo";
            }
            case 10 -> {
                return "Outubro";
            }
            case 11 -> {
                return "Novembro";
            }
            case 12 -> {
                return "Dezembro";
            }
            default -> {
                System.out.println("Mes invalido");
                return "0";
            }
        }
    }
}