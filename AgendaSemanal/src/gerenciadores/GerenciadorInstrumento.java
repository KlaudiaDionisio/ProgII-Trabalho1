/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadores;

import instrumentos.Instrumento;
import java.util.ArrayList;

/**
 *
 * @author klaud
 */
public class GerenciadorInstrumento implements IGerenciador{
    
    ArrayList<Instrumento> instruments;
    
    @Override
    public void cadastrar(Object i){
        instruments.add((Instrumento)i);
    }
}
