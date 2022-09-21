@AnotacaoDeClasse(name="Produto do banco de dados")
public class Produto {

    @AnotacaoDeAtributo(nome="identificador", tipo="inteiro")
    private int id;
    @AnotacaoDeAtributo(nome="descricao", tipo="texto")
    private String descricao;
    @AnotacaoDeAtributo(nome="valor", tipo="monetario")
    private double preco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
