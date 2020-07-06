/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double saldomedio, credito;
         Scanner ler = new Scanner (System.in);

         System.out.println("Saldo medio");
         saldomedio = ler.nextDouble();

         if(saldomedio <= 200){
        credito = 0;
         }else if(saldomedio > 201 && saldomedio <= 400){
        credito = saldomedio * 0.2;
         }else if(saldomedio > 400 && saldomedio <= 600){
        credito = saldomedio * 0.3;
         }else {
        credito = saldomedio *0.4;
        }
        System.out.println("o valor do saldo medio é R$:"+saldomedio+"\nSeu credito é de R$:"+credito);
    }
}