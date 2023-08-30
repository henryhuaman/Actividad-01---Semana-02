
import static java.lang.Math.PI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class Circulo extends FiguraGeometrica implements Shape{
    private int radio;
    private Punto centro;

    public Circulo(String nombre, Punto centro, int radio) {
        super.nombre=nombre;
        this.radio=radio;
        this.centro=centro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }
    
    @Override
    double calcularAreaFigura() {
        return PI*radio;
    }
    
    @Override
    boolean esRegular() {
       return true;
    }

    @Override
    public String toString() {
        return "Circulo{" +super.toString() +"radio=" + radio + ", centro=" + centro + ", perimetro=" + obtenerPerimetro()+'}';
    }

    @Override
    public double obtenerPerimetro() {
        return 2*PI*radio;
    }
}
