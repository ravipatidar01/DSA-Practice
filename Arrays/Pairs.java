/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.Array;

/**
 *
 * @author Asus
 */
public class Pairs {

    public static void pairs(int num[]) {
        int tp = 0;
        for (int i = 0; i < num.length; i++) {
            int curr = num[i];
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + curr + "," + num[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs :" + tp);
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10, 12, 16};
        pairs(num);

    }
}
