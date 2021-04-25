package revisaodm2021n.dados;

public class Terceiros {
    
    //atributos
    int id;
    String nome;
    String dataNascimento;
    String cpf;
    String genero;
    String endereco;
    String telefone;
    String email;
    String empresa;
    String tipo;

    //Construtores
    public Terceiros(int id) {
        this.id = id;
    }

    public Terceiros(String nome, String dataNascimento, String cpf, String genero, String endereco, String telefone, String email, String empresa, String tipo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.genero = genero;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.empresa = empresa;
        this.tipo = tipo;
    }

    public Terceiros(String nome) {
        this.nome = nome;
    }

    public Terceiros(int id, String nome, String dataNascimento, String cpf, String genero, String endereco, String telefone, String email, String empresa, String tipo) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.genero = genero;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.empresa = empresa;
        this.tipo = tipo;
    }    

    //Getter and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //toString
    @Override
    public String toString() {
        return "Terceiros{" + "id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", cpf=" + cpf + ", genero=" + genero + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + ", empresa=" + empresa + ", tipo=" + tipo + '}';
    }
    
}
