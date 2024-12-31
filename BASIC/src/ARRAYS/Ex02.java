package ARRAYS;

import java.util.Scanner;

public class Ex02 {
public void run() {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("ENTER THE ARRAY SIZE: ");
    int n = sc.nextInt();
    System.out.println("THE ARRAY SIZE IS: " + n);
    
    int[] nums = new int[n];
    
    for (int i = 0; i < n; i++) {
        System.out.print("ENTER THE ARRAY ELEMENT " + (i + 1) + ": ");
        nums[i] = sc.nextInt();
    }
    
    int highestNum = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
        if (nums[i] > highestNum) {
            highestNum = nums[i];
        }
    }
    System.out.println("THE HIGHER NUMBER IS: " + highestNum);
    
    int lowestNum = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
        if (nums[i] < lowestNum) {
            lowestNum = nums[i];
        }
    }
    System.out.println("THE LOWER NUMBER IS: " + lowestNum);
    
    sc.close();
}
}
