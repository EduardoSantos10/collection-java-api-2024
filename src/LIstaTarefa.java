import java.util.ArrayList;
import java.util.List;

public class LIstaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    // método construtor
    public LIstaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao)); //adicionar uma tarefa
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        LIstaTarefa lIstaTarefa = new LIstaTarefa();
        System.out.println("O numero total de elementos na lista é: " + lIstaTarefa.obterNumeroTotalTarefas());

        lIstaTarefa.adicionarTarefa("Tarefa 1");
        lIstaTarefa.adicionarTarefa("Tarefa 1");
        lIstaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O numero total de elementos na lista é: " + lIstaTarefa.obterNumeroTotalTarefas());

        lIstaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total de elementos na lista é: " + lIstaTarefa.obterNumeroTotalTarefas());

        lIstaTarefa.obterDescricoesTarefas();

    }


}
