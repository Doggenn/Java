/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import java.util.Scanner;

/**
 *
 * @author doggenn
 */
public class SentenciaIf {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int edad;
        
        System.out.print("Introduce tu edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        
        if(edad == 40){
            System.out.print("Tienes 40 años exactamente.");
        }
        else if(edad < 40){
            System.out.print("Eres joven.");
        }
        else {
            System.out.print("Eres mayor.");
        }
    }
}
