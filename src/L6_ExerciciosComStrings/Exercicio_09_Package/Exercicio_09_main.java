package L6_ExerciciosComStrings.Exercicio_09_Package;

import java.util.Scanner;

public class Exercicio_09_main {

    private Boolean formatacaoCPFVerificacaoB;
    private Boolean primeiroDigitoVerificacaoB;

    public void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String cpfDigitado;
        do {
            do {
                System.out.println("Digite seu CPF (no formato: 123.456.789-10)");
                cpfDigitado = myScanner.nextLine();
                formatacaoCPFVerificacao(cpfDigitado);
                if (formatacaoCPFVerificacaoB) {
                    System.out.println("Formatação do CPF valida\n");
                    break;
                } else {
                    System.out.println("formatação do CPF esta incorreta\n");
                }
            } while (formatacaoCPFVerificacaoB);

            primeiroDigitoVerificacao(cpfDigitado);
            //segundoDigitoVerificacao(cpfDigitado);

            if (primeiroDigitoVerificacaoB){
                System.out.println("CPF invalido");
            }
        }while (!primeiroDigitoVerificacaoB);
        System.out.println("CPF Valido");
    }

    public void formatacaoCPFVerificacao(String cpfDigitado) {
        String[] cpfDSplit = cpfDigitado.split("");
        if (cpfDSplit[3].equals(".") && cpfDSplit[7].equals(".") && cpfDSplit[11].equals("-")){
            this.formatacaoCPFVerificacaoB = true;
        }
    }

    public void primeiroDigitoVerificacao(String cpfDigitado) {
        String[] cpfDSplit = cpfDigitado.split("");
        String[] cpfSemUntimo2Digitos = cpfDigitado.split("-");

        String[] cpfFormatadoSplit = (cpfSemUntimo2Digitos[0].replaceAll("[.]", "")).split("");

        int validacaoCPF = 10;
        int validacao1Digito = 0;
        int validacao2Digito = 0;
        for (int i = 0; i < cpfFormatadoSplit.length; i++) {
            validacao1Digito += Integer.parseInt(cpfFormatadoSplit[i]) * validacaoCPF;
            validacaoCPF--;
        }
        System.out.println(validacao1Digito);
        System.out.println((validacao1Digito * 10) % 11);
        System.out.println(cpfDSplit[12]);

        if ((validacao1Digito * 10) % 11 == Integer.parseInt(cpfDSplit[12])){
            this.primeiroDigitoVerificacaoB = true;
        }
    }

    public static void segundoDigitoVerificacao(String cpfDigitado) {
    }
}
