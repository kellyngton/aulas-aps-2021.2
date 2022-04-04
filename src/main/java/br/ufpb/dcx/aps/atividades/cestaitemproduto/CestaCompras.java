package br.ufpb.dcx.aps.atividades.cestaitemproduto;

import java.util.*;

public class CestaCompras {

    private Map<Produto, ItemCesta> mapItens = new LinkedHashMap<>();

    public void addProduto(Produto produto) {
        mapItens.put(produto, new ItemCesta(produto));
    }

    public void addProduto(Produto produto, int quantidade) {
        mapItens.put(produto, new ItemCesta(produto, quantidade));

    }

    public void setQuantidade(Produto produto, int quantidade) {
        mapItens.get(produto).setQuantidade(quantidade);
    }

    public void removerProduto(Produto produto) {
        mapItens.remove(produto);

    }

    public List<ItemCesta> getItens() {
        return mapItens.values();
    }

}
