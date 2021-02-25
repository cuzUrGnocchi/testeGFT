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
public class Vagao extends Transporte{
    public Vagao(Carga carga) {
        super(carga);
    }
    
    public double calculaFrete(int distancia) {
        double valorAdicional = 0;
        if(carga.peso < 15000)
            valorAdicional = 5000;
        return 0.07 * carga.peso + 0.01 * carga.valor + distancia * 0.5 + valorAdicional;
    }
}
