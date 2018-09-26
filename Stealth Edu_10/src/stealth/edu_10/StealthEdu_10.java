/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stealth.edu_10;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vidyakamal
 */
public class StealthEdu_10 {
    String units[] = { "", "One", "Two", "Three", "Four","Five", "Six", "Seven",
                        "Eight", "Nine", "Ten", "Eleven", "Twelve","Thirteen", 
                        "Fourteen", "Fifteen", "Sixteen", "Seventeen","Eighteen", "Nineteen" };
    String tensMult[] = {"", "", "Twenty", "Thirty", "Forty", "Fifty", 
                             "Sixty", "Seventy", "Eighty", "ninety"}; 
    
    String wordsDigit(int n){
        if (n < 0) {
           return "Minus " + wordsDigit(-n).toLowerCase();
        }
        if (n < 20) {
            return units[n];
        }
        if (n < 100) {
            return tensMult[n / 10] + ((n % 10 != 0) ? " " : "")+ units[n % 10].toLowerCase();
        }
        if (n < 1000) {
            return units[n / 100] + " hundred" +((n % 100 != 0) ? " and " : "")+ wordsDigit(n % 100).toLowerCase();
        }
    return wordsDigit(n / 1000) + " thousand" + ((n % 10000 != 0) ? " " : "") + wordsDigit(n % 1000).toLowerCase();
    }

    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           StealthEdu_10 SE = new StealthEdu_10();
           System.out.println(SE.wordsDigit(n));
    }
    
}
