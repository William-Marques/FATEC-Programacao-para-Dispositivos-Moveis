package revisaodm2021n.controles;

import java.sql.SQLException;
import java.util.List;
import revisaodm2021n.dados.Alocacao;
import revisaodm2021n.modelos.DaoAlocacao;

public class ControleAlocacao {
    



    static DaoAlocacao daoAlocacao;
    
    public ControleAlocacao() throws SQLException, ClassNotFoundException {
        daoAlocacao = new DaoAlocacao();
    }

    public Alocacao inserir(Alocacao alocacaoEntrada) throws SQLException {
        return daoAlocacao.inserir(alocacaoEntrada);
    }

    public List<Alocacao> listar(Alocacao alocacaoEntrada) throws SQLException {
        return daoAlocacao.listar(alocacaoEntrada);
    }

    public Alocacao alterar(Alocacao alocacaoEntrada) throws SQLException {
        return daoAlocacao.alterar(alocacaoEntrada);
    }

    public Alocacao buscar(Alocacao alocacaoEntrada) throws SQLException {
        return daoAlocacao.buscar(alocacaoEntrada);
    }

    public Alocacao excluir(Alocacao alocacaoEntrada) throws SQLException {
        return daoAlocacao.excluir(alocacaoEntrada);
    }    
}
