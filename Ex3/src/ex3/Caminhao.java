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
public class Caminhao extends Transporte {
    public Caminhao(Carga carga) {
        super(carga);
    }
    
    public double calculaFrete(int distancia) {
        double desconto = 1;
        if(carga.valor > 40000)
            desconto = 0.75;
        return (0.02 * carga.peso + 0.03 * carga.valor + distancia * 2) * desconto;
    }
}
