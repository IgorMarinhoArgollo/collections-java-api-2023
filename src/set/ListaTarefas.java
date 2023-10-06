package set;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        for (Tarefa t : listaTarefas) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                listaTarefas.remove(t);
            }
            break;
        }
    }

    public void exibirTarefas() {
        System.out.println(listaTarefas);
    }

    public void contarTarefas(){
        System.out.println(listaTarefas.size());
    }

    public void obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : listaTarefas) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        System.out.println(tarefasConcluidas);
    }

    public void obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : listaTarefas) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        System.out.println(tarefasPendentes);
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : listaTarefas) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : listaTarefas) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(false);
            }
        }
    }

    public void limparListaTarefas() {
        listaTarefas = new HashSet<>();
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("Tarefa1");
        lista.adicionarTarefa("Tarefa2");
        lista.adicionarTarefa("Tarefa3");

        lista.exibirTarefas();
        lista.contarTarefas();

        lista.marcarTarefaConcluida("Tarefa1");
        lista.removerTarefa("Tarefa3");

        lista.obterTarefasConcluidas();
        lista.obterTarefasPendentes();

        lista.marcarTarefaPendente("Tarefa1");
        lista.obterTarefasPendentes();

        lista.limparListaTarefas();
        lista.contarTarefas();
    }
}
