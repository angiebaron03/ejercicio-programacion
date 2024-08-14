package com.mycompany.ejercicio2p;
 import java.util.Scanner;
/**
 *
 * @author ANGIE  BARON
 */
public class Ejercicio2P {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de numeros que desea introducir");
        int cantidad = scanner.nextInt();
        
        int[] numeros = new int[cantidad];
         
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        for (int i=0; i<cantidad;i++){
           
        System.out.println("ingrese el numero" + (i+1)+ ":");
        numeros[i] = scanner.nextInt();
        
        if (numeros[i]>0){
            positivos++;}
        else if (numeros[i]<0){
            negativos++;}
        else {ceros++;            
        }
          System.out.println("Cantidad de números positivos: " + positivos);
           System.out.println("Cantidad de números negativos: " + negativos);
           System.out.println("Cantidad de ceros: " + ceros);  
     }
 
    }
    }
