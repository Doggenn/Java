package main;

import java.util.Scanner;

public class NumerosAleatorios {

    public static void main(String[] args) {
        int cantidad;
        var entrada = new Scanner(System.in);
        
        System.out.print("Ingresa la cantidad de asteriscos: ");
        cantidad = entrada.nextInt();
        entrada.nextLine();
        
        for (int i=1; i<=cantidad; i++){
            for(int j=cantidad; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
