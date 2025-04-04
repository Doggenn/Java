/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import java.util.Scanner;

/**
 *
 * @author doggenn
 */
public class OpcionesIf {

    public static void main(String[] args) {
                Scanner entrada = new Scanner (System.in);
                String opcion;
                double largo, ancho, radio, area, perimetro;
                final double PI = 3.1416;

                System.out.print(
                        "Elige una opción: \n\n"
                        + "1)Rectangulo \n"
                        + "2)Circulo \n\n"
                        + "0) Salir \n\n"
                        + ">>"
                );
                opcion = entrada.nextLine();
                if(opcion.equals ("1")){
                    System.out.print("Ingresa el largo del rectangulo: ");
                    largo = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.print("Ingresa el ancho del rectangulo: ");
                    ancho = entrada.nextDouble();
                    entrada.nextLine();
                    
                    area = largo * ancho;
                    perimetro = (largo+ancho)*2;
                    System.out.print("Area = " + area+"\n" + 
                                     "Perimetro = " + perimetro);
                }else if (opcion.equals("2")){
                    System.out.print("Ingresa el radio del circulo: ");
                    radio = entrada.nextDouble();
                    entrada.nextLine();
                    
                    area = radio * radio * PI;
                    perimetro = radio * 2 * PI;
                    System.out.print("Area = " + area+"\n" + 
                                     "Perimetro = " + perimetro);
                }
                else if(opcion.equals("0")){
                    System.out.print("Presiona enter para salir.");
                    entrada.nextLine();                   
                }else{
                    System.out.print("ERROR: No es una opcion valida.");
                }
    }
}
