package list;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> lista;

    public CatalogoLivros() {
        this.lista = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano) {
        lista.add(new Livro(titulo, autor, ano));
    }
    public void pesquisaPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!lista.isEmpty()) {
            for(Livro l :lista) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        System.out.println(livrosPorAutor);
    }

    public void pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosNoIntervalo = new ArrayList<>();
        if(!lista.isEmpty()) {
            for(Livro l :lista) {
                if(l.getAno()>=anoInicial && l.getAno() <= anoFinal) {
                    livrosNoIntervalo.add(l);
                }
            }
        }
        System.out.println(livrosNoIntervalo);
    }

    public void pesquisaPorTitulo(String titulo) {
        Livro livroEncontrado = null;
        if(!lista.isEmpty()) {
            for(Livro l: lista) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroEncontrado = l;
                    break;
                }
            }
        }
        System.out.println(livroEncontrado);
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("Livro1", "Autor 1", 2020);
        catalogo.adicionarLivro("Livro1", "Autor 2", 2021);
        catalogo.adicionarLivro("Livro2", "Autor 2", 2022);
        catalogo.adicionarLivro("Livro3", "Autor 3", 2023);
        catalogo.adicionarLivro("Livro4", "Autor 4", 2024);

        catalogo.pesquisaPorTitulo("Livro1");

        catalogo.pesquisaPorAutor("Autor 2");

        catalogo.pesquisaPorIntervaloAnos(2021, 2023);
    }
}
