package portifolio.atualizado.model;

public class Experiencia {
    private Long id;
    private String empresa;
    private String funcao;
    private String ano;

    public Experiencia (Long id, String empresa, String funcao, String ano){
        this.id = id;
        this.empresa = empresa;
        this.funcao = funcao;
        this.ano = ano;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    // 

    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    // 

    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
}
