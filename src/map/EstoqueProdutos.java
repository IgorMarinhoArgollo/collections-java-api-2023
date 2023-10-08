package map;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoque;

    public EstoqueProdutos() {
        this.estoque = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoque.put(cod, new Produto(nome, preco, quantidade));
    }

    public void calcularValorTotalEstoque() {
        double total = 0;
        for(Produto p : estoque.values()) {
            total += p.getPreco()*p.getQuantidade();
        }
        System.out.println(total);
    }

    public void obterProdutoMaisCaro() {
        Produto maisCaro = null;

        for(Produto p : estoque.values()) {
            if(maisCaro == null) {
                maisCaro = p;
            };
            if(maisCaro.getPreco() < p.getPreco()) {
                maisCaro = p;
            }
        }
        System.out.println(maisCaro);
    }

    public void obterProdutoMaisBarato() {
        Produto maisBarato = null;

        for(Produto p : estoque.values()) {
            if(maisBarato == null) {
                maisBarato = p;
            };
            if(maisBarato.getPreco() > p.getPreco()) {
                maisBarato = p;
            }
        }
        System.out.println(maisBarato);
    }

    public void obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto maiorQuantidade = null;

        for(Produto p : estoque.values()) {
            if(maiorQuantidade == null) {
                maiorQuantidade = p;
            };
            if((maiorQuantidade.getPreco()*maiorQuantidade.getQuantidade()) < (p.getPreco()*p.getQuantidade())) {
                maiorQuantidade = p;
            }
        }
        System.out.println(maiorQuantidade);
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(123L, "Produto1", 2, 10.50);
        estoqueProdutos.adicionarProduto(456L, "Produto2", 1, 11.50);
        estoqueProdutos.adicionarProduto(789L, "Produto3", 3, 9.50);
        estoqueProdutos.obterProdutoMaisBarato();
        estoqueProdutos.obterProdutoMaisCaro();
        estoqueProdutos.calcularValorTotalEstoque();
        estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
    }

}
