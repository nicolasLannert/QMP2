package material;

import material.Material;

public class Tela extends Material {

    public TramaTela tramaTela;

    public Tela(TramaTela trama){
        this.tramaTela=trama;
    }
    public Tela(){
        this.tramaTela=TramaTela.LISA;
    }


}
