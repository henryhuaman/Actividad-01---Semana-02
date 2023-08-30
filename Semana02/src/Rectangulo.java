
import java.awt.Point;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class Rectangulo extends Cuadrilatero implements Shape{

    public Rectangulo(String nombre, Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4) {
        super(nombre, vertice1, vertice2, vertice3, vertice4);
        if(super.esRegular()==false){
            System.out.println("no es un rectangulo");
        }
    }
    
    public static double calculateIrregularQuadrilateralArea(ArrayList<Point> vertices) {
        int n = vertices.size();
        double area = 0.0;

        for (int i = 0; i < n; i++) {
            Point current = vertices.get(i);
            Point next = vertices.get((i + 1) % n);

            area += (current.getX() * next.getY()) - (current.getY() * next.getX());
        }

        return Math.abs(area) / 2.0;
        }
    
    @Override
    double calcularAreaFigura() {
        double altura;
        double base;
        double area;
        Punto auxVert = vertice1.calcularPuntoMasCercano(new Punto[]{vertice2,vertice3,vertice4});
        if (auxVert.equals(vertice2)) {
            altura=vertice1.getDistancia(auxVert);
            auxVert = vertice1.calcularPuntoMasCercano(new Punto[]{vertice3,vertice4});
            base=vertice1.getDistancia(auxVert);
            return base*altura;
        }else if (auxVert.equals(vertice3)) {
            altura=vertice1.getDistancia(auxVert);
            auxVert = vertice1.calcularPuntoMasCercano(new Punto[]{vertice2,vertice4});
            base=vertice1.getDistancia(auxVert);
            return base*altura;
        }else{
            altura=vertice1.getDistancia(auxVert);
            auxVert = vertice1.calcularPuntoMasCercano(new Punto[]{vertice3,vertice2});
            base=vertice1.getDistancia(auxVert);
            return base*altura;
        }
    }

    @Override
    public String toString() {
        return "Rectangulo{" +super.toString()  +", perimetro=" + obtenerPerimetro()+ '}';
    }

    @Override
    public double obtenerPerimetro() {
        return vertice1.getDistancia(vertice2)+vertice2.getDistancia(vertice3)+vertice3.getDistancia(vertice4)+vertice4.getDistancia(vertice1);
    }
    
}
