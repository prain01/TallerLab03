import java.util.Scanner;

public class Sucursal {

    private int codigoSucursal;
    private int region;


    public void probarSucursal() {
        mostrarMenu();
    }

    private void mostrarMenu() {
        System.out.println("************** Empresa Transportista **************");
        System.out.println("[1] Agregar Productos");
        System.out.println("[2] Quitar Productos");
        System.out.println("[0] Salir");
        System.out.println("***************************************************");
        int min = 0;
        int max = 2;
        elegirOpcionMenu(pedirNumeroLimitado(min, max));
    }

    private void elegirOpcionMenu(int opcion) { //digamos que el menu tiene 5 opciones --> min=0, max=4
        int min = 0;
        int max = 2;
        while (opcion != 0){
            switch (opcion) {
                case 1 -> casoAgregar();
                case 2 -> casoQuitar();
                case 0 -> System.out.println("Adios...");
            }
            opcion = pedirNumeroLimitado(min, max);
        }
    }

    private void casoQuitar(Object pack) {

    }

    private void casoAgregar() {
    }

    private int pedirNumeroLimitado(int min, int max){
        System.out.println("Indique un numero (" + min + "-" + max + ")");
        int num;
        do {
            num = pedirNumero();
            if(!limitesNumero(num, min, max)){
                System.out.println("Indique un número y/o carácter válido");
            }
        } while (!limitesNumero(num, min, max));
        return num;
    }

    private int pedirNumero(){
        Scanner teclado = new Scanner(System.in);
        int numero;
        do {
            try {
                numero = teclado.nextInt();
                break;
            } catch (Exception e){
                System.out.println("Indique un número y/o carácter válido");
                teclado.nextLine();
            }
        } while (true);
        return  numero;
    }

    private boolean limitesNumero(int num, int min ,int max) {
        return (min <= num && num <= max);
    }
}

