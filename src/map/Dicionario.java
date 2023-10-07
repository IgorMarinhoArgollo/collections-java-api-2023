package map;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        dicionario.remove(palavra);
    }

    public void exibirPalavras() {
        System.out.println(dicionario);
    }

    public void pesquisarPorPalavra(String palavra) {
        System.out.println(dicionario.get(palavra));
    }

    public static void main(String[] args) {
        Dicionario palavras = new Dicionario();

        palavras.adicionarPalavra("abc", "abc");
        palavras.adicionarPalavra("def", "abc");
        palavras.adicionarPalavra("ghi", "abc");

        palavras.removerPalavra("ghi");

        palavras.pesquisarPorPalavra("abc");

        palavras.exibirPalavras();
    }
}
