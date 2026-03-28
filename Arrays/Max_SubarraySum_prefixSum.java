/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa.Array;

/**
 *
 * @author Asus
 */
public class Max_SubarraySum_prefixSum {

    public static void printmax_subarray_sum2(int num[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        int prefix[] = new int[num.length];

        prefix[0] = num[0];
        //calculate sub array    
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum :" + maxsum);
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10,12,16};

        printmax_subarray_sum2(num);

    }
}
