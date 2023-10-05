package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> lista;

    public OrdenacaoPessoas() {
        this.lista = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        lista.add(new Pessoa(nome, idade, altura));
    }

    public void ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(lista);
        Collections.sort(pessoasPorIdade);

        System.out.println(pessoasPorIdade);
    }

    public void ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(lista);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());

        System.out.println(pessoasPorAltura);
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("pessoa1", 20, 1.65);
        ordenacaoPessoas.adicionarPessoa("pessoa2", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("pessoa3", 22, 1.80);
        ordenacaoPessoas.adicionarPessoa("pessoa4", 30, 1.78);

        ordenacaoPessoas.ordenarPorAltura();

        ordenacaoPessoas.ordenarPorIdade();
    }
}
