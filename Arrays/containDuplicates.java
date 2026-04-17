/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa.Array;

/**
 *
 * @author Asus
 */
public class containDuplicates {

    public static boolean containduplicate(int arr1[]) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] == arr1[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr1[] = {7, 1, 5, 3, 5, 4};
        System.out.println(containduplicate(arr1));
    }
}
