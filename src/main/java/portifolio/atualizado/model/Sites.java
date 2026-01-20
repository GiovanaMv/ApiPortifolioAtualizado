package portifolio.atualizado.model;

public class Sites {
    private int id;
    private String tipo;
    private String valor;

    public Sites (int id, String tipo, String valor){
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getValor() { return valor; }
    public void setValor(String valor) { this.valor = valor; }
}
