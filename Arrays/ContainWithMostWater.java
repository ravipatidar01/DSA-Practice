/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa.Array;

import static Dsa.Array.arry_leetcode_questions.containwithmostwater;

/**
 *
 * @author Asus
 */
public class ContainWithMostWater {

    public static int containwithmostwater(int h[]) {
        int maxwater = 0;
        int lp = 0;
        int rp = h.length - 1;

        while (lp < rp) {
            int ht = Math.min(h[lp], h[rp]);
            int width = rp - lp;
            int currwater = ht * width;
            maxwater = Math.max(maxwater, currwater);

            if (h[lp] < h[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxwater;
    }

    public static void main(String[] args) {
        int h[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(containwithmostwater(h));
    }
}
