/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaodm2021n.controles;

import java.sql.SQLException;
import java.util.List;
import revisaodm2021n.dados.Departamento;
import revisaodm2021n.dados.Pessoa;
import revisaodm2021n.dados.PessoaDepartamento;
import revisaodm2021n.modelos.DaoPessoaDepartamento;

/**
 *
 * @author User
 */
public class ControlePessoaDepartamento {
    
    /*
    DaoPessoaDepartamento daoPd = new DaoPessoaDepartamento();
    ControleDepartamento contDep = new ControleDepartamento();
    ControlePessoa contPes = new ControlePessoa();

    public List<PessoaDepartamento> listar (PessoaDepartamento pd) throws SQLException {
        List<PessoaDepartamento> pdList =  daoPd.listar(pd);
        Departamento d = new Departamento(pdList.get(0).getId());
        Pessoa p = new Pessoa(pdList.get(0).getIdP());
        pdList.get(0).setDep(contDep.buscar(d));
        pdList.get(0).setPes(contPes.buscar(p));
        return pdList;
    }
    */
    
}
