/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex3;

/**
 *
 * @author Gustavo
 */
public abstract class Transporte {
    Carga carga;
    
    public Transporte(Carga carga) {
        this.carga = carga;
    }
    
    public abstract double calculaFrete(int distancia);
}
