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
public class GerenciadorProfessor implements IGerenciador{
    
    ArrayList<Professor> professores;
    
    @Override
    public void cadastrar(Object p){
        if(professores == null){
            professores = new ArrayList();
        }
        professores.add((Professor)p);
    }
}
