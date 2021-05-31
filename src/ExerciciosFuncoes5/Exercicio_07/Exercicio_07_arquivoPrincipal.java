package ExerciciosFuncoes5.Exercicio_07;

import java.util.Scanner;

/*Faça um programa que use a função valorPagamento para determinar o valor a ser pago por uma prestação de uma conta. O
 programa deverá solicitar ao usuário o valor da prestação e o número de dias em atraso e passar estes valores para a
 função valorPagamento, que calculará o valor a ser pago e devolverá este valor ao programa que a chamou. O programa
 deverá então exibir o valor a ser pago na tela. Após a execução o programa deverá voltar a pedir outro valor de
 prestação e assim continuar até que seja informado um valor igual a zero para a prestação. Neste momento o programa
 deverá ser encerrado, exibindo o relatório do dia, que conterá a quantidade e o valor total de prestações pagas no
 dia. O cálculo do valor a ser pago é feito da seguinte forma. Para pagamentos sem atraso, cobrar o valor da
 prestação. Quando houver atraso, cobrar 3% de multa, mais 0,1% de juros por dia de atraso.

 1.interface de adiçao de dados como: valor da prestação (pode ser + ou -)| prestação em atraso? (Sim ou Nao)
 */
public class Exercicio_07_arquivoPrincipal {
    public static void main(String[] args) {
        float[] valoresPrestacoesArrey = new float[10];
        int[] diasEmAtrasoArrey = new int[10];
        float[] valorFinalComAtrasoArrey = new float[10];

        float valorPrestacao = 0;
        char prestacaoEmAtraso;
        Scanner myScaner = new Scanner(System.in);
        boolean finalizarDiaB = false;
        int prestacaoDoDia = 0;
        System.out.println("Bem vindo a interface de \"Prestação de conta\"");
        do {
            int diasEmAtraso = 0;
            boolean comfirmarAdicaoB = false;
            do {
                System.out.println("Qual o valor da prestação de conta?");
                valorPrestacao = myScaner.nextFloat();
                System.out.println("Esta prestação esta em atraso? ('S'-Sim, 'N'-Não)");
                prestacaoEmAtraso = myScaner.next().charAt(0);
                if (prestacaoEmAtraso == 's') {
                    System.out.println("Quantos dias em atraso?");
                    diasEmAtraso = myScaner.nextInt();
                } else {
                    diasEmAtraso = 0;
                }
                System.out.println("valor da prestação: R$" + valorPrestacao + "\n dias em atraso: " + diasEmAtraso + "\n Valor com atraso: R$" + (valorPrestacao + (valorPrestacao * (0.01 * diasEmAtraso))));
                System.out.println("Deseja comfirma a adição de prestação de conta? 'S' | Alterar valores 'N'");

                char comfirmarAdicao = myScaner.next().charAt(0);
                if (comfirmarAdicao == 's') {
                    valoresPrestacoesArrey[prestacaoDoDia] = valorPrestacao;
                    diasEmAtrasoArrey[prestacaoDoDia] = diasEmAtraso;
                    valorFinalComAtrasoArrey[prestacaoDoDia] = valorFinalComAtraso(valorPrestacao, diasEmAtraso);
                    prestacaoDoDia++;
                    comfirmarAdicaoB = true;
                } else {
                    comfirmarAdicaoB = false;
                }
            } while (!comfirmarAdicaoB);

            System.out.println("'F' - Finalizar o dia\n'A' - Adicionar outra prestação");
            char finalizarDia = myScaner.next().charAt(0);
            if (finalizarDia == 'f') {
                finalizarDiaB = true;
            } else {
                finalizarDiaB = false;
            }
        }while (!finalizarDiaB);
        for (int i=0; i<valoresPrestacoesArrey.length; i++){
            if (valoresPrestacoesArrey[i] != 0){
                System.out.println("Valor da prestação | Dias em atraso | Valor com atraso");
                System.out.println("R$" + valoresPrestacoesArrey[i] + " | " + diasEmAtrasoArrey[i] + " | R$" + valorFinalComAtrasoArrey[i]);
            }
        }
    }

    public static float valorFinalComAtraso(float valorPrestacao, int diasEmAtraso){
        return (float) (valorPrestacao + (valorPrestacao * (0.01 * diasEmAtraso)));
    }
}
