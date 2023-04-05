import java.util.Scanner;

/**
Se podria hacer tambien con librerias java, con Collections.textoInvertidoerse o Stingbuilder
La idea es hacer un metodo propio
*/

public class Palabrainversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una cadena de texto: ");
        String cadena = sc.nextLine();
		//String cadena = "Carlos Ramirez"; Prueba sin introducir scanner
        int len = cadena.length();
        String textoInvertido = "";
        for (int i = len-1; i>=0;i--)
        {
            textoInvertido = textoInvertido + cadena.charAt(i);
        }
        System.out.println("Texto original: " + cadena);
        System.out.println("Texto al revés: " + textoInvertido);
    }

}
