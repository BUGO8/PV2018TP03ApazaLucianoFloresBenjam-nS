/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto01;

import java.util.Scanner;

/**
 *
 * @author OmunkuloPC
 */
public class Punto01 {
    int[] i= new int [10];
    Scanner scan= new Scanner (System.in);
    
    
    public void iniciarPunto1(){
        IngreN(i);
        Mostrar(i);
        Menor(i);
        Mayor(i);
        CalcPromedio(i);
    }
    public void IngreN(int[] i){
        for (int j=0; j<10; j++){
            System.out.print("Escriba un numero: ");
            i[j]=scan.nextInt();
        }
    }
    
    public void Mostrar (int[] i){
        System.out.print("Los numeros son: ");
        for (int j=0; j<10; j++){
            System.out.print(i[j] + " ");
        }
    }
    public void Menor (int[] i)
    {
        int aux=0;
        for (int j=0; j<10; j++){
                if (i[aux]>i[j])
                    aux=j;
           }
        
        System.out.println("");
        System.out.println("El num menor es: " + i[aux]);
    }
        public void Mayor (int[] i)
    {
        int aux=0;
            for (int j=0; j<10; j++){
                if (i[aux]<i[j])
                    aux=j;
           }
        System.out.println("El numero mayor es: " + i[aux]);
    }
        public void CalcPromedio (int[] i ){
            int aux=0;
            for (int j=0; j<10; j++){
                aux=aux+i[j];
            }
            System.out.println("Su promedio es: " + aux/10);
        }
}