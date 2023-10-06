package main.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosDoAutor = new ArrayList<>();

        if (!livros.isEmpty()) {
            for (Livro livro : livros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosDoAutor.add(livro);
                }
            }
        }

        return livrosDoAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if (!livros.isEmpty()) {
            for (int anoAtual = anoInicial; anoAtual <= anoFinal; anoAtual++) {
                for (Livro livro : livros) {
                    if (livro.getAnoPublicacao() == anoAtual) {
                        livrosPorIntervaloAnos.add(livro);
                    }
                }
            }
        }

        return livrosPorIntervaloAnos;
    }

    public List<Livro> pesquisarPorTitulo(String titulo) {
        List<Livro> livrosTituloCorrespondente = new ArrayList<>();

        if (!livros.isEmpty()) {
            for (Livro livro : livros) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livrosTituloCorrespondente.add(livro);
                    break;
                }
            }
        }
        return livrosTituloCorrespondente;
    }

    public static void main(String[] args) {
        CatalogoLivros biblioteca = new CatalogoLivros();

        biblioteca.adicionarLivro("O instituto", "Stephen King", 2010);
        biblioteca.adicionarLivro("It a Coisa", "Stephen King", 1995);
        biblioteca.adicionarLivro("It a Coisa", "Stephen King", 1998);
        biblioteca.adicionarLivro("Toda luz que não podemos ver", "Anthony Doerr", 2015);

        // System.out.println(biblioteca.pesquisarPorAutor("Stephen King"));
        // System.out.println(biblioteca.pesquisarPorAutor("Anthony Doerr"));
        // System.out.println(biblioteca.pesquisarPorAutor("Karoline Terra"));
        System.out.println(biblioteca.pesquisarPorTitulo("It a Coisa"));
        // System.out.println(biblioteca.pesquisarPorIntervaloAnos(2010, 2015));
    }

}
