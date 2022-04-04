package br.ufpb.dcx.aps.atividades.cestaitemproduto;

public class ItemCesta {


    private Produto produto;
    private int quantidade;

    public ItemCesta(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public ItemCesta(Produto produto){
        this(produto, 1);
    }

    public Produto getProduto(){
        return this.produto;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public double getTotal(){
        return this.produto.getPreco() * this.quantidade;
    }


}
