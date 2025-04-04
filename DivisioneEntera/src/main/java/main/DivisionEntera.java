package main;

import java.util.Scanner;

public class DivisionEntera {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numeroCuatroCifras;
        int c1, c2, c3, c4;
        /*
        int cantPelotas, cantNiños;
        int pelotasPorNiño, pelotasSobrantes;
        
        System.out.print("Ingresa la cantidad de niños y la cantidad de pelotas: ");
        
        cantNiños = entrada.nextInt();
        cantPelotas = entrada.nextInt();
        entrada.nextLine();
        
        pelotasPorNiño = cantPelotas/cantNiños;
        pelotasSobrantes = cantPelotas%cantNiños;
        
        System.out.print("Pelotas por niño = " + pelotasPorNiño + ". Y sobran " + pelotasSobrantes + ".");
        */
        System.out.print("Ingresa un numero de 4 cifras: ");
        
        numeroCuatroCifras = entrada.nextInt();
        entrada.nextLine();
        
        c1 = numeroCuatroCifras%10;
        c2 = (numeroCuatroCifras/10)%10;
        c3 = (numeroCuatroCifras/100)%10;
        c4 = numeroCuatroCifras/1000;
        
        System.out.print("Suma de cifras = " + (c1+c2+c3+c4) );
    }
    
}
