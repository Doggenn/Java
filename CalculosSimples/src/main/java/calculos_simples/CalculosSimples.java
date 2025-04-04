package calculos_simples;

import java.util.Scanner;

public class CalculosSimples {
    public static void main(String args[]){
    Scanner consola = new Scanner(System.in);
    
    int largo, ancho, perimetro;
    double area, base, altura;
    
    
    System.out.print("Ingresa el largo del rectangulo: ");
    largo = consola.nextInt();
    consola.nextLine();
    
    System.out.print("Ingresa el ancho del rectangulo: ");
    ancho = consola.nextInt();
    consola.nextLine();
    
    perimetro = (largo + ancho)*2;
    area = largo * ancho;
    
    System.out.println("Area = " + area);
    System.out.println("Perimetro = " + perimetro);
    
    System.out.print("Ingresa la base: ");
    base = consola.nextDouble();
    consola.nextLine();
    
    System.out.print("Ingresa la altura: ");
    altura = consola.nextDouble();
    consola.nextLine();
    
    area = (base*altura)/2;
    
    System.out.println("Area = " + area);
    
    
    System.out.println("Vamos a calcular la media entre 3 numeros.");
    System.out.print("Ingresa el primer numero: ");
    base = consola.nextDouble();
    
    System.out.print("Ingresa el segundo numero: ");
    altura = consola.nextDouble();
    consola.nextLine();
    
    System.out.print("Ingresa el tercer numero: ");
    area = consola.nextDouble();
    
    System.out.print("La media es: " + ((area+base+altura)/3));
    
    }
}
