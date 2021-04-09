/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaodm2021n.modelos;

import java.util.List;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import revisaodm2021n.dados.Pessoa;
import revisaodm2021n.util.ConexaoDb;

/**
 *
 * @author ProfAlexandre
 */
public class DaoPessoa {
   
    // variavel que armazena a conexão
    private final Connection c;
   
    // construtor da classe DaoUsuario
    public DaoPessoa() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDb().getConnection();
    }
   
    public Pessoa buscar (Pessoa p) throws SQLException {
        String sql = "select * from pes_pessoa WHERE pes_id = ?";
        Pessoa retorno;
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,p.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {
                // criando o objeto Usuario
                retorno = new Pessoa(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6));
                // adiciona o usu à lista de pessoa
            }
        }
        c.close();
        return retorno;
    }

    public Pessoa inserir (Pessoa p) throws SQLException {
        String sql = "insert into pes_pessoa" + " (pes_nome,pes_idade,pes_genero,pes_peso,pes_altura)" + " values (?,?,?,?,?)";
   
        // seta os valores
        try ( // prepared statement para inserção
            PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
            // seta os valores
            stmt.setString(1,p.getNome());
            stmt.setString(2,p.getIdade());
            stmt.setString(3,p.getGenero());
            stmt.setString(4,p.getPeso());
            stmt.setString(5,p.getAltura());
            // executa
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                p.setId(id);
            }
        }
        c.close();
        return p;
    }

    public Pessoa alterar (Pessoa p) throws SQLException {
        String sql = "UPDATE pes_pessoa SET pes_nome = ?, pes_idade = ?, pes_genero = ?, pes_peso = ?, pes_altura = ? WHERE pes_id = ?";
        // seta os valores
        // prepared statement para inserção
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,p.getNome());
            stmt.setString(2,p.getIdade());
            stmt.setString(3,p.getGenero());
            stmt.setString(4,p.getPeso());
            stmt.setString(5,p.getAltura());
            stmt.setInt(6,p.getId());
            // executa
            stmt.execute();
        }
        return p;

    }

    public Pessoa excluir (Pessoa p) throws SQLException {
         String sql = "delete from pes_pessoa WHERE pes_id = ?";
        // seta os valores
        // prepared statement para inserção
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,p.getId());
            // executa
            stmt.execute();
        }
        c.close();
        return p;
    }

    public List<Pessoa> listar (Pessoa p) throws SQLException {
         // usus: array armazena a lista de registros
        List<Pessoa> pess = new ArrayList<>();
       
        String sql = "select * from pes_pessoa where pes_nome like ?";
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,"%" + p.getNome()+ "%");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                // criando o objeto Usuario
                Pessoa pSaida = new Pessoa(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6));
                // adiciona o usu à lista de usus
                pess.add(pSaida);
            }
            
            rs.close();
        }
        return pess;
    }
}