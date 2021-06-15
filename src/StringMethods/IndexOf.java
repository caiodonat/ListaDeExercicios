package StringMethods;

public class IndexOf {
    public static void main(String[] args) {
        String stringExemplo = "Hello World";
        int posicaoH = stringExemplo.indexOf("H");
        System.out.println("posicaoH: " + posicaoH);
        int posicaoW = stringExemplo.indexOf("W");
        System.out.println("posicaoW: " + posicaoW);
        int posicoaO = stringExemplo.indexOf("o");
        System.out.println("posicoaO: " + posicoaO);
        //public int indexOf(String str, int fromIndex)
        int posicaoO2 = stringExemplo.indexOf("o", 5);
        System.out.println("posicoaO2: " + posicaoO2);
        int posicaoO3 = stringExemplo.indexOf("o", 8);//8 pq o ultimo "o" esta na posicao 7 (gerando um erro)
        System.out.println("posicoaO2: " + posicaoO3);
    }
}
