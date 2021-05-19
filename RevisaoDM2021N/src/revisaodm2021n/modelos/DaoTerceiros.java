package revisaodm2021n.modelos;

import java.util.List;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import revisaodm2021n.dados.Terceiros;
import revisaodm2021n.util.ConexaoDb;

public class DaoTerceiros {
   
    // variavel que armazena a conexão
    private final Connection conexao;
   
    // construtor da classe DaoUsuario
    public DaoTerceiros() throws SQLException, ClassNotFoundException{
        this.conexao = new ConexaoDb().getConnection();
    }
   

    public Terceiros buscar (Terceiros terceiros) throws SQLException {
        String sql = "select * from ter_terceiros WHERE ter_id = ?";
        Terceiros retorno;
        // seta os valores
        try (PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,terceiros.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {
                // criando o objeto Usuario
                retorno = new Terceiros(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10));
                // adiciona o usu à lista de pessoa
            }
        }
        conexao.close();
        return retorno;
    }

    public Terceiros inserir (Terceiros terceiros) throws SQLException {
        String sql = "insert into ter_terceiros" + " (ter_nome,ter_dataNascimento,ter_cpf,ter_genero,ter_endereco,ter_telefone,ter_email,ter_empresa,ter_tipo)" + " values (?,?,?,?,?,?,?,?,?)";
   
        // seta os valores
        try ( // prepared statement para inserção
            PreparedStatement stmt = conexao.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
            // seta os valores
            stmt.setString(1,terceiros.getNome());
            stmt.setString(2,terceiros.getDataNascimento());
            stmt.setString(3,terceiros.getCpf());
            stmt.setString(4,terceiros.getGenero());
            stmt.setString(5,terceiros.getEndereco());
            stmt.setString(6,terceiros.getTelefone());
            stmt.setString(7,terceiros.getEmail());
            stmt.setString(8,terceiros.getEmpresa());
            stmt.setString(9,terceiros.getTipo());
            // executa
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                terceiros.setId(id);
            }
        }
        conexao.close();
        return terceiros;
    }

    public Terceiros alterar (Terceiros terceiros) throws SQLException {
        String sql = "UPDATE ter_terceiros SET ter_nome = ?, ter_dataNascimento = ?, ter_cpf = ?, ter_genero = ?, ter_endereco = ?, ter_telefone = ?, ter_email = ?, ter_empresa = ?, ter_tipo = ? WHERE ter_id = ?";
        // seta os valores
        // prepared statement para inserção
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,terceiros.getNome());
            stmt.setString(2,terceiros.getDataNascimento());
            stmt.setString(3,terceiros.getCpf());
            stmt.setString(4,terceiros.getGenero());
            stmt.setString(5,terceiros.getEndereco());
            stmt.setString(6,terceiros.getTelefone());
            stmt.setString(7,terceiros.getEmail());
            stmt.setString(8,terceiros.getEmpresa());
            stmt.setString(9,terceiros.getTipo());
            stmt.setInt(10,terceiros.getId());
            
            // executa
            stmt.execute();
        }
        return terceiros;

    }

    public Terceiros excluir (Terceiros terceiros) throws SQLException {
         String sql = "delete from ter_terceiros WHERE ter_id = ?";
        // seta os valores
        // prepared statement para inserção
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,terceiros.getId());
            // executa
            stmt.execute();
        }
        conexao.close();
        return terceiros;
    }

    public List<Terceiros> listar (Terceiros terceiros) throws SQLException {
         // usus: array armazena a lista de registros
        List<Terceiros> listaTerceiros = new ArrayList<>();
       
        String sql = "select * from ter_terceiros where ter_nome like ?";
        // seta os valores
        try (PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,"%" + terceiros.getNome()+ "%");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                // criando o objeto Usuario
                Terceiros terceirosSaida = new Terceiros(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10));
                // adiciona o usu à lista de usus
                listaTerceiros.add(terceirosSaida);
            }
            
            rs.close();
        }
        return listaTerceiros;
    }
}