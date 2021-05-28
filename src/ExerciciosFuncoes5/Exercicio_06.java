package ExerciciosFuncoes5;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {

        System.out.println("Digite um horaio, no formato 24 horas (14:30, 12:25, 02:05)");
        Scanner myScanner = new Scanner(System.in);
        String horasDigitada = myScanner.next();
        char apPmMain = ' ';
        horasDigitadasSeArreyInt(horasDigitada, apPmMain);

        System.out.println(apPmMain);
    }
    static int[] horasDigitadasSeArreyInt(String horasDigitada, char letraRetornada){
        String horasDigitadasSeArrey[] = horasDigitada.split(":");
        int[] horasDigitadasSeArreyInt = new int[horasDigitadasSeArrey.length];

        for (int i=0; i<horasDigitadasSeArreyInt.length; i++){
            horasDigitadasSeArreyInt[i] = Integer.parseInt(horasDigitadasSeArrey[i]);
        }
        if (horasDigitadasSeArreyInt[0] > 12){
            horasDigitadasSeArreyInt[0] =- 12;
            letraRetornada = 'a';
        }else {
            letraRetornada = 'p';
        }
        char amPm = 'p';
        return horasDigitadasSeArreyInt;
    }
}
