/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa.Array;

/**
 *
 * @author Asus
 */
public class Buy_Sell_Stock {
      public static int buysellstock1(int prices1[]) {
//          Approach :- Greedy
//         Time Complexity O(n)
//         Space ComplexityO(1)
             int buyprice =  Integer.MAX_VALUE;
             int maxprofit = 0;
             for (int i = 0; i < prices1.length; i++) {
                 if (buyprice < prices1[i]) { // profit
                     int profit = prices1[i]- buyprice;  //today's profit
                     maxprofit = Math.max(maxprofit, profit);
                 } else {
                     buyprice = prices1[i];
                 }
             }
             return maxprofit;
         }
    public static void main(String[] args) {
            int prices1 [] = {7,1,5,3,6,4};
           System.out.println(buysellstock1(prices1));
    }
}
