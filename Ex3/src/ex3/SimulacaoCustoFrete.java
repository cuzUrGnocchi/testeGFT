/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class SimulacaoCustoFrete {
    List cargas = new ArrayList<Carga>();
    List distancias;
    
    public SimulacaoCustoFrete(List cargas, List distancias) {
        this.cargas = cargas;
        this.distancias = distancias;
    }
    
    public void calculaFrete() {
        int i = 0;
        Iterator iterator = cargas.iterator();
        int numVagoes = 0;
        int numCaminhoes = 0;
        double custoTotal = 0;
        
        
        while(iterator.hasNext()) {
            Carga carga = (Carga) iterator.next();
            double freteVagao = new Vagao(carga).calculaFrete((Integer) distancias.get(i));
            double freteCaminhao = new Caminhao(carga).calculaFrete((Integer) distancias.get(i));
            
            System.out.println(freteVagao + " - " + freteCaminhao);
            
            if(freteVagao < freteCaminhao) {
                custoTotal += freteVagao;
                numVagoes++;
            } else {
                custoTotal += freteCaminhao;
                numCaminhoes++;
            }
        }
        
        System.out.println("Caminhões: " + numCaminhoes);
        System.out.println("Vagões: " + numVagoes);
        System.out.println("Custo total: " + custoTotal);
    } 
}
