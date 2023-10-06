package set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> agenda;

    public AgendaContatos() {
        this.agenda = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        agenda.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(agenda);
    }

    public void pesquisarPorNome(String nome) {
        Set<Contato> encontrados = new HashSet<>();

        for(Contato c : agenda) {
            if(c.getNome().startsWith(nome)) {
                encontrados.add(c);
            }
        }
        System.out.println(encontrados);
    }

    public void atualizarNumeroContato(String nome, int numero) {
        Contato contatoAtuaizado = null;
        for(Contato c : agenda) {
            if (c.getNome().equalsIgnoreCase(nome)) {
               c.setNumero(numero);
               contatoAtuaizado = c;
            }
            break;
        }
        System.out.println(contatoAtuaizado);
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Igor", 123456);
        agendaContatos.adicionarContato("Igor M", 123456);
        agendaContatos.adicionarContato("M Igor", 123456);
        agendaContatos.exibirContatos();
        agendaContatos.pesquisarPorNome("Igor");
        agendaContatos.atualizarNumeroContato("Igor", 654321);
        agendaContatos.exibirContatos();

    }
}
