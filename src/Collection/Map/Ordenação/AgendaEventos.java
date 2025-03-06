package Collection.Map.Ordenação;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    // Atributos

    Map<LocalDate, Eventos> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    // Métodos

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        // Eventos eventos = new Eventos(nome, atracao);
        // eventosMap.put(data, eventos);
        eventosMap.put(data, new Eventos(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Eventos> agendaEmOrdemCrescente = new TreeMap<>(eventosMap);
        if (!eventosMap.isEmpty()){
            System.out.println(agendaEmOrdemCrescente);
        } else {
            System.out.println("A lista de eventos está vazia.");
        }
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Eventos proximoEvento = null;

        Map<LocalDate, Eventos> agendaEmOrdemCrescente = new TreeMap<>(eventosMap);

        if (!eventosMap.isEmpty()){
            for (Map.Entry<LocalDate, Eventos> entry : eventosMap.entrySet()){
                LocalDate dataEvento = entry.getKey();
                if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)){
                    proximaData = entry.getKey();
                    proximoEvento = entry.getValue();
                    System.out.println("O proximo evento : " + proximoEvento + "\n Será na data : " + proximaData);
                    break;
                }
            }
        }
        else {
            System.out.println("A lista de eventos está vazia.");
        }
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.exibirAgenda();

        System.out.println("Eventos adicionados : ");

        agenda.adicionarEvento(LocalDate.of(2025, Month.FEBRUARY, 26), "Festa", "Aniversário Gabriel"  );
        agenda.adicionarEvento(LocalDate.of(2024, 5, 26), "Festa", "Aniversário Evelin"  );
        agenda.adicionarEvento(LocalDate.of(2023, Month.APRIL, 24), "Casamento", "Aniversário Casamento Gabriel & Evelin"  );
        agenda.adicionarEvento(LocalDate.of(2026, 8, 25), "Festa", "Aniversário Asaph"  );

        agenda.exibirAgenda();

        System.out.println("Método próximo evento: ");
        agenda.obterProximoEvento();
    }
}
