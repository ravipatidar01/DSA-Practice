/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa.Strings;

/**
 *
 * @author Asus
 */
public class Check_palindrome {

    public static boolean checkpalindrome(String sc) {
        for (int i = 0; i < sc.length() / 2; i++) {
            if (sc.charAt(i) != sc.charAt(sc.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String sc = "noon";
        System.out.println(checkpalindrome(sc));
    }
}
