package revisaodm2021n.modelos;

import java.util.List;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import revisaodm2021n.dados.Alocacao;
import revisaodm2021n.util.ConexaoDb;

public class DaoAlocacao {

    // variavel que armazena a conexão
    private final Connection conexao;

    // construtor da classe DaoUsuario
    public DaoAlocacao() throws SQLException, ClassNotFoundException {
        this.conexao = new ConexaoDb().getConnection();
    }

    public Alocacao buscar(Alocacao alocacao) throws SQLException {
        String sql = "select alo_alocacao.alo_id, ter_terceiros.ter_nome, emp_empresa.emp_nome,alo_alocacao.alo_dataentrada, alo_alocacao.alo_datasaida from alo_alocacao INNER JOIN ter_terceiros ON alo_alocacao.alo_terceiros_id = ter_terceiros.ter_id INNER JOIN emp_empresa ON alo_alocacao.alo_empresa_id = emp_empresa.emp_id WHERE alo_id = ?";
        Alocacao retorno;
        // seta os valores
        try (PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1, alocacao.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {
                // criando o objeto Usuario
                retorno = new Alocacao(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));
                // adiciona o usu à lista de pessoa
            }
        }
        conexao.close();
        return retorno;
    }

    public Alocacao inserir(Alocacao alocacao) throws SQLException {
        String sql = "insert into alo_alocacao" + " (alo_terceiros_id,alo_empresa_id,alo_dataentrada,alo_datasaida)" + " values (?,?,?,?)";

        // seta os valores
        try ( // prepared statement para inserção
                PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            // seta os valores
            stmt.setString(1, alocacao.getTerceiros_id());
            stmt.setString(2, alocacao.getEmpresa_id());
            stmt.setString(3, alocacao.getDataentrada());
            stmt.setString(4, alocacao.getDatasaida());
            // executa
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                alocacao.setId(id);
            }
        }
        conexao.close();
        return alocacao;
    }

    public Alocacao alterar(Alocacao alocacao) throws SQLException {
        String sql = "UPDATE alo_alocacao SET alo_terceiros_id = ?, alo_empresa_id = ?, alo_dataentrada = ?, alo_datasaida = ? WHERE alo_id = ?";
        // seta os valores
        // prepared statement para inserção
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1, alocacao.getTerceiros_id());
            stmt.setString(2, alocacao.getEmpresa_id());
            stmt.setString(3, alocacao.getDataentrada());
            stmt.setString(4, alocacao.getDatasaida());
            stmt.setInt(5, alocacao.getId());
            // executa
            stmt.execute();
        }
        return alocacao;

    }

    public Alocacao excluir(Alocacao alocacao) throws SQLException {
        String sql = "delete from alo_alocacao WHERE alo_id = ?";
        // seta os valores
        // prepared statement para inserção
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1, alocacao.getId());
            // executa
            stmt.execute();
        }
        conexao.close();
        return alocacao;
    }

    public List<Alocacao> listar(Alocacao alocacao) throws SQLException {
        // usus: array armazena a lista de registros
        List<Alocacao> listaAlocacao = new ArrayList<>();

        String sql = "select alo_alocacao.alo_id, ter_terceiros.ter_nome, emp_empresa.emp_nome, alo_alocacao.alo_dataentrada, alo_alocacao.alo_datasaida from ter_terceiros INNER JOIN alo_alocacao ON ter_terceiros.ter_id = alo_alocacao.alo_terceiros_id INNER JOIN emp_empresa ON alo_alocacao.alo_empresa_id = emp_empresa.emp_id WHERE ter_nome like ?";
        // seta os valores
        try (PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1, "%" + alocacao.getTerceiros_id() + "%");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // criando o objeto Usuario
                Alocacao alocacaoSaida = new Alocacao(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));
                // adiciona o usu à lista de usus
                listaAlocacao.add(alocacaoSaida);
            }

            rs.close();
        }
        return listaAlocacao;
    }
}
