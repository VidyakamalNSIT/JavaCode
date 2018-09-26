/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stealth.edu_07;

import java.util.Scanner;

/**
 *
 * @author Vidyakamal
 */
public class StealthEdu_07 {

    boolean checkPalindrom(String s){
        int length = s.length();
        for(int i=0; i<=length/2;i++){
            if(s.charAt(i)!=s.charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println(str);
        StealthEdu_07 SE = new StealthEdu_07();
        System.out.println(SE.checkPalindrom(str)); 
        
    }
    
}
