/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import java.util.Scanner;

/**
 *
 * @author dogge
 */
public class CondicionDoWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String opcion;
        double largo, ancho, radio, area, perimetro;
        final double PI = 3.1416;
        final String OPCION_1 = "1";
        final String OPCION_2 = "2";
        final String OPCION_SALIR = "0";

        System.out.print(
                "Elige una opción: \n\n"
                + "1 o a) Rectangulo \n"
                + "2 o b) Circulo \n\n"
                + "0 o s) Salir \n\n"
                + ">>"
        );


        opcion = entrada.nextLine();

        do{
            System.out.print(
                "Elige una opción: \n\n"
                + "1 o a) Rectangulo \n"
                + "2 o b) Circulo \n\n"
                + "0 o s) Salir \n\n"
                + ">>"
                );
            opcion = entrada.nextLine();
            switch(opcion){
                case OPCION_1, "a", "A":
                    System.out.print("Ingresa el largo del rectangulo: ");
                    largo = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.print("Ingresa el ancho del rectangulo: ");
                    ancho = entrada.nextDouble();
                    entrada.nextLine();

                    area = largo * ancho;
                    perimetro = (largo+ancho)*2;
                    System.out.println("Area = " + area+"\n" + 
                                     "Perimetro = " + perimetro);
                    System.out.print("Presiona ENTER para continuar.");
                    entrada.nextLine();
                    break;
                case OPCION_2, "b", "B":
                    System.out.print("Ingresa el radio del circulo: ");
                    radio = entrada.nextDouble();
                    entrada.nextLine();

                    area = radio * radio * PI;
                    perimetro = radio * 2 * PI;
                    System.out.println("Area = " + area+"\n" + 
                                     "Perimetro = " + perimetro);
                    System.out.print("Presiona ENTER para continuar.");
                    entrada.nextLine();
                    break;
                case OPCION_SALIR, "s","S":
                    break;
                default:
                    System.out.print("ERROR: No es una opcion valida.");
                    System.out.print("Presiona enter para salir.");
                    entrada.nextLine();
            }
        }while(!opcion.equals(OPCION_SALIR) && !opcion.equals("s") && !opcion.equals("S"));
        System.out.print("Presiona enter para salir.");
        entrada.nextLine();
    }
}