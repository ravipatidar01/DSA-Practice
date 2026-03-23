/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa.Array;

/**
 *
 * @author Asus
 */
public class linearsearch {
         public static int linearsearch(int num[], int key) {
        for (int i = 0; i <= num.length; i++) {
            if (num[i] ==key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
         int num[] = {2,4,6,8,10,12,16};
        int key = 4;
        int index = linearsearch(num,key);
        if (index==-1) {
            System.out.println("key is not found");
        }else {
                    System.out.println("key is found : " +index);
                    }
        

    }

}
