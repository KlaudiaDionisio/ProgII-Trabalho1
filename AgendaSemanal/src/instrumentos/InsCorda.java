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
public class InsCorda extends Instrumento{
    private int qtdeCordas;
    private boolean palheta;

    public InsCorda() {
        super();
        this.qtdeCordas = 0; 
        this.palheta = false;
    }

    public InsCorda(String nome, int idadeMin, boolean eletrico, int qtdeCordas, boolean palheta) {
        super(nome, idadeMin, eletrico);
        this.qtdeCordas = qtdeCordas;
        this.palheta = palheta;
    }

    public int getQtdeCordas() {
        return qtdeCordas;
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
                && this.getQtdeCordas() == other.getQtdeCordas() 
                && this.isEletrico() == other.isEletrico()
                && this.getPalheta() == other.getPalheta()) {
            return true;
        }
        return false;
    }

    public void setQtdeCordas(int qtdeCordas) {
        this.qtdeCordas = qtdeCordas;
    }

    public boolean getPalheta() {
        return palheta;
    }

    public void setPalheta(boolean palheta) {
        this.palheta = palheta;
    }
    
    
    
    
    
}
