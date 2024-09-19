import java.util.Scanner;

public class Datos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        String nombreUsuario = teclado.nextLine();
        System.out.println("Tipo de cuenta:");
        String tipoDeCuenta = teclado.nextLine();
    }
}
