package list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        // garantir que remove os duplicados através do removeAll que exige uma collection
        List<Item> itemsParaRemover = new ArrayList<>();
        for (Item item : carrinho) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itemsParaRemover.add(item);
            }
        }
        carrinho.removeAll(itemsParaRemover);
    }

    public void calcularValorTotal() {
        double total = 0;
        for (Item item : carrinho) {
            total += (item.getPreco() * item.getQuantidade());
        }
        System.out.println("valor total do carrinho: " + total);
    }

    public void exibirItens() {
        System.out.println("items do carrinho: " + carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeVerificacao = new CarrinhoDeCompras();
        carrinhoDeVerificacao.exibirItens();
        carrinhoDeVerificacao.adicionarItem("Item1", 12.50, 10);
        carrinhoDeVerificacao.exibirItens();
        carrinhoDeVerificacao.adicionarItem("Item1", 12.50, 10);
        carrinhoDeVerificacao.removerItem("Item1");
        carrinhoDeVerificacao.exibirItens();
        carrinhoDeVerificacao.adicionarItem("Item2", 12.50, 10);
        carrinhoDeVerificacao.adicionarItem("Item3", 12.50, 10);
        System.out.println("Deve ser 250.00");
        carrinhoDeVerificacao.calcularValorTotal();
    }
}
