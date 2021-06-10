package L5_ExerciciosFuncoes;

import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("primeiro numero");
        float primeiroNumeroDigitado = myScanner.nextFloat();

        System.out.println("Segundo numero");
        float segundoNumeroDigitado = myScanner.nextFloat();

        System.out.println("Terceiro numero");
        float terceiroNumeroDigitado = myScanner.nextFloat();

        System.out.println(somaNumeros(primeiroNumeroDigitado, segundoNumeroDigitado, terceiroNumeroDigitado));//mostro na tela o 'return' do metodo
        // 'somaNumeros', que sera a soma dos 3 parametros

    }

    static float somaNumeros(float primeiroNumero, float segundoNumero, float terceiroNumero) {
        return (primeiroNumero + segundoNumero + terceiroNumero);
        /*uma outra solução seria criar outra variavel para armazenar o resultado, e exibir essa variavel (resuldadoDaSoma)
        float resultadoDaSoma = primeiroNumero + segundoNumero + terceiroNumero;
        return resultadoDaSoma;
         */
    }
}
