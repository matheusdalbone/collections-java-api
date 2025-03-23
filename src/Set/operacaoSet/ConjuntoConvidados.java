package Set.operacaoSet;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, Integer codigoConvidado) {
        this.convidados.add(new Convidado(nome, codigoConvidado));
    }

    public void exibirConvidados() {
        if(!this.convidados.isEmpty()) {
            this.convidados.forEach(convidado -> {
                System.out.println("Nome do convidado: " + convidado.getNome() + "\nCodigo do convidado: " + convidado.getCodigoConvite());
            });
        } else {
            System.out.println("Lista de convidados vazia!");
        }
    }

    public void removerConvidadoPorCodigoConvite(Integer codigoConvite) {
        if (!this.convidados.isEmpty()){
            Convidado convidadoRemovido = null;
            for (Convidado convidado : this.convidados) {
                if(convidado.getCodigoConvite().equals(codigoConvite)) {
                    convidadoRemovido = convidado;
                }
            }
            this.convidados.remove(convidadoRemovido);
        }
    }

    public void contarConvidados() {
        System.out.println(this.convidados.size());
    }

    @Override
    public String toString() {
        return "Convidados: " + convidados;
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("dalcin3", 69);
        conjuntoConvidados.adicionarConvidado("dalcin1", 691);
        conjuntoConvidados.adicionarConvidado("dalcin2 ", 691);
        conjuntoConvidados.adicionarConvidado("dalcin5", 6912);
        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(69);
        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.contarConvidados();
    }
}
