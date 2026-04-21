/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa.Strings;

/**
 *
 * @author Asus
 */
public class Find_ShortestPath {
    public static float shortestpath(String str) {
        int y = 0;
        int x = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('W' == str.charAt(i)) {
                x--;
            } else if ('E' == str.charAt(i)) {
                x++;
            } else if ('N' == str.charAt(i)) {
                y++;
            } else if ('S' == str.charAt(i)) {
                y--;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);

    }
    public static void main(String[] args) {
           String str = "WNEENESENNN";
        System.out.println(shortestpath(str));
    }
}
