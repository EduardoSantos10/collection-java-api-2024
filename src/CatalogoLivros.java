import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    //atributo

    private List<Livro> livroList;

    // Construtor
    public CatalogoLivros(){
        this.livroList = new ArrayList<>(); // instanciei um objeto novo
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

   public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){ // Se a lista de livros estiver vazia, ele retorna um boolean
            for(Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
   }


        public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
            List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
            if(!livroList.isEmpty()){
                for(Livro l : livroList){
                    if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                        livrosPorIntervaloAnos.add(l);
                    }
                }
            }
            return livrosPorIntervaloAnos;
        }

        public Livro pesquisarPorTitulo(String titulo){
            Livro livroPorTitulo = null;
            if(livroList.isEmpty()){
                for(Livro l : livroList){
                    if(l.getTitulo().equalsIgnoreCase(titulo)){
                        livroPorTitulo = l;
                        break;
                    }
                }

            }

            return livroPorTitulo;


        }

        public static void main(String[] args){
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2022);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2023);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 2002);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1")); // Dentro dos parenteses eu passo os parametros que eu quero pesquisar
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2021, 2002)); // junto do catalogoLivros, eu passo um tipo de tema que eu quero pesquisar
            System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 2"));
    }

}
