package ExerciciosFuncoes5;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {

        System.out.println("14:30");
        Scanner myScanner = new Scanner(System.in);
        String horasDigitada = myScanner.next();
        String horasDigitadasSeArrey[] = horasDigitada.split(":");
        int[] horasDigitadasSeArreyInt = new int[horasDigitadasSeArrey.length];

        for (int i=0; i<horasDigitadasSeArreyInt.length; i++){
            horasDigitadasSeArreyInt[i] = Integer.parseInt(horasDigitadasSeArrey[i]);
        }
        for (int mostrarNaTela : horasDigitadasSeArreyInt){
            System.out.println(mostrarNaTela);
        }
    }
}
