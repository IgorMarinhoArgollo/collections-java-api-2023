package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        palavras.remove(palavra);
    }

    public void verificaPalavra(String palavra) {
        if(palavras.contains(palavra)) {
            System.out.println("palavra na lista");
        } else {
            System.out.println("palavra não está inclusa na lista");
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavras);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas= new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("asd");
        conjuntoPalavrasUnicas.adicionarPalavra("asd");
        conjuntoPalavrasUnicas.adicionarPalavra("sdfsd");
        conjuntoPalavrasUnicas.adicionarPalavra("zxc");

        conjuntoPalavrasUnicas.verificaPalavra("asd");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("zxc");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
