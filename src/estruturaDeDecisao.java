import java.util.Scanner;

public class estruturaDeDecisao {

    public static void main(String[] args){
        System.out.println("Digite o numero exemplo a ser executado");
        Scanner myExemplo = new Scanner(System.in);
        int exemploRequerido = myExemplo.nextInt();

        switch (exemploRequerido) {
            case 1 -> {
                System.out.println("digite dois numeros");
                Scanner myObj = new Scanner(System.in);
                float numero1 = myObj.nextFloat();
                float numero2 = myObj.nextFloat();
                float resultado = Math.max(numero1, numero2);
                System.out.println("Maior numero é: " + resultado);
            }
            case 2 -> {
                System.out.println("Digite um numero");
                Scanner myObj = new Scanner(System.in);
                float numero1 = myObj.nextFloat();
                if (numero1 > 0) {
                    System.out.println(numero1 + ", è Positivo");
                } else {
                    System.out.println(numero1 + ", è Negativo");
                }
            }
            case 3 -> {
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
            case 4 -> {
                System.out.println("Digite uma letra");
                Scanner myObj = new Scanner(System.in);
                char letra = myObj.next().charAt(0);
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    System.out.println(letra + ", É uma vogal");
                } else {
                    System.err.println(letra + ", É uma consoante");
                }
            }
            case 5 -> {
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
            case 6 -> {
                System.out.println("Digite 3 numeros");
                Scanner myObj = new Scanner(System.in);
                float num1 = myObj.nextFloat();
                float num2 = myObj.nextFloat();
                float num3 = myObj.nextFloat();

                float numMaior1e2 =  Math.max(num1, num2);
                float numMaiorF = Math.max(numMaior1e2, num3);
                System.out.println(numMaiorF + ", é o maior numero");
            }
            case 7 -> {
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
            case 8 -> {
                System.out.print("Na loja 1, ");
                Scanner myObj = new Scanner(System.in);
                System.out.println("Digite o valor do produto1");
                float prod1L1 = myObj.nextFloat();
                System.out.println("Digite o valor do produto2");
                float prod2L1 = myObj.nextFloat();
                System.out.println("Digite o valor do produto3");
                float prod3L1 = myObj.nextFloat();

                System.out.print("Na loja 2, ");
                System.out.println("Digite o valor do produto1");
                float prod1L2 = myObj.nextFloat();
                System.out.println("Digite o valor do produto2");
                float prod2L2 = myObj.nextFloat();
                System.out.println("Digite o valor do produto3");
                float prod3L2 = myObj.nextFloat();

                System.out.print("Na loja 3, ");
                System.out.println("Digite o valor do produto1");
                float prod1L3 = myObj.nextFloat();
                System.out.println("Digite o valor do produto2");
                float prod2L3 = myObj.nextFloat();
                System.out.println("Digite o valor do produto3");
                float prod3L3 = myObj.nextFloat();

                //float prod1 = Math.min(prod1L1, prod1L2);
                //float prod1Melhor = Math.min(prod1, prod1L3);

                /*
                float[] loja1 = {prod1L1, prod2L1, prod3L1};
                float[] loja2 = {prod1L2, prod2L2, prod3L2};
                float[] loja3 = {prod1L3, prod2L3, prod3L3};
                 */
                float[] prod1 = {prod1L1, prod1L2, prod1L3};
                float prod1Melhor;

                for (int i=0; i<prod1.length; i++) {


                    /*
                    float prod1Melhor = Math.min(Math.min(loja1[0], loja2[0]), loja3[0]);
                    float prod2Melhor = Math.min(Math.min(loja1[1], loja2[1]), loja3[1]);
                    float prod3Melhor = Math.min(Math.min(loja1[2], loja2[2]), loja3[2]);

                     */
                }

                System.out.println("Loja 1, Melhores produtos: ");


            }//inacabado
            case 9 -> {
                double[] num = new double[4];
                double[] nSequancia = new double[4];
                int num1=0;
                int num2=0;
                int num3=0;
                int num4=0;

                System.out.println("Digite 3 numeros");
                Scanner myObj = new Scanner(System.in);

                for (int i=0; i<num.length; i++) { //guardando os valores
                    num[i] = myObj.nextFloat();
                }

                if (num[0] > num[1]) { //posição no numero 1 (num[0])
                    num1 = num1 + 1;
                }
                if (num[0] > num[2]) {
                    num1 = num1 + 1;
                }

                if (num[1] > num[0]) { //posição no numero 2 (num[1])
                    num2 = num2 + 1;
                }
                if (num[1] > num[2]) {
                    num2 = num2 + 1;
                }

                if (num[2] > num[0]) { //posição no numero 3 (num[2])
                    num3 = num3 + 1;
                }
                if (num[2] > num[1]) {
                    num3 = num3 + 1;
                }

                if (num[2] > num[0]) { //posição no numero 4 (num[2])
                    num3 = num3 + 1;
                }
                if (num[2] > num[1]) {
                    num3 = num3 + 1;
                }
                System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);

                System.out.println(num[num1] + " " + num[num2] + " " + num[num3] + " " + num[num4]);



                
            }
        }
    }
}
