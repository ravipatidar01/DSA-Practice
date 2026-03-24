/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa.Array;

/**
 *
 * @author Asus
 */
public class largest_smallest_elements {
      public static int largestvalue (int num1[]) {
        int largest = Integer.MIN_VALUE;
        int smallest =  Integer.MAX_VALUE;
        for (int i = 0; i <=num1.length-1; i++) {
            if (largest<num1[i]) {
                largest = num1[i];
            }
            if (smallest> num1[i]) {
                smallest = num1[i];
            }
        }
        System.out.println("smallest is :" +smallest);
        return largest;
    }
    public static void main(String[] args) {
         int num1[] = {10,17,30,22,15};
        System.out.println("largest value is: " +largestvalue(num1));
    }
}
