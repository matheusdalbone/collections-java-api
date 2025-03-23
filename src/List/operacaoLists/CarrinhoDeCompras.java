package List.operacaoLists;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itensNoCarrinho = new ArrayList<>();
    private Double valorTotalCarrinho = 0.0;

    public void adicionarItem(String nome, Double preco, Integer quantidade) {
        this.itensNoCarrinho.add(new Item(nome, preco, quantidade));
        System.out.println(nome + " adicionado com sucesso ao carrinho!");
    }

    public void removerItem(String nome) {
        if(this.itensNoCarrinho.isEmpty()) {
            System.out.println("Carrinho vazio!");
        } else {
            this.itensNoCarrinho.removeIf(item -> item.getNome().equals(nome));

        }
    }

    public void calcularValorTotal() {
        if (this.itensNoCarrinho.isEmpty()) {
            System.out.println("Carrinho vazio!");
        } else {
           this.itensNoCarrinho.forEach(item -> {
               this.valorTotalCarrinho += item.getPreco() * item.getQuantidade();
           });
           System.out.printf("Valor total do carrinho: R$%.2f\n", this.valorTotalCarrinho);
        }
    }

    public void exibirItens() {
        this.itensNoCarrinho.forEach(item -> {
            System.out.printf("Nome do Item: %s Preço: R$%.2f Quantidade: %d\n", item.getNome(), item.getPreco(), item.getQuantidade());
        });
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("computador", 1600.0, 1);
        carrinhoDeCompras.adicionarItem("mouse", 200.0, 2);
        carrinhoDeCompras.adicionarItem("teclado", 120.0, 5);
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("computador");
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();
    }
}
