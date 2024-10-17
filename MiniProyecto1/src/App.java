import java.util.ArrayList;
import java.util.Scanner;
import Militar.Soldado;
import Militar.Capitan;
import Militar.Coronel;
import Militar.SoldadoRaso;
import Militar.Teniente;

public class App {

    void crear(ArrayList<Soldado> ListaSoldados, Scanner scanner){
        System.out.println();
        System.out.println("----Rangos disponibles----");
        System.out.println("1. Soldado Raso");
        System.out.println("2. Teniente");
        System.out.println("3. Capitan");
        System.out.println("4. Coronel");
        System.out.print("Digite el numero correspondiente al rango: ");
        int nivel = scanner.nextInt();
        scanner.nextLine();
        switch (nivel) {
            case 1:
                System.out.print("Digite el nombre: ");
                String nombreSoldadoRaso = scanner.nextLine();
                System.out.print("Digite el ID: ");
                String idSoldadoRaso = scanner.nextLine();
                SoldadoRaso soldadoRaso = new SoldadoRaso(nombreSoldadoRaso, idSoldadoRaso);
                ListaSoldados.add(soldadoRaso);
                System.out.println("El soldado raso " + nombreSoldadoRaso + " con el ID" + idSoldadoRaso + " se ha añadido con exito");
                break;
            case 2:
                System.out.print("Digite el nombre: ");
                String nombreTeniente = scanner.nextLine();
                System.out.print("Digite el ID: ");
                String idTeniente = scanner.nextLine();
                System.out.print("Digite la unidad del teniente: ");
                String unidad = scanner.nextLine();
                Teniente teniente = new Teniente(nombreTeniente, idTeniente, unidad);
                ListaSoldados.add(teniente);
                System.out.println("El Teniente " + nombreTeniente + " con el ID" + idTeniente + " se ha añadido con exito");
                break;         
            case 3:
                System.out.print("Digite el nombre: ");
                String nombreCapitan = scanner.nextLine();
                System.out.print("Digite el ID: ");
                String idCapitan = scanner.nextLine();
                System.out.print("Digite la unidad del teniente: ");
                int cantidadSoladosBajoSuMando  = scanner.nextInt();
                scanner.nextLine();
                Capitan capitan = new Capitan(nombreCapitan, idCapitan, cantidadSoladosBajoSuMando);
                ListaSoldados.add(capitan);
                System.out.println("El Capitan " + nombreCapitan + " con el ID" + idCapitan + " se ha añadido con exito");
                break;             
            case 4:
                System.out.print("Digite el nombre: ");
                String nombreCoronel = scanner.nextLine();
                System.out.print("Digite el ID: ");
                String idCoronel = scanner.nextLine();
                System.out.print("Digite la estrategia del coronel: ");
                String estrategia = scanner.nextLine();
                Coronel coronel = new Coronel(nombreCoronel, idCoronel, estrategia);
                ListaSoldados.add(coronel);
                System.out.println("El Capitan " + nombreCoronel + " con el ID" + idCoronel + " se ha añadido con exito");
                break;   
            default:
                System.out.println("Usted digito un numero que no corresponde a ningún rango, por favor digitelo nuevamente");
                crear(ListaSoldados, scanner);
                break;
        }
    }

    void visualizar(ArrayList<Soldado> ListaSoldados){
        System.out.println("----Lista----");
        for(Soldado i:ListaSoldados){
            i.mostrarinformacion();
            System.out.println();
        }
    }

    void actualizar(ArrayList<Soldado> ListaSoldados, Scanner scanner){
        System.out.println("----Bienvenido al sistema de actualizacion----");
        System.out.println("A continuacion se le pedira el ID para encontrar el militar que desea actualizar");
        System.out.println("Si hay algun campo que no desea actualizar coloque la misma informacion que ya hay en el sistema");
        System.out.print("Digite el ID del militar que busca: ");
        String id = scanner.nextLine();
        for(Soldado i:ListaSoldados){
            String idDelSoldado = i.getId();
            if(idDelSoldado.equals(id)){
                System.out.print("Digite el nombre: ");
                String nombrenuevo = scanner.nextLine();
                System.out.print("Digite el ID: ");
                String idnuevo = scanner.nextLine();
                i.setNombre(nombrenuevo);
                i.setId(idnuevo);
                System.out.println("Digite el nuevo nivel (si es el mismo dijite el que tenia)");
                int nivel = scanner.nextInt();
                if(nivel == 2){
                    Teniente teniente = (Teniente) i;
                    System.out.print("Digite la nueva unidad del Teniente: ");
                    String unidad = scanner.nextLine();
                    teniente.setUnidad(unidad);
                    int indice = ListaSoldados.indexOf(i);
                    ListaSoldados.add(indice, teniente);
                }
                else if(nivel == 3){
                    Capitan capitan  = (Capitan) i;
                    System.out.print("Digite la nueva cantidad de soldados del capitan: ");
                    int nuevaCantidadSoladosBajoSuMando = scanner.nextInt();
                    scanner.nextLine();
                    capitan.setCantidadSoladosBajoSuMando(nuevaCantidadSoladosBajoSuMando);
                    int indice = ListaSoldados.indexOf(i);
                    ListaSoldados.add(indice, capitan);
                }
                else if(nivel == 4){
                    Coronel coronel = (Coronel) i;
                    System.out.print("Digite la nueva estrategia del coronel: ");
                    String estrategia = scanner.nextLine();
                    coronel.setEstrategia(estrategia);
                    int indice = ListaSoldados.indexOf(i);
                    ListaSoldados.add(indice, coronel);
                }
            System.out.println("La actualizacion se ha realizado con exito");
            }
        }
    }

    void menu(ArrayList<Soldado> ListaSoldados, Scanner scanner){
        System.out.println();
        System.out.println("----Bienvenido al registro militar----");
        System.out.println("A continuación se le mostraran las opciones disponibles: ");
        System.out.println("1. Registrar nuevo soldado");
        System.out.println("2. Visualizar listado de soldados");
        System.out.println("3. Modificar informacion de un soldado en especifico");
        System.out.println("4. Salir");
        System.out.print("Digite la opcion que necesita: ");
        int eleccion = scanner.nextInt();
        scanner.nextLine();
        if (eleccion == 1){
            crear(ListaSoldados, scanner);
            System.out.println("¿Desea continuar en el programa?");
            System.err.print("Digite 1 para continuar o cualquier otro numero para terminar el programa: ");
            int continuar = scanner.nextInt();
            scanner.nextLine();
            if (continuar == 1){
                menu(ListaSoldados, scanner);
            }
        }
        else if(eleccion == 2){
            visualizar(ListaSoldados);
            System.out.println("¿Desea continuar en el programa?");
            System.err.print("Digite 1 para continuar o cualquier otro numero para terminar el programa: ");
            int continuar = scanner.nextInt();
            scanner.nextLine();
            if (continuar == 1){
                menu(ListaSoldados, scanner);
            }
        }
        else if(eleccion == 3){
            actualizar(ListaSoldados, scanner);
            System.out.println("¿Desea continuar en el programa?");
            System.err.print("Digite 1 para continuar o cualquier otro numero para terminar el programa: ");
            int continuar = scanner.nextInt();
            scanner.nextLine();
            if (continuar == 1){
                menu(ListaSoldados, scanner);
            }
        }
        else if(eleccion == 4){
            System.out.println("Gracias por utilizar el programa vuelva pronto soldado");
        }
        else {
            System.out.println("Debido a que dijito una eleccion erronea el programa terminara, adios soldado");
        }
    }


    public static void main(String[] args) throws Exception {
        ArrayList <Soldado> ListaSoldados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        App app = new App();
        app.menu(ListaSoldados, scanner);
        scanner.close();
    }
}