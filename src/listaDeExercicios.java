import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;
/*
6Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor a média de cada aluno, imprima o número de alunos com média maior ou igual a 7.0.
7Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação e os números.
8Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no seu respectivo vetor. Imprima a idade e a altura na ordem inversa a ordem lida.
9Faça um Programa que leia um vetor A com 10 números inteiros, calcule e mostre a soma dos quadrados dos elementos do vetor.
10Faça um Programa que leia dois vetores com 10 elementos cada. Gere um terceiro vetor de 20 elementos, cujos valores deverão ser compostos pelos elementos intercalados dos dois outros vetores.
 */
public class listaDeExercicios {
    public static void main(String[] args) {
        System.out.println("Seja muito bem vindo ha nossa 4 lista de exercicios,\nQual exemplo vc deseja reproduzir?");
        Scanner numeroDigitado = new Scanner(System.in);
        int myExemplos = numeroDigitado.nextInt();

        switch (myExemplos){
            case 1: {
                int[] numeros = new int[5];
                for (int i=0; i< numeros.length; i++){
                    System.out.println("Digite o valor numero " + (i+1));
                    Scanner myObj = new Scanner(System.in);
                    numeros[i] = myObj.nextInt();
                }
                for (int i=0; i< numeros.length; i++){
                    System.out.print(numeros[i] + ", ");
                }
                break;
            }
            case 2: {
                int[] numeros = new int[10];
                for (int i=0; i<numeros.length; i++){
                    System.out.println("Digite o valor da casa " + (i+1));
                    Scanner myObj = new Scanner(System.in);
                    numeros[i] = myObj.nextInt();
                }
                for (int i=9; i>=0; i--){
                    System.out.print(numeros[i] + ", ");
                }
                break;
            }
            case 3: {
                Scanner myObj = new Scanner(System.in);
                float[] notas = new float[4];
                float notasMedia = 0;

                for (int i=0; i<notas.length; i++){
                    System.out.println("Nota do " +(i+1)+" bimestre");
                    notas[i] = myObj.nextFloat();
                    notasMedia += notas[i];
                }
                for (int i=0; i<notas.length; i++){
                    System.out.println("Notas numero" + (i+1) + ": " + notas[i]);
                }
                System.out.println("Media das notas: " + (notasMedia/notas.length));
                break;
            }
            case 4: {
                System.out.println("Escreva uma sequancia de de Letras");
                char[] letrasScanner = new char[10];
                char[] letrasVogais = {'a', 'e', 'i', 'o', 'u'};
                int vogaisSoma = 0;
                for(int i=0; i<letrasScanner.length; i++){
                    Scanner myObj = new Scanner(System.in);
                    letrasScanner[i] = myObj.next().charAt(0);
                }
                for (int i=0; i<letrasScanner.length; i++){
                    for (int j=0; j<5; j++){
                        if (letrasScanner[i] == letrasVogais[j]) {
                            letrasScanner[i] = ' ';//Ganbiara
                            vogaisSoma++;
                        }
                    }
                }
                for (int i=0; i<letrasScanner.length; i++){
                    if (letrasScanner[i] != ' ') {
                        System.out.print(letrasScanner[i] + ", ");
                    }
                }
                System.out.println("Total de Consoantes: " + (10-vogaisSoma));
                break;
            }
            case 5: {
                int parPosicao = -1;
                int impPosicao = -1;
                int[] allNum = new int[20];
                int[] numPar = new int[20];
                int[] numImp = new int[20];
                boolean numVerifB = false;

                for (int i=0; i< allNum.length; i++){
                    System.out.print("Valor a ser colocado dentro do Vetor: ");
                    Scanner myObj = new Scanner(System.in);
                    allNum[i] = myObj.nextInt();
                }
                for (int i=0; i<allNum.length; i++){

                    int numVerif = allNum[i];

                    numVerifB = true;

                    while (numVerifB) {
                        if (numVerif == 0) {
                            parPosicao++;
                            numPar[parPosicao] = allNum[i];
                            numVerifB = false;
                            break;
                        } else if (numVerif == 1) {
                            impPosicao++;
                            numImp[impPosicao] = allNum[i];
                            numVerifB = false;
                            break;
                        } else {
                            numVerif = numVerif - 2;
                        }
                    }
                }
                System.out.print("Numeros Digitado: ");
                for (int i=0; i< allNum.length; i++){
                    System.out.print(allNum[i] + ", ");
                }
                System.out.print("\nNumeros Pares digitados: ");
                for (int i=0; i< numPar.length; i++){
                    if (numPar[i] != 0){
                        System.out.print(numPar[i] + ", ");
                    }
                }
                System.out.print("\nNumeros Impar digitados: ");
                for (int i=0; i< numImp.length; i++){
                    if (numImp[i] != 0){
                        System.out.print(numImp[i] + ", ");
                    }
                }
                System.out.println();
                break;
            }
            case 6: {

            }
        }
    }
}
