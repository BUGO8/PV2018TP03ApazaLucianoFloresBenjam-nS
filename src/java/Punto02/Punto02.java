/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto02;

import java.util.Scanner;

/**
 *
 * @author OmunkuloPC
 */
public class Punto02 {
    private int x;
    private int y;
    
    public Punto02() {
    }
    public Punto02(int x2, int y2) {
        this.x = x2;
        this.y = y2;
    }
    Scanner scan= new Scanner(System.in);
 
    public void asignarRapido(){
        System.out.print("x es:");
        setX(scan.nextInt());
        System.out.print("y es:");
        setY(scan.nextInt());
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }
    
}
