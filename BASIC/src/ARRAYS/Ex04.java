package ARRAYS;

import java.util.Scanner;

public class Ex04 {

/**
 * <b>PROBLEM 04:</b>
 * <br>
 * Un empleado desea almacenar en un vector sus 12 sueldos el año. A partir de esto, necesita un programa que 
 * determine y muestre la suma total de sus 12 sueldos y el promedio de sueldo que tuvo este año.  
 */

public void run() {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("ENTER THE NUMBER OF SALARIES TO CALCULATE: ");
    int numberOfSalaries = sc.nextInt();
    
    int[] salaries = new int[numberOfSalaries];
    for (int i = 0; i < numberOfSalaries; i++) {
        System.out.print("ENTER THE AMOUNT OF SALARY " + (i + 1) + ": ");
        salaries[i] = sc.nextInt();
    }
    
    int totalSalary = 0;
    for (int i = 0; i < numberOfSalaries; i++) {
        totalSalary += salaries[i];
    }
    System.out.println("THE TOTAL SALARY IS: " + totalSalary);
    
    double averageSalary = (double) totalSalary / numberOfSalaries;
    System.out.println("THE AVERAGE SALARY IS: " + averageSalary);
    
    sc.close();
}
}
