package List.ordenacaoLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoas;

    public OrdenacaoPessoas() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, Integer idade, Double altura) {
        this.pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordernarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(this.pessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(this.pessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());

        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Matheuszin1", 18, 1.73);
        ordenacaoPessoas.adicionarPessoa("Matheuszin2", 26, 1.82);
        ordenacaoPessoas.adicionarPessoa("Matheuszin3", 12, 1.56);
        ordenacaoPessoas.adicionarPessoa("Matheuszin67", 16, 1.86);
        ordenacaoPessoas.adicionarPessoa("Matheuszin4", 32, 1.67);

        System.out.println(ordenacaoPessoas.ordenarPorAltura());
        System.out.println(ordenacaoPessoas.ordernarPorIdade());
    }
}
