package L2_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {
        System.out.println("quanto você ganha por hora e o número de horas trabalhadas no mês?");
        Scanner myObj = new Scanner(System.in);
        float ganhoHora = myObj.nextFloat();
        float horas = myObj.nextFloat();

        double salarioBruto = ganhoHora * horas;
        double percentualIR = 0;
        double valorIR = 0;
        double percentualINSS = 10;
        double valorINSS = 0;
        double percentualFGTS = 11;
        double valorFGTS = 0;
        double totalDescontos = 0;
        double salarioLiquido = 0;

        if (salarioBruto <= 900){
            percentualIR = 0;
        }else if (salarioBruto <= 1500){
            percentualIR = 5;
        }else if(salarioBruto <= 2500){
            percentualIR = 10;
        }else if(salarioBruto > 2500){
            percentualIR = 20;
        }else if(salarioBruto <= 0){
            System.err.println("Não é um funcionario, é Escravo!!");
        }
        valorIR = salarioBruto * (percentualIR/100);
        valorINSS = salarioBruto * (percentualINSS/100);
        valorFGTS = salarioBruto * (percentualFGTS/100);
        totalDescontos = valorIR + valorINSS;
        salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salario bruto (" + ganhoHora + " * " + horas + ")  : R$" + salarioBruto);
        System.out.println("(-)IR ("+percentualIR+"%)                : R$" + valorIR);
        System.out.println("(-)INSS ("+percentualINSS+"%)              : R$" + valorINSS);
        System.out.println("FGTS ("+percentualFGTS+"%)                 : R$" + valorFGTS);
        System.out.println("Total descontos              : R$" + totalDescontos);
        System.out.println("Salario liquido              : R$" + salarioLiquido);
    }
}
