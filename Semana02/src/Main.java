/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Punto p1=new Punto(8,0);
        Punto p2=new Punto(4,7);
        Punto p3=new Punto(0,0);
        
        Triangulo triangulo = new Triangulo("regular", p1, p2, p3);
        
        
        
        System.out.println(triangulo.calcularAreaFigura());
        System.out.println(triangulo.esRegular());
    }
    
}
