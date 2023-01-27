/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarray;

// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ArrayList012 {

    public static void main(String[] args) {
        
          ArrayList <String> arreglo2 = obtenerDatos();
          String cadenaFinal = obtenerCadenaFinal(arreglo2);
          System.out.printf("%s\n", cadenaFinal);
    }
    
    public static  ArrayList<String> obtenerDatos() {
        ArrayList <String> arreglo2 = new ArrayList<>();
        boolean bandera = true;
        String pais;
        Scanner entrada = new Scanner(System.in);
        String letra;  
        
        while(bandera){
            System.out.println("Ingrese un nobre de un pais");
            pais = entrada.nextLine();
            arreglo2.add(pais);
            
            System.out.println("Si desea terminar el proceso presione S");
            letra = entrada.nextLine();
            if("s".equals(letra)){
                bandera=false;
            }
        }
        return arreglo2; 
    }    
    public static String obtenerCadenaFinal(ArrayList<String> lista){
        String cadenaFinal = " ";
        
        for (int i = 0; i < lista.size(); i++) {
            cadenaFinal= String.format("%s%s\n", cadenaFinal, lista.get(i));
    }
        return cadenaFinal;
    }}
    

        
        
       /* ArrayList <String> arreglo2 = new ArrayList<>();
        boolean bandera = true;
        String pais;
        Scanner entrada = new Scanner(System.in);
        String letra; 
        
        while(bandera){
            System.out.println("Ingrese un nobre de un pais");
            pais = entrada.nextLine();
            arreglo2.add(pais);
            
            System.out.println("Si desea terminar el proceso presione S");
            letra = entrada.nextLine();
            if("s".equals(letra)){
                bandera=false;
            }
        }
        System.out.println("Presentar los valores en pantalla");
        
        for (int i = 0; i < arreglo2.size(); i++) {
            System.out.printf("&s\n",arreglo2.get(i));*/