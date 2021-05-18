package revisaodm2021n.controles;

import java.sql.SQLException;
import java.util.List;
import revisaodm2021n.dados.Terceiros;
import revisaodm2021n.modelos.DaoTerceiros;

public class ControleTerceiros {

    static DaoTerceiros daoTerceiros;
    
    public ControleTerceiros() throws SQLException, ClassNotFoundException {
        daoTerceiros = new DaoTerceiros();
    }

    public Terceiros inserir(Terceiros terceirosEntrada) throws SQLException {
        return daoTerceiros.inserir(terceirosEntrada);
    }

    public List<Terceiros> listar(Terceiros terceirosEntrada) throws SQLException {
        return daoTerceiros.listar(terceirosEntrada);
    }
    
    public List<Terceiros> listarNome(Terceiros terceirosEntrada) throws SQLException {
        return daoTerceiros.listarNome(terceirosEntrada);
    }

    public Terceiros alterar(Terceiros terceirosEntrada) throws SQLException {
        return daoTerceiros.alterar(terceirosEntrada);
    }

    public Terceiros buscar(Terceiros terceirosEntrada) throws SQLException {
        return daoTerceiros.buscar(terceirosEntrada);
    }

    public Terceiros excluir(Terceiros terceirosEntrada) throws SQLException {
        return daoTerceiros.excluir(terceirosEntrada);
    }    
}