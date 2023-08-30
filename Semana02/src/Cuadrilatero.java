/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
    public abstract class Cuadrilatero extends FiguraGeometrica{
    protected Punto vertice1;
    protected Punto vertice2;
    protected Punto vertice3;
    protected Punto vertice4;

    public Cuadrilatero(String nombre, Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4) {
        super.nombre = nombre;
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
        this.vertice4 = vertice4;
    }
    @Override
    abstract double calcularAreaFigura();

    @Override
    public boolean esRegular(){
        if(checkRectangulo(vertice1, vertice2, vertice3, vertice4)==true){
            return true;
        }else{
            return false;
        }
        
    }

    public Punto getVertice1() {
        return vertice1;
    }

    public void setVertice1(Punto vertice1) {
        this.vertice1 = vertice1;
    }

    public Punto getVertice2() {
        return vertice2;
    }

    public void setVertice2(Punto vertice2) {
        this.vertice2 = vertice2;
    }

    public Punto getVertice3() {
        return vertice3;
    }

    public void setVertice3(Punto vertice3) {
        this.vertice3 = vertice3;
    }

    public Punto getVertice4() {
        return vertice4;
    }

    public void setVertice4(Punto vertice4) {
        this.vertice4 = vertice4;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    private boolean checkRectangulo(Punto v1,Punto v2, Punto v3, Punto v4){
        Punto auxVert = v1.calcularPuntoMasCercano(new Punto[]{v2,v3,v4});
        if (auxVert.equals(v2)) {
            return v1.getDistancia(v3) == v2.getDistancia(v4)
                && v1.getDistancia(v4) == v2.getDistancia(v3)
                && escalarProducto(v1,auxVert,v1.calcularPuntoMasCercano(new Punto[]{v3,v4}));
        }else if(auxVert.equals(v3)){
            return v1.getDistancia(v2) == v3.getDistancia(v4)
                && v1.getDistancia(v4) == v3.getDistancia(v2)
                && escalarProducto(v1, auxVert, v1.calcularPuntoMasCercano(new Punto[]{v2,v4}));
        }else if(auxVert.equals(v4)){
            return v1.getDistancia(v2) == v4.getDistancia(v3)
                && v1.getDistancia(v3) == v4.getDistancia(v2)
                && escalarProducto(v1, auxVert, v1.calcularPuntoMasCercano(new Punto[]{v2,v3}));
        }else {
            return false;
        }
    }
    
    private boolean escalarProducto(Punto p1, Punto p2, Punto p3){
        return (p3.getCoordenada_y()-p1.getCoordenada_y())*(p2.getCoordenada_y()-p1.getCoordenada_y()) + 
               (p3.getCoordenada_x()-p1.getCoordenada_x())*(p2.getCoordenada_x()-p1.getCoordenada_x())==0;
    }

    @Override
    public String toString() {
        return "Cuadrilatero{" +super.toString() +"vertice1=" + vertice1 + ", vertice2=" + vertice2 + ", vertice3=" + vertice3 + ", vertice4=" + vertice4 + '}';
    }
    
    
    
}
