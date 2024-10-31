package Militar;

public class SoldadoRaso extends Soldado {
    public SoldadoRaso(String nombre, String id) {
        super(nombre, id, new Rango(1){
            @Override
            public void realizarAccion() {
                System.out.println("Siguiendo órdenes de los superiores.");
            }
        });
    }

    @Override
    public void mostrarinformacion(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("ID: " + getId());
        System.out.println("Rango: " +  rango.getRango());
    }

}