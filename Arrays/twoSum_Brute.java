/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa.Array;

/**
 *
 * @author Asus
 */
public class twoSum_Brute {

    public static void twosum(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("sum is : " + i + " " + j);
                }
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;
        twosum(arr,target);
    }
}
