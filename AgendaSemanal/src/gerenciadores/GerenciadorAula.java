/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadores;

import aulas.Aula;
import instrumentos.InsCorda;
import instrumentos.InsTecla;
import instrumentos.Instrumento;
import java.util.ArrayList;
import java.util.Collections;
import pessoa.Aluno;
import pessoa.Professor;


public class GerenciadorAula implements IGerenciador<Aula>{
    private ArrayList<Aula> aulas;

    
    public GerenciadorAula(){
        aulas = new ArrayList();
    }

     @Override
    public void cadastrar(Aula o) throws Exception {
       if(!this.aulas.add(o)){
           throw new Exception("Erro ao cadastrar aula!");
       }
    }

    @Override
    public String imprimirElementos() throws Exception {
        if(this.aulas.isEmpty()){
            throw new Exception("Lista vazia!");
        }        
        
        Collections.sort(this.aulas);

        String msg = "";
        int i = 0;
        for(Aula a : this.aulas) {
            msg += i++ + " - " + a.getDiaAsString() + " - "+ a.getHorario() 
                    + "\n Professor: " + a.getProfessor().getNome() 
                    + " | Instrumento: " + a.getInstrumento().getNome()
                    + " | Aluno: " + a.getAluno().getNome() + "\n\n";
        }
        return msg;
    }
    
    public String getDias(){
        return "1 - Segunda\n"
                + "2 - Terça\n"
                + "3 - Quarta\n"
                + "4 - Quinta\n"
                + "5 - Sexta\n";
    }
    
    public ArrayList getList(){
        return this.aulas;
    }
    // overload 
    public boolean hasAula(Aluno a){
        for(Aula au : this.aulas){
            if(au.getAluno().equals(a)){
                return true;
            }
        }
        return false;
    }
    // overload 
    public boolean hasAula(Professor p){
        for(Aula au : this.aulas){
            if(au.getProfessor().equals(p)){
                return true;
            }
        }
        return false;
    }
    // overload 
    public boolean hasAula(InsCorda i){
        for(Aula au : this.aulas){
            if(i.equals(au.getInstrumento())){
                return true;
            }
        }
        return false;
    }
    
    // overload 
    public boolean hasAula(InsTecla i){
        for(Aula au : this.aulas){
            if(i.equals(au.getInstrumento())){
                return true;
            }
        }
        return false;
    }
    


   
}
