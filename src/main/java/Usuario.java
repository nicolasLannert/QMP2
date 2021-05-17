import material.Material;
import tipoPrenda.TipoPrenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Usuario {

    public String nombreUsuario;
    public List<Atuendo> armario = new ArrayList<>();
    boolean deseoSalir = false;

    public void agregarAlArmario(Atuendo atuendo){
        armario.add(atuendo);
    }

    public Prenda generarPrenda(TipoPrenda tipo, String colorPrincipal, Material material){
        Prenda prendaNueva = new Prenda();
        prendaNueva.setTipo(tipo);
        prendaNueva.setMaterial(material);
        prendaNueva.setColorPrincipal(colorPrincipal);
        prendaNueva.validarPrenda();
        return prendaNueva;
    }

    public Prenda generarPrenda(TipoPrenda tipo, String colorPrincipal, Material material, Optional<String> colorSecundario){

        Prenda prendaNueva = new Prenda();
        prendaNueva.setTipo(tipo);
        if(deseoSalir == true){
            return prendaNueva;
        }
        prendaNueva.setMaterial(material);
        prendaNueva.setColorPrincipal(colorPrincipal);
        prendaNueva.setColorSecundario(colorSecundario);
        return prendaNueva;
    }

    public void guardarPrenda(Atuendo atuendo,Prenda prenda){
        if(atuendo == null){
            Atuendo atuendoNuevo = new Atuendo();
            atuendoNuevo.cargarPrenda(prenda);
        } else atuendo.cargarPrenda(prenda);
    }




}
