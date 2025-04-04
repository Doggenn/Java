package ejecutable;

import java.util.Scanner;

public class Lector {
    public static void main(String[] args){
        String nombrePersona, nombrePersona2;
       
        int edadPersona, edadPersona2;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        nombrePersona = entrada.nextLine();
        System.out.print(nombrePersona + " ¿cual es tu edad?: ");
        edadPersona = entrada.nextInt();
        entrada.nextLine();
        
        System.out.print(nombrePersona + " ingresa el nombre de otra persona: ");
        nombrePersona2 = entrada.nextLine();
        System.out.print(nombrePersona + " ¿cual es la edad de" + nombrePersona2 + "?: ");
        edadPersona2 = entrada.nextInt();
        
        System.out.println("Hola " + nombrePersona + ". Tienes " + edadPersona + " años. Y " + nombrePersona2 + " tiene " + edadPersona2 + " años.");
    }
}
