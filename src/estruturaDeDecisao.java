import java.util.Scanner;

public class estruturaDeDecisao {

    public static void main(String[] args){
        System.out.println("Digite o numero exemplo a ser executado");
        Scanner myExemplo = new Scanner(System.in);
        int exemploRequerido = myExemplo.nextInt();

        switch (exemploRequerido) {
            case 1: {
                float[] numeros = new float[2];
                System.out.println("digite dois numeros");
                for (int i=0; i<numeros.length; i++){
                    Scanner myObj = new Scanner(System.in);
                    numeros[i] = myObj.nextFloat();
                }
                float resultado = Math.max(numeros[0],numeros[1]);
                System.out.println("Maior numero é: " + resultado);
            }
            case 2: {
                System.out.println("Digite um numero");
                Scanner myObj = new Scanner(System.in);
                float numero1 = myObj.nextFloat();
                if (numero1 > 0) {
                    System.out.println(numero1 + ", è Positivo");
                } else {
                    System.out.println(numero1 + ", è Negativo");
                }
            }
            case 3: {
                System.out.println("Escolha entre 'M' ou 'F'");
                Scanner myObj = new Scanner(System.in);
                char letraSx = myObj.next().charAt(0); //metodo para agregar á variaveis tipo "Char"
                if (letraSx == 'M' || letraSx == 'm') {
                    System.out.println("Masculino");
                } else if (letraSx == 'F' || letraSx == 'f') {
                    System.out.println("Feminino");
                } else {
                    System.err.println("Sexo inválido");
                }
            }
            case 4: {
                System.out.println("Digite uma letra");
                Scanner myObj = new Scanner(System.in);
                char letra = myObj.next().charAt(0);
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    System.out.println(letra + ", É uma vogal");
                } else {
                    System.err.println(letra + ", É uma consoante");
                }
            }
            case 5: {
                System.out.println("Digite a primeira notas parciais");
                Scanner lNotaParc1 = new Scanner(System.in);
                float notaParc1 = lNotaParc1.nextFloat();

                System.out.println("Digite a segunda notas parciais");
                Scanner lNotaParc2 = new Scanner(System.in);
                float notaParc2 = lNotaParc2.nextFloat();

                float media = (notaParc1 + notaParc2) / 2;

                if (media >= 7){
                    System.out.println("Aprovado");
                } else if (media < 7) {
                    System.out.println("Reprovado");
                } else  if (media == 10) {
                    System.out.println("Aprovado com Distinção");
                }
            }
            case 6: {
                System.out.println("Digite 3 numeros");
                Scanner myObj = new Scanner(System.in);
                float num1 = myObj.nextFloat();
                float num2 = myObj.nextFloat();
                float num3 = myObj.nextFloat();

                float numMaior1e2 =  Math.max(num1, num2);
                float numMaiorF = Math.max(numMaior1e2, num3);
                System.out.println(numMaiorF + ", é o maior numero");
            }
            case 7: {
                System.out.println("Digite 3 numeros");
                Scanner myObj = new Scanner(System.in);
                float num1 = myObj.nextFloat();
                float num2 = myObj.nextFloat();
                float num3 = myObj.nextFloat();

                float numMaior1e2 = Math.max(num1, num2);
                float numMaiorF = Math.max(numMaior1e2, num3);

                float numMenor1e2 = Math.min(num1, num2); //Math.min(numeroA, numeroB) retorna o menor numero.
                float numMenorF = Math.min(numMenor1e2, num3);

                System.out.println(numMaiorF + ", é o Maior numero");
                System.out.println(numMenorF + ", é o Menor numero");
            }
            case 8: {
                double [][][] lojasProdutos = new double[4][3][2];//lojasProdutos[P][L]
                for (int i=0; i<3; i++) {
                    for (int j=0; j<4; j++) {
                        System.out.println("Qual o valor do pruduto " + (j+1) + ", na Loja " + (i+1));
                        Scanner myObj = new Scanner(System.in);
                        lojasProdutos [j][i][0] = myObj.nextFloat();
                    }
                }

                System.out.println();
                for (int i=0; i<4; i++) {
                    for (int j=0; j<3; j++) {
                        for (int q=0; q<3; q++) {
                            lojasProdutos[i][j][1] = lojasProdutos[i][j][0] > lojasProdutos[i][q][0] ? lojasProdutos[i][j][1] + 1 : lojasProdutos[i][j][1];
                        }
                    }
                }

                for (int i=0; i<3; i++){//[P][L]
                    System.out.println("Produtos na Loja " + (i+1) + ": ");
                    for (int j=0; j<4; j++){
                        if (lojasProdutos[j][i][1] == 0){
                            System.out.println("Produto " + (j+1) + ", Barato: R$" + lojasProdutos[j][i][0]);
                        }else {
                            System.out.println("Produto " + (j+1) + ", Caro: R$" + lojasProdutos[j][i][0]);
                        }
                    }
                }

            }
            case 9: {
                double[][] num = new double[4][2];
                double[] nSequancia = new double[4];

                System.out.println("Digite 4 numeros");
                Scanner myObj = new Scanner(System.in);

                for (int i = 0; i < num.length; i++) { //guardando os valores
                    num[i][0] = myObj.nextFloat();
                }

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        num[i][1] = num[i][0] > num[j][0] ? num[i][1] + 1 : num[i][1];
                    }
                }

                for (int i=0; i<4; i++){
                    for (int j=0; j<4; j++){
                        if (num[j][1] == i){
                            System.out.print(num[j][0] + ", ");
                        }
                    }
                }


            }
            case 10: {
                System.out.println("Em qual turma vc estuda?\nM-Matutino, V-Vespertino ou N-Noturno");
                Scanner myObj = new Scanner(System.in);
                char letraTurno = myObj.next().charAt(0);
                switch (letraTurno){
                    case 'v': {
                        System.out.println("Bom Dia!");
                    }break;

                    case 'm': {
                        System.out.println("Boa Tarde!");
                    }break;

                    case 'n': {
                        System.out.println("Boa Noite!");
                    }break;

                    default:
                        System.out.println("Valor inválido!");
                        break;
                }
            }
        }
    }
}
