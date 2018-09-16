/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadores;

import instrumentos.InsCorda;
import instrumentos.Instrumento;
import java.util.ArrayList;

/**
 *
 * @author klaud
 */
public class GerenciadorInstrumento implements IGerenciador<Instrumento>{
    
    ArrayList<Instrumento> instruments;
    
    @Override
    public void cadastrar(Instrumento i) throws Exception{
        if(instruments == null){
           instruments =  new ArrayList();
        }
        if(!instruments.add(i)){
            throw new Exception("Erro ao cadastrar instrumento!");
        }
        
    }
    
    @Override 
    public String imprimirElementos() throws Exception{
        if(instruments == null){
            throw new Exception("Lista vazia!");
        }
        int x = 0;
        String msg = "Instrumentos cadastrados:\n\n";
        for(Instrumento i : instruments) {
            msg += x++ + " - Nome: " + i.getNome()+ " | Idade mínima: "+ i.getIdadeMin() + 
                    " | Elétrico: " + (i.isEletrico()?"Sim":"Não") + 
                    (i instanceof InsCorda?(" | Cordas: " + ((InsCorda)i).getQtdeCordas() + 
                    " | Palheta:" + (((InsCorda)i).getPalheta()?"Sim":"Não")):"") + "\n"; // convert I to InsCorda 
        }
        return msg;
        
    }
    
    public ArrayList getList(){
        return this.instruments;
    }
}
