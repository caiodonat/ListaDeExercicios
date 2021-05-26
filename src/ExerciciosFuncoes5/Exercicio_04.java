package ExerciciosFuncoes5;
/*
1.solicito um numero real
2.chamo o metodo com "numero real" como parametro
3.faço a comparacao ("numero real" > 0 = positivo, "numero real" < 0 = negativo, "numero real" == 0 = 0)
4.retorno 'p' (positivo), 'n' (negativo) ou 'z' (numero real = 0)
5.devolta do bloco 'main' faço a comparação do char e de acordo com o valor imprimo a mensagem correta.
 */

import java.util.Scanner;

public class Exercicio_04 {

    public static void main(String[] args) {
        System.out.println("Digite um numero");
        Scanner myScanner = new Scanner(System.in);
        float numeroDigitado = myScanner.nextFloat();
        char resultado = positivoOuNegativo(numeroDigitado);

        switch (resultado){
            case 'p': {
                System.out.println("O numero é positivo");
                break;
            }
            case 'n': {
                System.out.println("O numero é negativo");
                break;
            }
            case 'z': {
                System.out.println("O numero é igual há zero");
                break;
            }
        }
    }

    private static char positivoOuNegativo(float numeroDigitado) {
        if (numeroDigitado > 0){
            return 'p';
        }else if (numeroDigitado < 0){
            return 'n';
        }else {
            return 'z';
        }
    }
}
