/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgreturn.two.prime.numbers;

import java.util.Scanner;

/**
 *
 * @author micro computer
 */
public class ReturnTwoPrimeNumbers {
    int n;
    ReturnTwoPrimeNumbers(int n){
        this.n = n;
    }
    //int temp=n-2;
    int nomber(int temp){
        return primeno(temp)!=0 && primeno(n-temp)!=0?temp:nomber(temp-1);
    }
    int primeno(int n){
        
        if ( n < 2 ){
        return 0;
        }
        for(int i= (int)Math.sqrt(n);i>=2;i--){
            if(n%i==0){
                return 0;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t>0){
            int n = Sc.nextInt();
            ReturnTwoPrimeNumbers r = new ReturnTwoPrimeNumbers(n);
            int a = r.nomber(n-2);
            System.out.println(n-a+" "+a);
            t--;
        }
    }
    
}
