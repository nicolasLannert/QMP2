import material.Material;
import tipoPrenda.Categoria;
import tipoPrenda.TipoPrenda;

import java.util.Optional;

public class Prenda {

    public TipoPrenda tipo;
    public Categoria categoria;
    public Material material;
    public String colorPrincipal;
    public Optional<String> colorSecundario;


    public void validarPrenda(){
        if(this.tipo == null || this.categoria==null || this.colorPrincipal==null || this.material== null){
            throw new RuntimeException("Datos de prenda ingresados incorrectamente");
        }
    }

    public void setTipo(TipoPrenda tipo) {
        this.tipo = tipo;
        this.setCategoria();
    }

    public void setCategoria(){
        this.categoria = tipo.getCategoriaPrenda();
    }


    // Getters y Setters por defecto

    public TipoPrenda getTipo() {
        return tipo;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getColorPrincipal() {
        return colorPrincipal;
    }

    public void setColorPrincipal(String colorPrincipal) {
        this.colorPrincipal = colorPrincipal;
    }

    public Optional<String> getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(Optional<String> colorSecundario) {
        this.colorSecundario = colorSecundario;
    }
}
