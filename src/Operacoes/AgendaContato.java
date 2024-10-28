package Operacoes;

import Pesquisa.AgendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    //atributos
    private Map<String, Integer> agendaContatoMap;

    public AgendaContato() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
    if(!agendaContatoMap.isEmpty()){
        numeroPorNome = agendaContatoMap.get(nome);
        }
    return numeroPorNome;
    }

    public static void main (String[] args){
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Eduardo", 123456);
        agendaContatos.adicionarContato("Eduardo Johnson", 1234);
        agendaContatos.adicionarContato("Eduardo da Silva", 1456);
        agendaContatos.adicionarContato("Eduardo S", 2345);
        agendaContatos.adicionarContato("Eduardo Silva", 12356);
        agendaContatos.adicionarContato("Eduardo Santos", 456);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Eduardo");
        agendaContatos.exibirContatos();

       // System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("Eduardo"));
    }
}
