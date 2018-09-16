/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadores;

import java.util.ArrayList;
import pessoa.Aluno;

/**
 *
 * @author klaud
 */
public class GerenciadorAluno  implements IGerenciador<Aluno>{
    private ArrayList<Aluno> alunos;
    
    @Override
    public void cadastrar(Aluno a) throws Exception{
        if(alunos == null){
            alunos = new ArrayList();
        }
        if(!alunos.add(a)){
            throw new Exception("Erro ao cadastrar aluno!");
        }
    }
    
    @Override 
    public String imprimirElementos() throws Exception{
        if(alunos == null){
            throw new Exception("Lista vazia!");
        }
        int i = 0;
        String msg = "Alunos cadastrados:\n\n";
        for(Aluno a : alunos) {
            msg += i++ + " - Nome: " + a.getNome()+ " | Nível: " + a.getNivel()+" | Idade: "+ a.getIdade() + "\n";
        }
        return msg;
    }
    
    public ArrayList getList(){
        return this.alunos;
    }
    
    

}
