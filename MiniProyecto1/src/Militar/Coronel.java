package Militar;

public class Coronel extends Soldado {
    private String estrategia;

    public Coronel(String nombre, String id, String estrategia) {
        super(nombre, id, new Rango(4) {
            @Override
            public void realizarAccion() {
                System.out.println("El Coronel está dando órdenes");
            }
        });
        this.estrategia = estrategia;
    }

    @Override
    public void mostrarinformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Rango: " +  rango.getRango());
        System.out.println("Estrategia: " + estrategia);
    }

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

}