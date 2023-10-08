package map;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagem;

    public ContagemPalavras() {
        this.contagem = new HashMap<>();
    }

    public void adicionarPalavras(String linguagem, Integer quantidade) {
        contagem.put(linguagem, quantidade);
    }

    public void removerPalavra(String palavra) {
        contagem.remove(palavra);
    }

    public void exibirContagemPalavras() {
        System.out.println(contagem.size());
    }

    public void encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        Integer contagemMaisFrequente = null;

        for(Map.Entry<String, Integer> entry : contagem.entrySet()) {
            if (palavraMaisFrequente == null) {
                palavraMaisFrequente = entry.getKey();
                contagemMaisFrequente = entry.getValue();
            }
            if(contagemMaisFrequente < entry.getValue()) {
                palavraMaisFrequente = entry.getKey();
                contagemMaisFrequente = entry.getValue();
            }
        }

        System.out.println(palavraMaisFrequente);
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adicionarPalavras("abc", 2);
        contagemPalavras.adicionarPalavras("def", 4);
        contagemPalavras.adicionarPalavras("ghi", 1);

        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.encontrarPalavraMaisFrequente();

        contagemPalavras.removerPalavra("abc");

        contagemPalavras.exibirContagemPalavras();
    }

}
