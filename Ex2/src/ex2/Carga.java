/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex2;

/**
 *
 * @author Gustavo
 */
public class Carga {
    double valor;
    double peso;
    
    public Carga(double valor, double peso) {
        this.valor = valor;
        this.peso = peso;
    }
    
    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
}
