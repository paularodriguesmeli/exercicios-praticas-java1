package javaI.supermercado;

public class Produto {

    private String nomeProduto;
    private double precoProduto;
    private int qtdeProduto;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQtdeProduto() {
        return qtdeProduto;
    }

    public void setQtdeProduto(int qtdeProduto) {
        this.qtdeProduto = qtdeProduto;
    }

    @Override
    public String toString() {
        return "Produto: " + nomeProduto +
                "\npreço: R$ " + precoProduto +
                "\nQuantidade Comprada: " + qtdeProduto + "\n";
    }

    public double calculaPrecoItem(double precoProduto, int qtdeProduto) {
        return precoProduto * qtdeProduto;
    }
}
