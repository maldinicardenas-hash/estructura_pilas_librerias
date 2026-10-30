/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciopila2;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTES
 */
public class Ejerciciopila2 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 
        //int []pila = new int [5]; 
        LinkedList<String> pila = new LinkedList<String>();
        //int tope = -1; 
        int opcion; 
        do { 
            System.out.println("PIlA CON ARREGLOS");
            System.out.println("1. agregar numero a la pila ");
            System.out.println("2. retirar un numero a la pila");
            System.out.println("3. mostrar la pila");
            System.out.println("4. mostrar el tope "); 
            System.out.println("5. SALIR");
            System.out.println("6. OPCION");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch(opcion){

                case 1:
                    System.out.println("hey bro agrega un elemento a la pila");
                    String palabras = teclado.nextLine();
                    pila.push(palabras);
                    break; 
                
                case 2:
                    if (pila.isEmpty()){ 
                        System.out.println("hey bro la pila esta vacia loco se serio "); 
                    }else{
                        System.out.println("retirar"+ pila.pop());
                    }
                    break;

                case 3: 
                    if (pila.isEmpty()){  
                        System.out.println("hey bro la pila esta vacia loco se serio "); 
                    }else{
                        System.out.println("los elementos de la pila son: ");
                        for(String elemento : pila){
                            System.out.println("PILA " + elemento);
                        }
                    }
                    break;

                case 4:
                    if (pila.isEmpty()){
                        System.out.println("hey bro la pila esta vacia loco se serio ");
                    }else{
                        System.out.println("el tope de la pila es: " + pila.peek());
                    }
                    break;

                case 5:
                    System.out.println("salir");
                    break;
                    default:
                    System.out.println("opcion no valida");
            }
            
        }while(opcion != 5);
        teclado.close();
    }
}
