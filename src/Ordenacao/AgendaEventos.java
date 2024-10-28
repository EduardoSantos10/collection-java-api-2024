package Ordenacao;

import java.time.LocalDate; // para trabalhar com "data" é o -> LocalData <-
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    // atributos
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos(){
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);

    }

    public void obterProximoEvento(){
        /*Set<LocalDate> dataSet = eventosMap.keySet();
        Collection<Evento> values = eventosMap.values();*/

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " +  proximoEvento + "acontecera na data" + proximaData);
            }
        }
    }

    public static void main(String[] args){
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.AUGUST, 25), "Melhor dia do Ano", "Meu anoversário");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 31), "Melhor dia do Ano", "Meu anoversário");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.JULY, 10), "Melhor dia do Ano", "Meu anoversário");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
