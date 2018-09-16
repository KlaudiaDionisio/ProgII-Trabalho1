/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadores;

/**
 *
 * @author klaud
 */
public interface IGerenciador<T> {
    
    public void cadastrar(T o) throws Exception;
    
    public String imprimirElementos() throws Exception;
}
