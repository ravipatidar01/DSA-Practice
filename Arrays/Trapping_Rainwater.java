/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa.Array;

/**
 *
 * @author Asus
 */
public class Trapping_Rainwater {

    public static int trapping_water(int h[]) {
        int n = h.length;
        //  calculate left max boundary  - array
        int leftMax[] = new int[n];
        leftMax[0] = h[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(h[i], leftMax[i - 1]);

        }

        // calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n - 1] = h[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(h[i], rightMax[i + 1]);
        }
        int trappedWater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            //waterlevel =  Min(leftmax bound , rightmax bound
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            // trapeed water  =  waterlevel - height[i];
            trappedWater += waterlevel - h[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int h[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trapping_water(h));

    }
}
