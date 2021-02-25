/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Gustavo
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("Peso:");
            double peso = Double.parseDouble(reader.readLine());
            System.out.print("Valor:");
            double valor = Double.parseDouble(reader.readLine());
            System.out.print("Distância:");
            int distancia = Integer.parseInt(reader.readLine());
            
            Carga carga = new Carga(valor, peso);
            System.out.print("\n");
            System.out.println("Vagão: " + new Vagao(carga).calculaFrete(distancia));
            System.out.println("Caminhão: " + new Caminhao(carga).calculaFrete(distancia));
        } catch(Exception e) {
            System.out.print(e);
        }
    } 
}
