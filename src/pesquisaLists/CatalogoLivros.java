package pesquisaLists;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, Integer anoPublicacao) {
        this.livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!this.livros.isEmpty()) {
            this.livros.forEach(livro -> {
                if(livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            });
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAno(Integer anoInicio, Integer anoFinal) {
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        if(!this.livros.isEmpty()){
            this.livros.forEach(livro -> {
                if(livro.getAnoPublicacao() >= anoInicio && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAno.add(livro);
                }
            });
        }

        return livrosPorIntervaloAno;
    }

    public void verCatalogoLivro() {
        this.livros.forEach(livro -> {
            System.out.printf("Titulo: %s | Autor: %s | Ano de Publicação: %d\n",livro.getTitulo(),livro.getAutor(), livro.getAnoPublicacao());
        });
    }

    public Livro pesquisarLivroPorTitulo(String titulo) {
        Livro livroPorTitulo = null;

        if(!this.livros.isEmpty()) {
            for (Livro livro : this.livros) {
                if(livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                }
            }
        }

        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Cachorro quente", "Matheuszinh", 2025);
        catalogoLivros.adicionarLivro("Cachorro meio frio", "AAAAA", 2022);
        catalogoLivros.adicionarLivro("Cachorro frio quente", "Frefrire", 2018);

        catalogoLivros.verCatalogoLivro();

        System.out.println(catalogoLivros.pesquisarLivroPorTitulo("Cachorro frio quente"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAno(2022, 2025));
        System.out.println(catalogoLivros.pesquisarPorAutor("Matheuszinh"));
    }
}
