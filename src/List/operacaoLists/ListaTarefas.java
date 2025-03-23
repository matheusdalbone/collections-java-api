package List.operacaoLists;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefas> listaDeTarefas = new ArrayList<>();

    public List<Tarefas> getListaDeTarefas() {
        return listaDeTarefas;
    }

    public void setListaDeTarefas(List<Tarefas> listaDeTarefas) {
        this.listaDeTarefas = listaDeTarefas;
    }

    public void adicionarTarefa(String descricao) {
        this.listaDeTarefas.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao) {
        if(this.listaDeTarefas.isEmpty()) {
            System.out.println("Lista vazia!");
        } else {
            this.listaDeTarefas.removeIf(tarefa -> tarefa.getDescricao().equals(descricao));
        }

    }

    public void obterNumeroTotalTarefas() {
        System.out.println("Numero total de tarefas:" + this.listaDeTarefas.size());
    }

    public void obterDescricoesTarefas() {
        if(this.listaDeTarefas.isEmpty()) {
            System.out.println("Lista vazia!");
        } else {
            this.listaDeTarefas.forEach(tarefas -> {
                System.out.println(tarefas.getDescricao());
            });
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar");
        listaTarefas.adicionarTarefa("Jogar");
        listaTarefas.adicionarTarefa("Trabalhar");

        listaTarefas.obterNumeroTotalTarefas();
        listaTarefas.obterDescricoesTarefas();
        listaTarefas.removerTarefa("Jogar");
        listaTarefas.obterNumeroTotalTarefas();
        listaTarefas.obterDescricoesTarefas();
    }
}
