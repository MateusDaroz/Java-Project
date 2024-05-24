public abstract class Produto {

    private String descricao;
    private static int increment=1;
    private int codProduto;
    private double preco;

    public Produto() {
    }

    public Produto(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
        this.codProduto=increment;
        increment++;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString(){
        return "Código: " +codProduto +
                "\nDescrição Geral: " +descricao;
    }
}
