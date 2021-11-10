import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {

    private Validar validar = new Validar();

    private String nombreEmpresa;
    private String direccion;
    private ArrayList<Sucursal> sucursal;
    public Sucursal Sucursal;

    public void ejecutar() {
        crearEmpresa();
        mostrarMenu();
    }

    private void crearEmpresa() {
        this.nombreEmpresa = pedirString("Ingrese el nombre de la empresa");
        this.direccion = pedirString("Ingrese direccion de empresa");
    }

    private void mostrarMenu() {
        System.out.println("************** Empresa Transportista **************");
        System.out.println("[1] Agregar Productos");
        System.out.println("[2] Quitar Productos");
        System.out.println("[0] Salir");
        System.out.println("***************************************************");
        int min = 0;
        int max = 2;
        elegirOpcionMenu(validar.pedirNumeroLimitado(min, max));
    }

    private void elegirOpcionMenu(int opcion) { //digamos que el menu tiene 5 opciones --> min=0, max=4
        int min = 0;
        int max = 2;
        while (opcion != 0){
            switch (opcion) {
                case 1 -> casoAgregarProducto();
                case 2 -> casoQuitarProducto();
                case 0 -> System.out.println("Adios...");
            }
            opcion = validar.pedirNumeroLimitado(min, max);
        }
    }

    private void elegirCamion() {

    }

    private void elegirPack() {

    }

    private void casoQuitarProducto() {
    }

    private void casoAgregarProducto() {
    }

    private String pedirString(String instruccion) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(instruccion);
        return scanner.nextLine();
    }
}