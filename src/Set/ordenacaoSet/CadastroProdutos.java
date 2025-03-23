package Set.ordenacaoSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(String nome, String codigoProduto, Double preco, Integer quantidade) {
        this.produtos.add(new Produto(nome, codigoProduto, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtos);

        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());

        produtosPorPreco.addAll(this.produtos);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos produtos = new CadastroProdutos();

        produtos.adicionarProduto("Televisao", "1239123f", 2500d, 1);
        produtos.adicionarProduto("Pilha", "1293h3f", 15d, 3);
        produtos.adicionarProduto("Mesa", "1823953g", 600d, 1);
        produtos.adicionarProduto("Cadeira", "123945jf", 100d, 4);

//        System.out.println(produtos.exibirProdutosPorNome());
        System.out.println(produtos.exibirProdutosPorPreco());
    }
}
