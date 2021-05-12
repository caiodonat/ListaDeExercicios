import java.util.Scanner;
/*
5.Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.
6.Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois modifique o programa para que ele mostre os números um ao lado do outro.
7.Faça um programa que leia 5 números e informe o maior número.
8.Faça um programa que leia 5 números e informe a soma e a média dos números.
9.Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
10.Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.

 */
public class estruturaDeRepeticao {
    public static void main(String[] args){
        System.out.println("Seja muito bem vindo ha nossa 3 lista de exercicios,\nQual exemplo vc deseja reproduzir?");
        Scanner numeroDigitado = new Scanner(System.in);
        int myExemplos = numeroDigitado.nextInt();

        switch (myExemplos){
            case 1: {
                boolean numDigBoolean = false;

                while (!numDigBoolean) {
                    System.out.println("Digite uma nota entre 0 ate 10;");
                    Scanner myObj = new Scanner(System.in);
                    int numDig = myObj.nextInt();

                    for (int i=0; i<=10; i++){
                        if (numDig == i){
                            System.out.println("Valor valido, parabens.");
                            numDigBoolean = true;
                            break;
                        }
                    }
                    if (numDigBoolean) {
                        break;
                    }
                    System.out.println("Numero Invalido, por favor tente novamente.");
                }
            }
            case 2: {
                boolean loginIgual = true;
                while (loginIgual) {
                    String[] login = new String[2];
                    System.out.println("Digite um nome de Usuario");
                    Scanner myObj = new Scanner(System.in);
                    login[0] = myObj.next();
                    System.out.println("Digite uma Senha");
                    login[1] = myObj.next();
                    if (!login[0].equals(login[1])) {
                        loginIgual = false;
                        break;
                    }
                    System.out.println("Usuario e Senha iguais, tente outra combinação");
                }
                System.out.println("Usuario e Senha validos.");
            }
            case 3: {
                boolean nomeTesteB = false;
                String[] nomeTeste = new String[3];
                boolean idadeTesteB = false;
                boolean salarioTesteB = false;
                boolean sexoTesteB = false;
                boolean estadoCivilTesteB = false;

                while (!nomeTesteB) {

                    System.out.println("Digite seu nome");
                    Scanner myObj = new Scanner(System.in);
                    String nome = myObj.next();

                    if (nome.length() > nomeTeste.length) {
                        System.out.println("Nome valido\n");
                        nomeTesteB = true;
                        break;
                    }
                    System.out.println("alguma informação nao é valida");
                }
                while (!idadeTesteB) {
                    System.out.println("Digite sua idade");
                    Scanner myObj = new Scanner(System.in);
                    int idadeTeste = myObj.nextInt();

                    for (int i=0; i<=150; i++){
                        if (idadeTeste == i){
                            idadeTesteB = true;
                            break;
                        }
                    }
                    if (idadeTesteB){
                        System.out.println("Idade valida\n");
                        break;
                    }
                    System.out.println("Idade invalida, tente novamente.");
                }
                while (!salarioTesteB) {
                    System.out.println("Digite seu Salario");
                    Scanner myObj = new Scanner(System.in);
                    float salario = myObj.nextFloat();

                    if (salario > 0){
                        System.out.println("Salario valido\n");
                        break;
                    }
                    System.out.println("Salario invalido");
                }
                while (!sexoTesteB) {
                    System.out.println("Qual o seu Sexo?");
                    Scanner myObj = new Scanner(System.in);
                    char sexoTeste = myObj.next().charAt(0);

                    switch (sexoTeste){
                        case 'f': { sexoTesteB = true; }
                        case 'F': { sexoTesteB = true; }
                        case 'm': { sexoTesteB = true; }
                        case 'M': { sexoTesteB = true; }
                    }
                    if (sexoTesteB){
                        System.out.println("Sexo Valido\n");
                        break;
                    }
                    System.out.println("Sexo invalido\n");
                }
                while (!estadoCivilTesteB) {
                    System.out.println("Qual o seu Sexo?");
                    Scanner myObj = new Scanner(System.in);
                    char estadoCivilTeste = myObj.next().charAt(0);

                    switch (estadoCivilTeste) {
                        case 's': {
                            estadoCivilTesteB = true;
                        }
                        case 'c': {
                            estadoCivilTesteB = true;
                        }
                        case 'v': {
                            estadoCivilTesteB = true;
                        }
                        case 'd': {
                            estadoCivilTesteB = true;
                        }
                        case 'S': {
                            estadoCivilTesteB = true;
                        }
                        case 'C': {
                            estadoCivilTesteB = true;
                        }
                        case 'V': {
                            estadoCivilTesteB = true;
                        }
                        case 'D': {
                            estadoCivilTesteB = true;
                        }
                    }
                    if (estadoCivilTesteB) {
                        System.out.println("Dado Valido\n");
                        break;
                    }
                    System.out.println("Dado invalido\n");
                }

                System.out.println("todas as informações são validas.");
            }
            case 4: {
                float popuPaisA = 80000F;//3%
                float popuPaisB = 200000F;//1,5%
                int anos = 0;

                while (popuPaisA<popuPaisB){
                    anos ++;
                    popuPaisA += popuPaisA * 0.03F;
                    popuPaisB += popuPaisB * 0.015F;
                }
                System.out.println("Quantidade de anos necessarios: " + anos);
            }
            case 5: {
                float popuPaisB = 0F;
                float taxaPaisB = 0.0F;
                int anos = 0;

                System.out.println("Simulador de crescimento populacional\nDigite a populaçao do pais A");
                Scanner myObj = new Scanner(System.in);
                float popuPaisA = myObj.nextFloat();
                System.out.println("Digita a Taxa de crescimento do Pais A");
                float taxaPaisA = myObj.nextFloat();


                while (popuPaisA<popuPaisB){
                    anos ++;
                    popuPaisA += popuPaisA * taxaPaisA;
                    popuPaisB += popuPaisB * taxaPaisB;
                }
                System.out.println("Quantidade de anos necessarios: " + anos);

            }
        }
    }
}
