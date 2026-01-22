package portifolio.atualizado.model;

import java.util.List;

public class Perfil {
    private String nome;
    private String descricao;
    private List<Contato> contatos;
    private List<Sites> sites;
    private List<Experiencia> experienciasSaude;
    private List<Experiencia> experienciasTecnologia;
    private List<Formacao> formacoesSaude;
    private List<Formacao> formacoesTecnologia;
    private List<Habilidade> habilidadesTecnicas;
    private List<String> jogos;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    // 

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    // 

    public List<Contato> getContatos() {
        return contatos;
    }
    public void setContatos(List<Contato> contatos){
        this.contatos = contatos;
    }

    // 

    public List<Sites> getSites() {
        return sites;
    }
    public void setSites(List<Sites> sites){
        this.sites = sites;
    }

    // 

    public List<Experiencia> getExperienciasSaude() {
        return experienciasSaude;
    }
    public void setExperienciasSaude(List<Experiencia> experienciasSaude){
        this.experienciasSaude = experienciasSaude;
    }

    // 

    public List<Experiencia> getExperienciasTecnologia() {
        return experienciasTecnologia;
    }
    public void setExperienciasTecnologia(List<Experiencia> experienciasTecnologia){
        this.experienciasTecnologia = experienciasTecnologia;
    }

    // 

    public List<Formacao> getFormacoesSaude() {
        return formacoesSaude;
    }
    public void setFormacoesSaude(List<Formacao> formacoesSaude){
        this.formacoesSaude = formacoesSaude;
    }

    // 

    public List<Formacao> getFormacoesTecnologia() {
        return formacoesTecnologia;
    }
    public void setFormacoesTecnologia(List<Formacao> formacoesTecnologia){
        this.formacoesTecnologia = formacoesTecnologia;
    }

    // 

    public List<Habilidade> getHabilidadesTecnicas() {
        return habilidadesTecnicas;
    }
    public void setHabilidadesTecnicas(List<Habilidade> habilidadesTecnicas){
        this.habilidadesTecnicas = habilidadesTecnicas;
    }

    // 

    public List<String> getJogos() {
        return jogos;
    }
    public void setJogos(List<String> jogos){
        this.jogos = jogos;
    }
}
