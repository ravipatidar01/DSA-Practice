/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa.Array;

/**
 *
 * @author Asus
 */
public class Max_subarraysum_kadane {
 
//    Approach: Kadane’s Algorithm
//Time Complexity: O(n)
//Space Complexity: O(1)  
    
    public static void kadanes(int no[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < no.length; i++) {
            cs = cs + no[i];
            if (cs < 0) {
                cs = 0;

            }
            ms = Math.max(cs, ms);
        }
        System.out.println("our max subarray sum is : " + ms);
    }

    public static void main(String[] args) {
        int no[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(no);
    }
}
