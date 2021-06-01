package EstruturaDeDecisao2;

import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        System.out.println("Salario do atual do funcionario");
        Scanner myObj = new Scanner(System.in);
        double salarioAtual = myObj.nextFloat();
        double salarioNovo = 0;
        double percentual = 0;
        double valorAlmento = 0;

        if (salarioAtual >= 1500){
            percentual = 5;
            valorAlmento = salarioAtual * (percentual/100);
            salarioNovo = salarioAtual + valorAlmento;
        }else if (salarioAtual >= 700){
            percentual = 10;
            valorAlmento = salarioAtual * (percentual/100);
            salarioNovo = salarioAtual + valorAlmento;
        }else if(salarioAtual >= 280){
            percentual = 15;
            valorAlmento = salarioAtual * (percentual/100);
            salarioNovo = salarioAtual + valorAlmento;
        }else if(salarioAtual > 0){
            percentual = 20;
            valorAlmento = salarioAtual * (percentual/100);
            salarioNovo = salarioAtual + valorAlmento;
        }else if(salarioAtual <= 0){
            System.err.println("Não é um funcionario é Escravo!!");
        }
        System.out.println("Salario antes do reajuste: R$" + salarioAtual);
        System.out.println("Percentual de almento aplicado: " + percentual + "%");
        System.out.printf("Valor do aumento: R$%.2f", valorAlmento);
        System.out.println("\nNovo salário, após o aumento: R$" + salarioNovo);
    }
}
