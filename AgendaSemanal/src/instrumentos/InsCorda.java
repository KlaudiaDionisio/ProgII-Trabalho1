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

    public InsCorda(int qtdeCordas, boolean palheta, String nome, int idadeMin, boolean eletrico) {
        super(nome, idadeMin, eletrico);
        this.qtdeCordas = qtdeCordas;
        this.palheta = palheta;
    }

    public int getQtdeCordas() {
        return qtdeCordas;
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
