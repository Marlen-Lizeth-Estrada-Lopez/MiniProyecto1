package Militar;

public class Teniente extends Soldado {
    private String unidad;

    public Teniente(String nombre, String id, String unidad) {
        super(nombre, id, new Rango(4) {
            @Override
            public void realizarAccion() {
                System.out.println("El Teniente se reporta a su unidad");
            }
        });
        this.unidad = unidad;
    }

    @Override
    public void mostrarinformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Rango: " +  rango.getRango());
        System.out.println("Unidad: " +  unidad);
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

}