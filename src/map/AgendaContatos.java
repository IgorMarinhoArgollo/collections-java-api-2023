package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer numero) {
        agendaContatos.put(nome, numero);
    }

    public void removerContato(String nome) {
        agendaContatos.remove(nome);
    }

    public void exibirContatos() {
        System.out.println(agendaContatos);
    }

    public void pesquisarPorNome(String nome) {
        System.out.println(agendaContatos.get(nome));
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("abc", 123);
        agenda.adicionarContato("abc", 321);
        agenda.adicionarContato("def", 456);
        agenda.adicionarContato("ghi", 789);

        agenda.exibirContatos();

        agenda.removerContato("def");

        agenda.pesquisarPorNome("ghi");

    }
}
