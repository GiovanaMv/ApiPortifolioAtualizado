package portifolio.atualizado.model;

import java.util.List;

public class Formacao {
    private int id;
    private String instituicao;
    private List<String> cursos;
    private String ano;

    public Formacao (int id, String instituicao, List<String> cursos, String ano){
        this.id = id;
        this.instituicao = instituicao;
        this.cursos = cursos;
        this.ano = ano;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    // 
    
    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao){
        this.instituicao = instituicao;
    }

    // 

    public List<String> getCursos() {
        return cursos;
    }

    public void setCursos(List<String> cursos){
        this.cursos = cursos;
    }

    // 

    public String getAno() {
        return ano;
    }

    public void setAno(String ano){
        this.ano = ano;
    }
}
