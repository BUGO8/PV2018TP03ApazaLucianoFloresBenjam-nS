/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto03;

import java.util.Scanner;

/**
 *
 * @author OmunkuloPC
 */
public class Punto03 {
       int[] arreglo = new int[3];
       
    public void verificación(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese todos los lados del triangulo");
        arreglo[0]=scan.nextInt();
        arreglo[1]=scan.nextInt();
        arreglo[2]=scan.nextInt();
        if (arreglo[0]+arreglo[1]>arreglo[2] && arreglo[1]+arreglo[2]>arreglo[0] && arreglo[0]+arreglo[2]>arreglo[1]){
            Crear();
        }
        else
            System.out.println("No se ha formado la figura: ");
    }

    public void Crear(){
        System.out.println("El perimeto es " + (arreglo[0]+arreglo[1]+arreglo[2]));
}
}
