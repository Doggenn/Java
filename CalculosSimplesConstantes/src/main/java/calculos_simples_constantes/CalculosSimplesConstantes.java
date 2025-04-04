package calculos_simples_constantes;

import java.util.Scanner;

public class CalculosSimplesConstantes {
    public static void main (String args[]){
        Scanner consola = new Scanner(System.in);
        
        final double PI = 3.1415;
        
        double radio, perimetro, area;
        
        System.out.print("Ingresa el radio: ");
        radio = consola.nextDouble();
        consola.nextLine();
        
        perimetro = (radio * 2)*PI;
        area = radio*radio*PI;
        
        System.out.println("Perimetro = " + perimetro);
        System.out.println("Area = " + area);
        
    }
}
