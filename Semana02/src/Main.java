
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Punto p1=new Punto(8,0);
        Punto p2=new Punto(4,7);
        Punto p3=new Punto(0,0);
        
        Triangulo triangulo = new Triangulo("t1", p1, p2, p3);
        
        
        Circulo c1 = new Circulo("c1", new Punto(0, 0), 3);
        
        Rectangulo r1= new Rectangulo("r1", new Punto(0, 0), new Punto(0, 4), new Punto(6, 4), new Punto(6, 0));
        
        SuperficiePlana s1=new SuperficiePlana();
        
        
        s1.agregarFigura(triangulo);
        s1.agregarFigura(c1);
        s1.agregarFigura(r1);
        
        for(FiguraGeometrica r : s1.getFiguras()){
            System.out.println("El area "+r.getNombre()+" :"+r.calcularAreaFigura()+
                                "\n"+r.toString()+"\n"); 
        }
    }
}
