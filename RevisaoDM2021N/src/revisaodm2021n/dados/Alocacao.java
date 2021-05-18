package revisaodm2021n.dados;


public class Alocacao {
    
    //atributos
    int id;
    String terceiros_id;
    String empresa_id;
    String dataentrada;
    String datasaida;
    
    //Contrutores
    public Alocacao(int id) {
        this.id = id;
    }

    public Alocacao(String terceiros_id) {
        this.terceiros_id = terceiros_id;
    } 
    
    public Alocacao(String terceiros_id, String empresa_id, String dataentrada, String datasaida) {
        this.terceiros_id = terceiros_id;
        this.empresa_id = empresa_id;
        this.dataentrada = dataentrada;
        this.datasaida = datasaida;
    }

    public Alocacao(int id, String terceiros_id, String empresa_id, String dataentrada, String datasaida) {
        this.id = id;
        this.terceiros_id = terceiros_id;
        this.empresa_id = empresa_id;
        this.dataentrada = dataentrada;
        this.datasaida = datasaida;
    }
    
    //Métodos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTerceiros_id() {
        return terceiros_id;
    }

    public void setTerceiros_id(String terceiros_id) {
        this.terceiros_id = terceiros_id;
    }

    public String getEmpresa_id() {
        return empresa_id;
    }

    public void setEmpresa_id(String empresa_id) {
        this.empresa_id = empresa_id;
    }

    public String getDataentrada() {
        return dataentrada;
    }

    public void setDataentrada(String dataentrada) {
        this.dataentrada = dataentrada;
    }

    public String getDatasaida() {
        return datasaida;
    }

    public void setDatasaida(String datasaida) {
        this.datasaida = datasaida;
    }
    
    //toString

    @Override
    public String toString() {
        return "Alocacao{" + "id=" + id + ", terceiros_id=" + terceiros_id + ", empresa_id=" + empresa_id + ", dataentrada=" + dataentrada + ", datasaida=" + datasaida + '}';
    }
    
   
    
}
