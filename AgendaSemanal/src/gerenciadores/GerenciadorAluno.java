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
public class GerenciadorAluno  implements IGerenciador{
    private ArrayList<Aluno> alunos;
    
    @Override
    public void cadastrar(Object a){
        if(alunos == null){
            alunos = new ArrayList();
        }
        alunos.add((Aluno)a);
    }

}
