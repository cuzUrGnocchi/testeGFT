/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Gustavo
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        
            System.out.print("Multiplicando:");
            int multiplicando = Integer.parseInt(reader.readLine());
            System.out.print("Início do intervalo:");
            int inicio = Integer.parseInt(reader.readLine());
            System.out.print("Fim do intervalo:");
            int fim = Integer.parseInt(reader.readLine());
            

            boolean isNormalizado = true;
            if(multiplicando < 0) {
                System.out.println("Multiplicando não pode ser negativo");
                isNormalizado = false;
            }
            if(multiplicando > 3000) {
                System.out.println("Multiplicando não pode ser maior que 3000");
                isNormalizado = false;
            }
            if(inicio < 0) {
                System.out.println("Início não pode ser negativo");
                isNormalizado = false;
            }
            if(inicio > 3000) {
                System.out.println("Início não pode ser maior que 3000");
                isNormalizado = false;
            }
            if(fim < 0) {
                System.out.println("Fim não pode ser negativo");
                isNormalizado = false;
            }
            if(fim > 3000) {
                System.out.println("Fim não pode ser maior que 3000");
                isNormalizado = false;
            }
            if(fim <= inicio) {
                System.out.println("Fim deve ser maior que inicio");
                isNormalizado = false;
            }
            if(fim - inicio >= 10) {
                System.out.println("O intervalo não pode ter uma diferença maior que 10");
                isNormalizado = false;
            }
            
            if(isNormalizado) {
                for(int i = inicio; i <= fim; i++) {
                    System.out.println(multiplicando + " x " + i + " = " + multiplicando * i);
                }
            }
            
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
