
import static java.lang.Math.sqrt;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class Triangulo extends FiguraGeometrica implements Shape{
    String nombre;
    Punto punto1;
    Punto punto2;
    Punto punto3;

    public Triangulo() {
    }
    
    public Triangulo(String nombre, Punto punto1, Punto punto2, Punto punto3) {
        this.nombre = nombre;
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }
    
    

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    double calcularAreaFigura() {
        double s=(this.punto1.getDistancia(punto2)+this.punto2.getDistancia(punto3)+this.punto3.getDistancia(punto1))/2;
        double area=sqrt(s*(s-this.punto1.getDistancia(punto2))*(s-this.punto2.getDistancia(punto3))*(s-this.punto3.getDistancia(punto1)));
        return area;
    }

    @Override
    boolean esRegular() {
        if(this.punto1.getDistancia(punto2)==this.punto2.getDistancia(punto3) && this.punto2.getDistancia(punto3)==this.punto3.getDistancia(punto1) && this.punto1.getDistancia(punto2)==this.punto3.getDistancia(punto1)){
            return true;
        }else{
            return false;
        }
    }
    
    public double obtenerPerimetro() {
        return punto1.getDistancia(punto2)+punto2.getDistancia(punto3)+punto3.getDistancia(punto1);
    }
    
    @Override
    public String toString() {
        return "Triángulo: " + getNombre()+ "tiene 3 Puntos:"+ getPunto1().toString()+","+getPunto2().toString()+ ","+getPunto3().toString()+", perimetro=" + obtenerPerimetro()+" }";             
    }
    
}
