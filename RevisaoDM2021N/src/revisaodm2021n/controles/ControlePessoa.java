/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaodm2021n.controles;

import java.sql.SQLException;
import java.util.List;
import revisaodm2021n.dados.Pessoa;
import revisaodm2021n.modelos.DaoPessoa;

/**
 *
 * @author User
 */
public class ControlePessoa {

    static DaoPessoa daoP;
    
    public ControlePessoa() throws SQLException, ClassNotFoundException {
        daoP = new DaoPessoa();
    }

    public Pessoa inserir(Pessoa pEntrada) throws SQLException {
        return daoP.inserir(pEntrada);
    }

    public List<Pessoa> listar(Pessoa pEntrada) throws SQLException {
        return daoP.listar(pEntrada);
    }

    public Pessoa alterar(Pessoa pEntrada) throws SQLException {
        return daoP.alterar(pEntrada);
    }

    public Pessoa buscar(Pessoa pEntrada) throws SQLException {
        return daoP.buscar(pEntrada);
    }

    public Pessoa excluir(Pessoa pEntrada) throws SQLException {
        return daoP.excluir(pEntrada);
    }
    
}