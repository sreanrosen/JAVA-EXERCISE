package ARRAYS;

import java.util.Scanner;

public class Ex03 {

/**
 * <b>PROBLEM:</b>
 * <br>
 * Realizar un programa que permita la carga de 15 números en un vector. Una vez cargados, se necesita que el 
 * programa cuente e informe cuántas veces se cargó el número 3.
 */

public void run() {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("ENTER THE ARRAY SIZE: ");
    int arrSize = sc.nextInt();
    
    int[] nums = new int[arrSize]; 
    
    for (int i = 0; i < arrSize; i++) {
        System.out.print("ENTER THE ARRAY ELEMENT " + (i + 1) + ": ");
        nums[i] = sc.nextInt();
    }
    
    int numThreeCount = 0;
    for (int i = 0; i < arrSize; i++) {
        if (nums[i] == 3 || nums[i] == -3) {
            numThreeCount++;
        }
    }
    System.out.println("NUMBER 3 HAS BEEN COUNTED " + numThreeCount + " TIMES");
    
    sc.close();
}
}
