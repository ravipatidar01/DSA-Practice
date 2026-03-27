/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa.Array;

/**
 *
 * @author Asus
 */
public class SubarraySum_brute {

    public static void subarraysum_brute(int num[]) {
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    currsum += num[k];
                }
                System.out.println(currsum);
                if (maxSum < currsum) {
                    maxSum = currsum;
                }
            }
        }
        System.out.println("max sum : " + maxSum);
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10, 12, 16};

        subarraysum_brute(num);

    }
}
