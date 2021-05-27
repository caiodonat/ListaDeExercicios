package ExerciciosFuncoes5;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        System.out.println("14:30");
        Scanner myScanner = new Scanner(System.in);
        String horasDigitada = myScanner.next();
        String horasPrimeiraParte = horasDigitada.substring(0, 2);
        String horasPrimeiraParteInt = (int) horasPrimeiraParte;
        System.out.println(horasPrimeiraParteInt);
    }
}
