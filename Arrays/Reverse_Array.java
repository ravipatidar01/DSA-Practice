/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa.Array;

/**
 *
 * @author Asus
 */
public class Reverse_Array {
     public static void reverse (int num[]){
        int first = 0, last = num.length-1;
        while(first<last){
            int temp =  num[last];
            num[last]  = num[first];
            num[first] = temp;
            
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
                int num[] = {2,4,6,8,10,12,16};

           reverse(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+ " ");
        }
        System.out.println();

    }
}
