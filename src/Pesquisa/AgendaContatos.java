package Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    // atributos
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero((novoNumero));
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
    public static void main(String[] args){
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Eduardo", 123456);
        agendaContatos.adicionarContato("Eduardo S", 1236);
        agendaContatos.adicionarContato("Eduardo Silva", 456);
        agendaContatos.adicionarContato("Eduardo Scott", 1234);
        agendaContatos.adicionarContato("Eduardo Santos", 235);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Eduardo Silva"));

        //System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Eduardo", 845795215));
    }

}
