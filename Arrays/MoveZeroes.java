/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa.Array;

/**
 *
 * @author Asus
 */
public class MoveZeroes {
       public static void movezero(int num[]) {
            int j = 0;
            for (int i = 0; i < num.length; i++) {
                if (num[i] !=0) {
                  int  temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                    j++;
                } 
            }  
            
        }  
       public static void main(String[] args) {
         int num []= {0,1,0,3,12};
                    movezero(num);
            for (int nums : num) {
               System.out.print(nums + " ");
           }
        
    }
}
