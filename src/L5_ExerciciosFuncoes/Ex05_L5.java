package L5_ExerciciosFuncoes;

public class Ex05_L5 {
    private double valorProduto;
    private double taxaProduto;
    private double valorTaxa;
    private double valorProdutoFinal;

    public void setValorProduto(double valorProduto){
        this.valorProduto = valorProduto;
    }
    public double getValorProduto(){
        return this.valorProduto;
    }

    public void setTaxaProduto(double taxaProduto){
        this.taxaProduto = taxaProduto;
    }
    public double getTaxaProduto(){
        return this.taxaProduto;
    }


    public void setValorTaxa() {
        this.valorTaxa = this.valorProduto * (this.taxaProduto / 100);
    }
    public double getValorTaxa() {
        return valorTaxa;
    }


    public void setValorProdutoFinal() {
        this.valorProdutoFinal = this.valorProduto + this.valorTaxa;
    }
    public double getValorProdutoFinal() {
        return valorProdutoFinal;
    }
}
