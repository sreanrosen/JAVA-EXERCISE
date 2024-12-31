package ARRAYS;

import java.util.Scanner;

/**
 * LLevar a cabo un programa que incluya un vector que almacene los nombres:
 * Alejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luis y Ludmila.
 * <p>
 * Realizar un recorrido del vector para cargar los datos y otro recorrido para mostrar lo mismos en pantalla.
 *
 * @author EDAN ROSE
 */

public class Ex01 {
public void run() {
    String[] names = new String[8];
    
    Scanner sc = new Scanner(System.in);
    
    for (int i = 0; i < names.length; i++) {
        System.out.print("ENTER NAME " + (i + 1) + ": ");
        names[i] = sc.nextLine();
    }
    
    for (int i = 0; i < names.length; i++) {
        System.out.println("INDEX " + (i + 1) + ": " + names[i]);
    }
    
    sc.close();
    }
}