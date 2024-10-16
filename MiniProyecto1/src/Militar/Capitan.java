package Militar;

public class Capitan extends Soldado {
    private int cantidadSoladosBajoSuMando;

    public Capitan(String nombre, String id, int cantidadSoladosBajoSuMando) {
        super(nombre, id, new Rango(4) {
            @Override
            public void realizarAccion() {
                System.out.println("El Capitan llama a sus soldados");
            }
        });
        this.cantidadSoladosBajoSuMando = cantidadSoladosBajoSuMando;
    }

    @Override
    public void mostrarinformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Rango: " +  rango.getRango());
        System.out.println("Cantidad de soldados bajo su mando: " + cantidadSoladosBajoSuMando);
    }

    public int getCantidadSoladosBajoSuMando() {
        return cantidadSoladosBajoSuMando;
    }

    public void setCantidadSoladosBajoSuMando(int cantidadSoladosBajoSuMando) {
        this.cantidadSoladosBajoSuMando = cantidadSoladosBajoSuMando;
    }
    
}