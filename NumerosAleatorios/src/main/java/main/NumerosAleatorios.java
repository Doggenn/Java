package main;

import java.util.Scanner;
import java.util.Random;

public class NumerosAleatorios {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Lector de entrada de texto
        Random numeros = new Random(); //Generador de numeros aleatorios.
        
        //AAqui se genera un numero aleatorio entre el 1 y 100
        int numeroSecreto = numeros.nextInt(100)+1;
        int valorLeido;
        int intentos = 10;
        boolean adivino = false;
        
        
       for(int intento = 1; intento<=10; intento++){
            System.out.println("Intento "+ intento + " de "+ intentos + " intentos.");
            System.out.print(">> ");
            valorLeido = entrada.nextInt();
            entrada.nextLine();
           
            if(valorLeido==numeroSecreto){
                System.out.print("Acertaste. El numero era: " + numeroSecreto);
                adivino = true;
                break;
            }else{
                System.out.println("Fallaste");
                if(valorLeido<numeroSecreto){
                    System.out.println("El numero es mayor.");
                }else{
                    System.out.println("El numero es menor.");
                }
            }    
       }
       if (!adivino){
           System.out.print("Perdiste. El numero era: "+numeroSecreto);
       }
    }
}
