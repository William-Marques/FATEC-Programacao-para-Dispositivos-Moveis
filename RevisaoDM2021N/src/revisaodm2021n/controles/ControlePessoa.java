/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaodm2021n.controles;

import java.util.List;
import revisaodm2021n.dados.Pessoa;
import revisaodm2021n.modelos.DaoPessoa;

/**
 *
 * @author User
 */
public class ControlePessoa {
    
    static DaoPessoa daoPes = new DaoPessoa();
   
    public Pessoa inserir (Pessoa p) {
        return daoPes.inserir(p);
    }
  
    public Pessoa alterar (Pessoa p) {
        return daoPes.alterar(p);
    }
 
    public Pessoa excluir (Pessoa p) {
        return daoPes.excluir(p);
    }
 
    public Pessoa buscar (Pessoa p) {
        return daoPes.buscar(p);
    }
    
    public List<Pessoa> listar (Pessoa p) {
        return daoPes.listar(p);
    }
    
}
