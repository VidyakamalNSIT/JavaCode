/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compute.sum.of.digits.in.all.numbers.from.pkg1.to.n;

import java.util.Scanner;

/**
 *
 * @author micro computer
 */
public class ComputeSumOfDigitsInAllNumbersFrom1ToN {
    private int n;
    ComputeSumOfDigitsInAllNumbersFrom1ToN(int n){
        this.n=n;
    }
    int result(int n){   
        int sum=0,sum1=0,temp=0;
        while(n>9){
            int k=n;
            while(k!=0){
                temp += k%10;
                k=k/10;
            }
            sum = sum+temp;
            n--;
        }
        if(n==0)
            return 0;
        sum1 =n+result(n-1);
        return sum + sum1;
    }
    int digitSum(int n){
        if(n==0){
            return 0;
        }
        return n%10 + digitSum(n/10);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t>0){
            int n = Sc.nextInt();
            ComputeSumOfDigitsInAllNumbersFrom1ToN c =new ComputeSumOfDigitsInAllNumbersFrom1ToN(n);
            System.out.println(c.result(n));
        // TODO code application logic here
        t--;
        }
    }
    
}
