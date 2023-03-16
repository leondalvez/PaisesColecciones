/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paisescolecciones;

import Servicio.ServicioPais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class PaisesColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        ///Generamos el Scanner para tomar el ingreso.
        Scanner leer = new Scanner(System.in);
        ///Iniciamos el conjunto de paises
        HashSet<String> paises = new HashSet();
        ///Instanciamos el servicio para acceder a sus métodos.
        ServicioPais sp = new ServicioPais();
        
        ///Llamamos al método crearPaises con la colección como parametro
        sp.crearPaises(paises);
        
        ///Creamos una lista cpasandole los paises en el constructor.
        ArrayList<String> paisesLista = new ArrayList(paises);
        ///Ordenamos la Lista con sort().
        Collections.sort(paisesLista);
        
        ///Ahora mostramos los países
        System.out.println("");
        System.out.println("Paises ordenados alfabeticamente:");
        for (String pais : paisesLista){
            System.out.print("[" + pais + "]");                    
        }
        System.out.println("");
        System.out.println("Ingrese el pais que desee eliminar:");
        String p = leer.nextLine();
        
        ///Llamamos al Método que elimina los paises.
        sp.eliminarPais(p, paises);
    }
    
}
