/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Carga> cargas = new ArrayList<Carga>();
        List<Integer> distancias = new ArrayList<Integer>();
        
        cargas.add(new Carga(18550, 27500));    distancias.add(200);
        cargas.add(new Carga(8100, 35410));     distancias.add(554);
        cargas.add(new Carga(25700, 3650));     distancias.add(112);
        cargas.add(new Carga(9541, 5799));      distancias.add(1580);
        cargas.add(new Carga(25740, 45000));    distancias.add(321);
        cargas.add(new Carga(5000, 90570));     distancias.add(627);
        cargas.add(new Carga(8900, 41000));     distancias.add(876);
        
        SimulacaoCustoFrete simulacaoCustoFrete = new SimulacaoCustoFrete(cargas, distancias);
        simulacaoCustoFrete.calculaFrete();
    } 
}
