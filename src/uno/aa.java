/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uno;
import java.util.Scanner;
/**
 *
 * @author MASN0
 */
public class aa {
    

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca el primer numero: ");
    int n1 = teclado.nextInt();
    System.out.println("Introduzca el segundo numero: ");
    int n2 = teclado.nextInt();
    System.out.println("Introduzca el tercer numero: ");
    int n3 = teclado.nextInt();
    int suma = n1 + n2 + n3;
    int multiplicacion = n1 * n2 * n3;
    System.out.println("La suma es: " + suma);
    System.out.println("La multiplicacion es: " + multiplicacion);
  
}
}
