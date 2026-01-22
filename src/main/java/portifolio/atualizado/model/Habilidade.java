package portifolio.atualizado.model;

import java.util.List;

public class Habilidade {
    private int id;
    private String grupo;
    private List<String> itens; 

    public Habilidade (int id, String grupo, List<String> itens) {
        this.id = id;
        this.grupo = grupo;
        this.itens = itens;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    // 

    public String getGrupo(){
        return grupo;
    }

    public void setGrupo(String grupo){
        this.grupo = grupo;
    }

    // 

    public List<String> getItens(){
        return itens;
    }

    public void setItens(List<String> itens){
        this.itens = itens;
    }
}
