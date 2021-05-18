package revisaodm2021n.controles;

import java.sql.SQLException;
import java.util.List;
import revisaodm2021n.dados.Empresa;
import revisaodm2021n.modelos.DaoEmpresa;

public class ControleEmpresa {
   

    static DaoEmpresa daoEmpresa;
    
    public ControleEmpresa() throws SQLException, ClassNotFoundException {
        daoEmpresa = new DaoEmpresa();
    }

    public Empresa inserir(Empresa empresaEntrada) throws SQLException {
        return daoEmpresa.inserir(empresaEntrada);
    }

    public List<Empresa> listar(Empresa empresaEntrada) throws SQLException {
        return daoEmpresa.listar(empresaEntrada);
    }

    public Empresa alterar(Empresa empresaEntrada) throws SQLException {
        return daoEmpresa.alterar(empresaEntrada);
    }

    public Empresa buscar(Empresa empresaEntrada) throws SQLException {
        return daoEmpresa.buscar(empresaEntrada);
    }

    public Empresa excluir(Empresa empresaEntrada) throws SQLException {
        return daoEmpresa.excluir(empresaEntrada);
    }    
}
