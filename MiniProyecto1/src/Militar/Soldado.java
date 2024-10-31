package Militar;

public class Soldado {
    String nombre;
    String id;
    Rango rango;

    public Soldado(String nombre, String id, Rango rango) {
        this.nombre = nombre;
        this.id = id;
        this.rango = rango;
    }

    public void mostrarinformacion(){
    }

    public int conseguirnivel(){
        int nivel = rango.getNivel();
        return nivel;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}