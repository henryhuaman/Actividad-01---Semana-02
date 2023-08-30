
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


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
    
    public Punto calcularPuntoMasCercano(Punto[] otrosPuntos){
        Punto _masCercanoPunto = null;
        double minDistancia = Double.MAX_VALUE;
        double actualDistancia;
        
        for (int i = 0; i < otrosPuntos.length; i++) {
            actualDistancia = this.getDistancia(otrosPuntos[i]);
            if(actualDistancia <= minDistancia){
                minDistancia=actualDistancia;
                _masCercanoPunto = otrosPuntos[i];
            }    
        }
        return _masCercanoPunto;
    }

    @Override
    public String toString() {
        return "El punto tiene las siguientes coordenadas: " + coordenada_x + "," + coordenada_y;
    }
    
    
}
