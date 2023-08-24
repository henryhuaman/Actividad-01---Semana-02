
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class Punto {
    private int coordenada_x;
    private int coordenada_y;

    public Punto() {
    }

    public Punto(int coordenada_x, int coordenada_y) {
        this.coordenada_x = coordenada_x;
        this.coordenada_y = coordenada_y;
    }
    
    
    public int getCoordenada_x() {
        return coordenada_x;
    }

    public void setCoordenada_x(int coordenada_x) {
        this.coordenada_x = coordenada_x;
    }

    public int getCoordenada_y() {
        return coordenada_y;
    }

    public void setCoordenada_y(int coordenada_y) {
        this.coordenada_y = coordenada_y;
    }
    
    public double getDistancia(){
        Punto pto=new Punto(0,0);
        return getDistancia(pto);
    }
    
    public double getDistancia(Punto punto1){
        double punto1CoordenadaX=punto1.getCoordenada_x();
        double punto1CoordenadaY=punto1.getCoordenada_y();
        double punto2CoordenadaX=this.coordenada_x;
        double punto2CoordenadaY=this.coordenada_y;
        
        double distancia= sqrt(pow(punto1CoordenadaX-punto2CoordenadaX,2)+pow(punto1CoordenadaY-punto2CoordenadaY,2));
        return distancia;
    }

    @Override
    public String toString() {
        return "El punto tiene las siguientes coordenadas: " + coordenada_x + "," + coordenada_y;
    }
    
    
}
