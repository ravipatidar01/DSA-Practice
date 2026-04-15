/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa.Array;

import static Dsa.Array.arry_leetcode_questions.twosum2;
import java.util.Arrays;

/**
 *
 * @author Asus
 */
public class twoSum_twoPointer {

    public static int[] twosum2(int arr[], int target) {
        int lp = 0;
        int rp = arr.length - 1;

        while (lp < rp) {
            int sum = arr[lp] + arr[rp];

            if (sum == target) {
                return new int[]{lp, rp};
            } 
            else if (sum < target) {
                lp++;
            } 
            else {
                rp--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15}; // sorted array
        int target = 9;

        int result[] = twosum2(arr, target);

        System.out.println(Arrays.toString(result));
    }
}