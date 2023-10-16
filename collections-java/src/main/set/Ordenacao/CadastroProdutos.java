package main.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto5", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto0", 20d, 10);
        cadastroProdutos.adicionarProduto(1L, "Produto3", 10d, 2);
        cadastroProdutos.adicionarProduto(9L, "Produto9", 2d, 2);

        // System.out.println(cadastroProdutos.produtoSet);
        // System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirPorPreco());
    }
}
