package L1_EstruturaSequencial;

import java.util.Scanner;

public class Ex12_L1 {
    public static void main(String[] args) {System.out.println("Digite sua altura");
        Scanner myObj = new Scanner(System.in);
        float altura = myObj.nextFloat();
        System.out.printf("Seu peso ideal é: %.2f Quilos", ((72.7*altura)-58));//printF : "bla bla bla: '%.2f' bla bla", nomeDaVariavel (2:quantidades de casa apos a ',')(a espreção entre '' sera subistituida pela variavel citado apos a ',')
    }
}
