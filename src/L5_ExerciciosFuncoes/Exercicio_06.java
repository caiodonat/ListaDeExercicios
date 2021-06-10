package L5_ExerciciosFuncoes;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        boolean denovo = false;
        do {
            System.out.println("Digite um horaio, no formato 24 horas (14:30, 12:25, 02:05)");
            Scanner myScanner = new Scanner(System.in);
            String horasDigitada = myScanner.next();
            int[] horasInt = comvertendoEmInt(horasDigitada);
            String amPm = amOuPm(horasInt[2]);
            System.out.println(horasInt[0] + ":" + horasInt[1] + amPm);

            System.out.println("Deseja repetir o codigo? (N-Não, S-Sim)");
            char repetirDenovo = myScanner.next().charAt(0);
            if (repetirDenovo == 'n'){
                denovo = false;
            } else if (repetirDenovo == 's'){
                denovo = true;
            }
        }while (denovo);
    }

    private static String amOuPm(int amPm) {
        if (amPm == 0) {
            return "AM";
        }else if (amPm == 1){
            return "PM";
        }
        return null;
    }

    static int[] comvertendoEmInt(String horasDigitada){
        String valorDigitado[] = horasDigitada.split(":");
        int[] valorDigitadoInt = new int[3];
        valorDigitadoInt[0] = Integer.parseInt(valorDigitado[0]);
        valorDigitadoInt[1] = Integer.parseInt(valorDigitado[1]);
        if (valorDigitadoInt[0] > 12) {
            valorDigitadoInt[0] = valorDigitadoInt[0] - 12;
            valorDigitadoInt[2] = 1;
        }else if (valorDigitadoInt[0] <= 12){
            valorDigitadoInt[2] = 0;
        }
        return valorDigitadoInt;
    }
}
