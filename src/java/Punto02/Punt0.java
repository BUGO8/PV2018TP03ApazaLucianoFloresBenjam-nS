/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author OmunkuloPC
 */
public class Punt0 {
    ArrayList <Punto02> lista=new ArrayList();
    Scanner scan= new Scanner(System.in);
    public void calcularDistancia(){
        lista.add(new Punto02());
        lista.get(0).asignarRapido();
        lista.add(new Punto02());
        lista.get(1).asignarRapido();
        double d=(Math.pow(lista.get(1).getX()-lista.get(0).getX(), 2)+Math.pow(lista.get(1).getY()-lista.get(0).getY(), 2));
        d= Math.sqrt(d);
        System.out.println("La distancia calculada es: " + d);
    }
  }
    
    
