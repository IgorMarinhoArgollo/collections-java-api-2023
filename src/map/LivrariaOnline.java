package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {
    private Map<String, Livro> livraria;

    public LivrariaOnline() {
        this.livraria = new HashMap<>();
    }

    public void adicionarLivro(String isbn, String titulo, String autor, double preco) {
        livraria.put(isbn, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        Map.Entry<String, Livro> livroParaRemover = null;
        for(Map.Entry<String, Livro> entry : livraria.entrySet()) {
            if(entry.getValue().getTitulo() == titulo) {
                livroParaRemover = entry;
            }
        }
        livraria.remove(livroParaRemover.getKey());
    }

    public void obterLivroMaisCaro() {
        Map.Entry<String, Livro> maisCaro = null;
        for(Map.Entry<String, Livro> entry : livraria.entrySet()) {
            if(maisCaro == null) {
                maisCaro = entry;
            }
            if(maisCaro.getValue().getPreco() < entry.getValue().getPreco()) {
                maisCaro = entry;
            }
        }
        System.out.println(maisCaro);
    }

    public void obterLivroMaisBarato() {
        Map.Entry<String, Livro> maisBarato = null;
        for(Map.Entry<String, Livro> entry : livraria.entrySet()) {
            if(maisBarato == null) {
                maisBarato = entry;
            }
            if(maisBarato.getValue().getPreco() > entry.getValue().getPreco()) {
                maisBarato = entry;
            }
        }
        System.out.println(maisBarato);
    }

    public void pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livros = new HashMap<>();
        for(Map.Entry<String, Livro> entry : livraria.entrySet()) {
            if(entry.getValue().getAutor() == autor) {
                livros.put(entry.getKey(), entry.getValue());
            }
        }
        System.out.println(livros);
    }

    public void exibirLivrosOrdenadosPorPreco() {
        Map<Double, Map.Entry<String, Livro>> livrosPorPreco = new HashMap<>();
        for(Map.Entry<String, Livro> entry : livraria.entrySet()) {
            livrosPorPreco.put(entry.getValue().getPreco(), entry);
        }

        System.out.println(livrosPorPreco.values());
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        livrariaOnline.adicionarLivro("123", "Livro1", "Autor1", 10.50);
        livrariaOnline.adicionarLivro("456", "Livro2", "Autor2", 9.50);
        livrariaOnline.adicionarLivro("789", "Livro3", "Autor3", 11.50);
        livrariaOnline.adicionarLivro("987", "Livro4", "Autor3", 11.50);

        livrariaOnline.pesquisarLivrosPorAutor("Autor3");

        livrariaOnline.removerLivro("Livro3");

        livrariaOnline.obterLivroMaisCaro();

        livrariaOnline.obterLivroMaisBarato();

        livrariaOnline.exibirLivrosOrdenadosPorPreco();
    }


}
