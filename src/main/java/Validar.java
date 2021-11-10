import java.util.Scanner;

public class Validar {

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
