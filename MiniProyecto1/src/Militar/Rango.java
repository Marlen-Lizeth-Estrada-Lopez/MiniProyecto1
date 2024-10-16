package Militar;

abstract public class Rango {
    protected int nivel;
    protected String rangoString;

    public void definir_rango(int nivel){
        if(nivel == 1){
            rangoString = "Soldado raso";
        }
        else if(nivel == 2){
            rangoString = "Teniente";
        }
        else if(nivel == 3){
            rangoString = "Capitan";
        }
        else if(nivel == 4){
            rangoString = "Coronel";
        }
    }

    public abstract void realizarAccion();

    public Rango(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    };

    public String getRango(){
        return rangoString;
    }
}