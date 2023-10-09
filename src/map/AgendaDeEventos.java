package map;

import java.time.Duration;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaDeEventos {

    private Map<LocalDate, Evento> agenda;

    public AgendaDeEventos() {
        this.agenda = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        agenda.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agenda);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agenda);
        Map.Entry<LocalDate, Evento> evento = null;
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (LocalDate.now().atStartOfDay().toLocalDate().compareTo(entry.getKey()) < 0) {
                evento = entry;
                break;
            }
        }
        System.out.println(evento);
    }

    public static void main(String[] args) {
        AgendaDeEventos agendaDeEventos = new AgendaDeEventos();
        agendaDeEventos.adicionarEvento(LocalDate.of(2023, 10, 8), "hoje", "nada");
        agendaDeEventos.adicionarEvento(LocalDate.of(2023, 10, 9), "amanha", "nadaTambem");
        agendaDeEventos.adicionarEvento(LocalDate.of(2023, 10, 10), "depoisDeAmanha", "nadaNovo");
        agendaDeEventos.exibirAgenda();
        agendaDeEventos.obterProximoEvento();
    }
}
