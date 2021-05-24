/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morcalculadora;
import java.util.Scanner;
/**
 *
 * @author mrcs9
 */
public class MORCalculadora {
public static Scanner sc = new Scanner (System.in);
  static double n1=0,n2=0;

/**
     * @param args the command line arguments
     */
    public  static void main(String[] args) {
       
        // TODO code application logic here
        
        System.out.println("Seleccione una opcion");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        System.out.println("Introduzca su opcion");
        int op=sc.nextInt();
        
        System.out.println(" introduzca un numero");
        
        n1=sc.nextDouble();
        System.out.println("introduzca un numero");
        n2=sc.nextDouble();
        if (op==1) System.out.println(Calculadora.suma(n1, n2));
        if (op==2) System.out.println(Calculadora.resta(n1, n2));
        if (op==3) System.out.println(Calculadora.multiplicacion(n1, n2));
        if (op==4) System.out.println(Calculadora.division(n1, n2));
        
        
        
    }
    
}
