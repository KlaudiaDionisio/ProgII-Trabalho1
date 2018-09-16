/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentos;

/**
 *
 * @author klaud
 */
public class InsTecla extends Instrumento{
    
    public InsTecla(){
        super();
    }
    public InsTecla(String nome, int idadeMin, boolean eletrico){
        super(nome, idadeMin, eletrico);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InsCorda other = (InsCorda) obj;
        if (this.getNome().equals(other.getNome()) && this.getIdadeMin() == other.getIdadeMin()
                && this.isEletrico() == other.isEletrico()){
            return true;
        }
        return false;
    }
    
}
