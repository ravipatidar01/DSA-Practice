/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa.Array;

/**
 *
 * @author Asus
 */
public class binary_search {

    public static int binarysearch(int num[], int key) {
        int start = 0, end = num.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (num[mid] == key) {//found
                return mid;
            }
            if (num[mid] < key) {// right
                start = mid + 1;
            } else {//left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10, 12, 16};
        int key = 4;

        System.out.println("binary serach is :" + binarysearch(num, key));

    }
}
