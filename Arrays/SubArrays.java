/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa.Array;

/**
 *
 * @author Asus
 */
public class SubArrays {

    public static void subarray(int num[]) {
        int ts = 0;
        for (int i = 0; i < num.length; i++) {
            int curr = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                int sum = i + j;
                for (int k = curr; k <= end; k++) {
                    System.out.print(num[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray  =" + ts);
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10, 12, 16};
        subarray(num);

    }
}
