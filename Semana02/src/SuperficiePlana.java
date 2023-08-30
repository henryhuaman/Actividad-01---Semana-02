
import java.util.ArrayList;
import java.util.List;


public class SuperficiePlana {
    private List<FiguraGeometrica> figuras= new ArrayList<FiguraGeometrica>();
    
    public void agregarFigura(FiguraGeometrica figura){
        figuras.add(figura);
    }

    public List<FiguraGeometrica> getFiguras() {
        return figuras;
    }
    
}
