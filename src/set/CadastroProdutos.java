package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtos.add(new Produto(cod, nome, preco, quantidade));
    }

    public void exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtos);
        System.out.println(produtosPorNome);
    }

    public void exibirProdutoPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtos);
        System.out.println(produtosPorPreco);
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(123, "produto1", 12.50, 2);
        cadastroProdutos.adicionarProduto(456, "produto5", 10.50, 2);
        cadastroProdutos.adicionarProduto(789, "produto2", 188.50, 2);

        cadastroProdutos.exibirProdutosPorNome();
        cadastroProdutos.exibirProdutoPorPreco();
    }
}
