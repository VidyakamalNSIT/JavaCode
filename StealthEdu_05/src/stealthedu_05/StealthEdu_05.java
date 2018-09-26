/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stealthedu_05;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Vidyakamal
 */
public class StealthEdu_05 {

  static boolean checkForInt(String s){
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
    
    static  void printArr(int [] Int_arr,int x){
        for (int i=0; i<Int_arr.length; i++) {
            if(x==Int_arr[i])
            System.out.print(i+1+" ");
        }
    }
    
    static  void printArr(int [] Int_arr){
        for (int i : Int_arr) {
            if(i!=Integer.MIN_VALUE)
            System.out.print(i+" ");
        }
    }
    
    static boolean dublicate_check(int [] Int_arr){
        HashMap<Integer,Integer> HashFun = new HashMap<>();
        for (int i = 0; i < Int_arr.length; i++) {
            if(HashFun.containsValue(Int_arr[i])&& Int_arr[i]!=Integer.MIN_VALUE){
                return true;
            }
            HashFun.put(i, Int_arr[i]);
        }
        return false;
    }
    
    static void find_num(int [] Int_arr,int x){
        boolean flag=false;
        for (int i : Int_arr) {
            if(i==x){
                flag=true;
                break;
            }
        }
        if (flag) {            
            System.out.print(x+" is present in array");
        }
        else{
            System.out.print(x+" is not present in array");
        }
    }
    
    public static void main(String[] args) {
        StealthEdu_05 se = new StealthEdu_05();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all Array eliment in one line with seperate then by space");
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        int Int_arr[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(!checkForInt(arr[i])){
                Int_arr[i]=Integer.MIN_VALUE;
            }
            else{
                Int_arr[i]=Integer.parseInt(arr[i]);
            }
        }
        int ch,x=0;
        String Choice;
        
        System.out.println("---------------------Option---------------------");
        System.out.println("1. Find if a number ‘x’ is in the array or not.");
        System.out.println("2. Print the position of the number ‘x’");
        System.out.println("3. does it contain any duplicate elements?");
        System.out.println("4. Print all the numbers in the array");
        do {            
            ch = sc.nextInt();
            switch(ch){
                case 1:{
                    System.out.print("Enter The value of X: ");
                    x = sc.nextInt(); 
                    find_num(Int_arr,x);
                }break;
                case 2:{
                    System.out.print("Enter The value of X: ");
                    x = sc.nextInt(); 
                    printArr(Int_arr,x);
                }break;
                case 3:System.out.print(dublicate_check(Int_arr));
                break;
                case 4: printArr(Int_arr);
                break;
            }
            System.out.print("\nAnother Query: yes/no\n");
            Choice = sc.next();
        } while (!Choice.equalsIgnoreCase("no"));
        
    }    
}
