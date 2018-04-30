/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto04;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author OmunkuloPC
 */
public class Punto04 {
    ArrayList<REC> listaRec=new ArrayList<>();
    Random rand = new Random ();
    Scanner scan=new Scanner (System.in);
    
    
    public void ListaLLENA(){
        for (int i=0; i<10; i++){
            listaRec.add(new REC(rand.nextInt(50)+1, rand.nextInt(50)+1, rand.nextInt(50)+1, rand.nextInt(50)+1));
        }
        listar();
        eliminar();
    }
    public void listar (){
        for (int i=0; i<listaRec.size(); i++){
            System.out.print((i+1) + ") ");
            System.out.println("Su base es: " + listaRec.get(i).getB());
            System.out.println("Su altura es: " + listaRec.get(i).getH());
            System.out.println("X: " + listaRec.get(i).getX() + "   Y: " + listaRec.get(i).getY());
            System.out.println("Su superficie es: "+ (listaRec.get(i).getH()*listaRec.get(i)*listaRec.get(i).getB()));
            System.out.println("El perimetro es: " + (listaRec.get(i).getH()*2+listaRec.get(i).getB()*2));
            System.out.println("");
            System.out.println("-------------------------------------------------------------------------------------------");
            
        }
    }
    public void eliminar(){
        int aux=1;
        while (aux<listaRec.size() && aux>0){
            System.out.print("Cual quiere eliminar ");
            int n=scan.nextInt();
            listaRec.remove(n-1);
            listar();
            System.out.print("Si desea seguir eliminando, Ingrese un numero que no este en la lista para salir: ");
            aux= scan.nextInt();
            
        }
    }
}
