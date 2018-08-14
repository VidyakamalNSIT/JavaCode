/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superstring;

import java.util.Scanner;

/**
 *
 * @author micro computer
 */
public class SuperString {
    private double n;
    SuperString(int n,int k)
    {
        this.n=n*k;
        //this.k=k;
    }
    double super_digit()
    {
        int temp;
        if(n==0)
            return (int)n;
        else{
            temp=(int)n%10;
            n=n/10;
            temp+=super_digit();
        }
        if(temp>9)
        {
            n=temp;
            temp=0;
            temp+=super_digit();
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt(),k=s.nextInt();
        SuperString sp = new SuperString(n,k);
        System.out.print(sp.super_digit());
        
    }
    
}
