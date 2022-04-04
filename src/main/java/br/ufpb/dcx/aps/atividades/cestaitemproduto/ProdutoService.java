package br.ufpb.dcx.aps.atividades.cestaitemproduto;

public interface ProdutoService {
    public String getNome();

    public void setNome(String nome);

    public double getPreco();

    public void setPreco(double preco);

    public int getEstoque();

    public void setEstoque(int estoque);
}
