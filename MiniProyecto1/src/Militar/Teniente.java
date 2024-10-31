package Militar;

public class Teniente extends Soldado {
    private String unidad;

    public Teniente(String nombre, String id, String unidad) {
        super(nombre, id, new Rango(2) {
            @Override
            public void realizarAccion() {
                System.out.println("El Teniente se reporta a su unidad");
            }
        });
        this.unidad = unidad;
    }

    @Override
    public void mostrarinformacion(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("ID: " + getId());
        System.out.println("Rango: " +  rango.getRango());
        System.out.println("Unidad: " +  getUnidad());
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

}