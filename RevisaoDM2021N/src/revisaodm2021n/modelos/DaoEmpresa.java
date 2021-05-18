package revisaodm2021n.modelos;

import java.util.List;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import revisaodm2021n.dados.Empresa;
import revisaodm2021n.util.ConexaoDb;

public class DaoEmpresa {

    // variavel que armazena a conexão
    private final Connection conexao;

    // construtor da classe DaoUsuario
    public DaoEmpresa() throws SQLException, ClassNotFoundException {
        this.conexao = new ConexaoDb().getConnection();
    }

    public Empresa buscar(Empresa empresa) throws SQLException {
        String sql = "select * from emp_empresa WHERE emp_id = ?";
        Empresa retorno;
        // seta os valores
        try (PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1, empresa.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {
                // criando o objeto Usuario
                retorno = new Empresa(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6));
                // adiciona o usu à lista de pessoa
            }
        }
        conexao.close();
        return retorno;
    }

    public Empresa inserir(Empresa empresa) throws SQLException {
        String sql = "insert into emp_empresa" + " (emp_nome,emp_cnpj,emp_endereco,emp_telefone,emp_email)" + " values (?,?,?,?,?)";

        // seta os valores
        try ( // prepared statement para inserção
                PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            // seta os valores
            stmt.setString(1, empresa.getNome());
            stmt.setString(2, empresa.getCnpj());
            stmt.setString(3, empresa.getEndereco());
            stmt.setString(4, empresa.getTelefone());
            stmt.setString(5, empresa.getEmail());
            // executa
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                empresa.setId(id);
            }
        }
        conexao.close();
        return empresa;
    }

    public Empresa alterar(Empresa empresa) throws SQLException {
        String sql = "UPDATE emp_empresa SET emp_nome = ?, emp_cnpj = ?, emp_endereco = ?, emp_telefone = ?, emp_email = ? WHERE emp_id = ?";
        // seta os valores
        // prepared statement para inserção
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1, empresa.getNome());
            stmt.setString(2, empresa.getCnpj());
            stmt.setString(3, empresa.getEndereco());
            stmt.setString(4, empresa.getTelefone());
            stmt.setString(5, empresa.getEmail());
            stmt.setInt(6, empresa.getId());

            // executa
            stmt.execute();
        }
        return empresa;

    }

    public Empresa excluir(Empresa empresa) throws SQLException {
        String sql = "delete from emp_empresa WHERE emp_id = ?";
        // seta os valores
        // prepared statement para inserção
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1, empresa.getId());
            // executa
            stmt.execute();
        }
        conexao.close();
        return empresa;
    }

    public List<Empresa> listar(Empresa empresa) throws SQLException {
        // usus: array armazena a lista de registros
        List<Empresa> listaEmpresa = new ArrayList<>();

        String sql = "select * from emp_empresa where emp_nome like ?";
        // seta os valores
        try (PreparedStatement stmt = this.conexao.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1, "%" + empresa.getNome() + "%");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // criando o objeto Usuario
                Empresa empresaSaida = new Empresa(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6));
                // adiciona o usu à lista de usus
                listaEmpresa.add(empresaSaida);
            }

            rs.close();
        }
        return listaEmpresa;
    }
}
