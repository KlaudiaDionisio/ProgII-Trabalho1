/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadores;

import java.util.ArrayList;
import pessoa.Professor;

/**
 *
 * @author klaud
 */
public class GerenciadorProfessor implements IGerenciador<Professor>{
    
    ArrayList<Professor> professores;
    
    @Override
    public void cadastrar(Professor p) throws Exception{
        if(professores == null){
            professores = new ArrayList();
        }
        if(!professores.add(p)){
            throw new Exception("Erro ao cadastrar professor!");
        }
    }
    
    @Override 
    public String imprimirElementos() throws Exception{
        if(professores == null){
            throw new Exception("Lista vazia!");
        }
        int i = 0;
        String msg = "Professores cadastrados:\n\n";
        for(Professor p : professores) {
            msg += i++ + " - Nome: " + p.getNome()+ " | Instrumento indicado: " + p.getInstIndicado() + " | Idade: "+ p.getIdade() + "\n";
        }
        return msg;
    }
    
    public ArrayList getList(){
        return this.professores;
    }
}
