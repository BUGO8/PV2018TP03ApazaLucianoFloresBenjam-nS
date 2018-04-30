/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto05;

import java.util.Scanner;

/**
 *
 * @author OmunkuloPC
 */
public class Punto05 {
    auto auT[]=new auto [9];
    Scanner scan= new Scanner(System.in);
    
    
    public void asignar (){
        auT[0]=new auto("ODM 957", "Ford", "Fiesta", "Negro", "Nafta");
        auT[1]=new auto("AXZ 752", "Peugeot", "407", "Rojo", "Nafta");
        auT[2]=new auto("ODM 123", "Fiat", "Bravo", "Negro", "Nafta");
        auT[3]=new auto("OCX 643", "Ferrari", "California T", "Blanco", "Nafta");
        auT[4]=new auto("OZC 523", "Fiat", "500", "Azul", "Nafta");
        auT[5]=new auto("OWQ 534", "Hyundai", "Elantra", "Magenta", "Nafta");
        auT[6]=new auto("SDA 423", "Honda", "Civic", "Verde", "Nafta");
        auT[7]=new auto("AXZ 123", "Citroen", "C1", "Blanco", "Nafta");
        auT[8]=new auto("ASD 933", "Dacia", "Duster", "Negro", "Nafta");
        listar();
        agregarEstado();
    }
    public void listar (){
        for (int i=0;i<9;i++){
            System.out.print((i+1) + ": ");
            System.out.print("Patente: " + auT[i].getPatente());
            System.out.print("  Marca:" + auT[i].getMarca());
            System.out.print("  Modelo:" + auT[i].getModelo());
            System.out.print("  Color:" + auT[i].getColor());
            System.out.print("  Combustible:" + auT[i].getCombustible());
            if (auT[i].getEstado() != null)
            {
                System.out.print(" Estado:" + auT[i].getEstado());
            }
            System.out.println("");
            System.out.println("--|---|---|----|---|--|---|-|-|--|---|----|-|----|---|----|---|-----|----|-----|----|----");
        }
    }
    public void agregarEstado(){
        char res='s';
        while (res=='s' || res=='S'){
            System.out.println("Quiere poner el estado del vehiculo? s/n");
            res=scan.next().charAt(0);
            if (res =='s' || res== 'S'){
                System.out.println("Ingrese el numero al vehiculo que desea poner el estado: ");
                int aux=scan.nextInt();
                System.out.print("Escriba el estado del auto:" );
                auT[aux-1].setEstado(scan.next());
        }
        listar();
    }
}
}
