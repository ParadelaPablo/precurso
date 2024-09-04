import java.util.*;
import java.io.*;

class principal {

    public static String FirstReverse(String mensaje) {
        String str = "";
        for (int i = mensaje.length() - 1; i >= 0; i--){

            str = str + mensaje.charAt(i);
        }

        return str;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Este es el texto a dar vuelta: ");
        String mensaje = scanner.nextLine();

        String resultado = FirstReverse(mensaje);
        System.out.println("Cadena invertida: " + resultado);
        scanner.close();
    }

}