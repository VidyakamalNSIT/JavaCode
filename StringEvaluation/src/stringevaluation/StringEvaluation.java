/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringevaluation;

import java.util.Scanner;

/**
 *
 * @author micro computer
 */
public class StringEvaluation {
    static char find(StringBuffer s){
        int n = s.length();
        for(int i=0; i<n; i=i+2){
            if(i<n && i+2<n){
                if(s.charAt(i+1)=='A'){
                    if(s.charAt(i)=='0' || s.charAt(i+2)=='0'){
                        s.setCharAt(i+2, '0');
                    }
                    else
                        s.setCharAt(i+2, '1');
                }
                if(s.charAt(i+1)=='A'){
                    if(s.charAt(i)=='0' && s.charAt(i+2)=='0'){
                        s.setCharAt(i+2, '0');
                    }
                    else
                        s.setCharAt(i+2, '1');
                }
                if(s.charAt(i+1)=='A'){
                    if(s.charAt(i)==s.charAt(i+2)){
                        s.setCharAt(i+2, '0');
                    }
                    else
                        s.setCharAt(i+2, '1');
                }
            }
        }
        
        return s.charAt(n-1);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuffer S = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        S = sc.next();
        //int result = Integer.valueOf(S.);
        System.out.println(find(s));
    }
    
}
