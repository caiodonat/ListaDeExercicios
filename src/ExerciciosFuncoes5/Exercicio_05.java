package ExerciciosFuncoes5;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        System.out.println("Digite o valor do produto");
        Scanner myScanner = new Scanner(System.in);
        float valorProduto = myScanner.nextFloat();
        System.out.println("Digite a taxa a ser aplicado ao produto (Ex: 2.5, 11, 30 %)");
        float taxaProduto = myScanner.nextFloat();
        float valorTaxa = somaImposto(taxaProduto, valorProduto);//valor da taxa
        float valorFinalProduto =  alterar(valorTaxa, valorProduto);
        System.out.println("Valor final do produto: R$" + valorFinalProduto);
    }
    static float somaImposto(float taxaImposto, float custoProduto){
        return custoProduto * (taxaImposto/100);
    }
    static float alterar(float valorTaxaProduto, float custoProduto){

        return valorTaxaProduto + custoProduto;
    }
}
