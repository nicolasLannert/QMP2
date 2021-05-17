import java.util.ArrayList;
import java.util.List;

public class Atuendo {
    public List<Prenda> atuendo = new ArrayList<>();

    public void cargarPrenda(Prenda prenda){
        prenda.validarPrenda();
        atuendo.add(prenda);
    }



}
