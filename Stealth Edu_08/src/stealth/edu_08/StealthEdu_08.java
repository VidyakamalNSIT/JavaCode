/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stealth.edu_08;

import java.util.Random;

/**
 *
 * @author Vidyakamal
 */
public class StealthEdu_08 {

       static int Randome_upto11(){
        Random rand = new Random(); 
        return rand.nextInt(11)+1;
    }
    public static void main(String[] args) {
        int num;  
            num = 11*(Randome_upto11()-1)+(Randome_upto11());  
            num = (num%13)+1;
        System.out.println(num);        
    }
    
}