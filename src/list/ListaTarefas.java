package list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> lista;

    public ListaTarefas() {
        this.lista = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        lista.add(new Tarefa((descricao)));
    }

    public void removerTarefa(String descricao) {
        // garantir que remove os duplicados através do removeAll que exige uma collection
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : lista) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        lista.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return lista.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(lista);
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        System.out.println("lista deve vir vazia: " + lista.obterNumeroTotalTarefas());
        System.out.println("tarefa 1 adicionada");
        lista.adicionarTarefa("Nova Tarefa 1");
        System.out.println("numero total de tarefas após inserir 1 (esperado 1): " + lista.obterNumeroTotalTarefas());
        lista.adicionarTarefa("Nova Tarefa 2");
        System.out.println("descrições das tarefas (esperado 2 descrições): ");
        lista.obterDescricoesTarefas();
        lista.adicionarTarefa("Nova Tarefa 1");
        System.out.println("descrições das tarefas (esperado 3 descrições): ");
        lista.obterDescricoesTarefas();
        System.out.println("removido a tarefa 1 - deve remover 2 entradas: ");
        lista.removerTarefa("Nova Tarefa 1");
        lista.obterDescricoesTarefas();
    }
}
