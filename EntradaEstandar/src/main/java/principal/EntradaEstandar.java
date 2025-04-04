package principal;

import java.util.Scanner;

public class EntradaEstandar {
    public static void main(String args[]){
        String nombre;
        String edadTexto;
        int edad;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce tu nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Hola " + nombre + " ¿Como estas?");
        System.out.print("Introduce tu edad: ");
        edadTexto = entrada.nextLine();
        edad = Integer.parseInt(edadTexto);
        System.out.print("Asi que eres " + nombre + " y tienes " + edad + " años.");
        
        
    }
    
}
