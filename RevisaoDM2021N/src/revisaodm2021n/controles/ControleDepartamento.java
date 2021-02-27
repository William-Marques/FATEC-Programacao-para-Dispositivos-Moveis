/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaodm2021n.controles;

import java.util.List;
import revisaodm2021n.dados.Departamento;
import revisaodm2021n.modelos.DaoDepartamento;

/**
 *
 * @author User
 */
public class ControleDepartamento {
    
    static DaoDepartamento daoDep = new DaoDepartamento();
    
    public Departamento inserir (Departamento d) {
        return daoDep.inserir(d);
    }
    
    public Departamento alterar (Departamento d) {
        return daoDep.alterar(d);
    }

    public Departamento buscar (Departamento d) {
        return daoDep.buscar(d);
    }

    public Departamento excluir (Departamento d) {
        return daoDep.excluir(d);
    }

    public List<Departamento> listar (Departamento d) {
        return daoDep.listar(d);
    }

}
