/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stealth.edu_03;

import java.util.Scanner;

/**
 *
 * @author Vidyakamal
 */
public class StealthEdu_03 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int count =0;
        int n = sc.nextInt();
        if(n<904 || n>1100){
            System.out.print("Given number is ");
            if (n<904) {
                System.out.println("less than 904");
            }
            else{
                System.out.println("greater than 1100");
            }
        }
        else{
            for(int i=904; i<=1100; i=i+2){
                if(i%2==0){
                    i++;                
                }
                System.out.print(i+" ");
                count++;
            }
            System.out.println("\n"+count);
        }
    }
    
}
