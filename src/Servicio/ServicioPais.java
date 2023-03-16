/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioPais {
    
    ///Creamos un Scanner para la entrada
    Scanner leer = new Scanner(System.in);
    
    ///Creamos el Método que crea paises solicitando al usuario.
    public void crearPaises(HashSet<String> paises){
        String opcion = "";        
        do {
            System.out.println("Ingrese el nombre del pais:");
            String pais = leer.next();            
            paises.add(pais);            
            System.out.println("Desea continuar?S/N");
            opcion = leer.next();            
        } while (opcion.equalsIgnoreCase("S"));
        
        for (String pais : paises){
            System.out.print("[" + pais + "]");                    
        }     
    }
    
    ///Creamos el Método que elimina el país
    public void eliminarPais(String p, HashSet<String> paises){
        Iterator<String> it = paises.iterator();
        int contador = 0;
        while (it.hasNext()){
            if (it.next().equalsIgnoreCase(p)){
                it.remove();
                contador++;
                for (String pais : paises){
                System.out.print("[" + pais + "]");                    
                }                
            }         
        }
        if (contador == 0){
            System.out.println("El pais no se encuentra registrado");
        }
    }
}
