package Set.pesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, String numero) {
        this.agendaContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        if (!this.agendaContatos.isEmpty()) {
            this.agendaContatos.forEach(contato -> {
                System.out.println("Nome: " + contato.getNome() + "\nNumero: " + contato.getNumero());
            });
        }
    }

    public void pesquisarPorNome(String nome) {
        if(!this.agendaContatos.isEmpty()) {
            Set<Contato> contatosEncontrados = null;
            for (Contato contato : this.agendaContatos) {
                if (contato.getNome().equalsIgnoreCase(nome)) {
                    System.out.println("Nome: " + contato.getNome() + "\nNumero: " + contato.getNumero());
                }
            }
        }
    }

    public void atualizarNumeroContato(String nome, String numero) {
        if(!this.agendaContatos.isEmpty()){
            for (Contato contato : this.agendaContatos) {
                if(contato.getNome().equalsIgnoreCase(nome)) {
                    contato.setNumero(numero);
                }
            }
        }
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Dalcin1", "21995552456");
        agendaContatos.adicionarContato("Dalcin2", "21995551256");
        agendaContatos.adicionarContato("Dalcin3", "21995552458");

        agendaContatos.pesquisarPorNome("dalcin1");

        agendaContatos.atualizarNumeroContato("dalcin1", "21984356725");
        agendaContatos.pesquisarPorNome("dalcin1");
    }
}
