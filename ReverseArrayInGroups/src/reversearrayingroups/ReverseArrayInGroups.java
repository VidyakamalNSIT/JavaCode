/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversearrayingroups;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author micro computer
 */
public class ReverseArrayInGroups {

    private int[] n;
    private int k;
    ReverseArrayInGroups(int[] n,int k){
        this.n = n;
        this.k =k;
    }
    void print(int[] a){
        int start=0,last=n.length,c=k;
        while(k<last){
            //System.out.print(k);
            revers(start,k);
            start +=c;
            k +=c; 
            
        }
        revers(start,last);
        //System.out.print(k+" "+last);
    }
        void revers(int start,int last){
        while(last>start){
            System.out.print(n[last-1]+" ");
            last--;
        }
        
    }
//        for( ; i<l; i++)
//        System.out.print(n[(l-1)-i]);

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t>0){
            int n = Sc.nextInt();
            int k = Sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n ; i++)
                arr[i] = Sc.nextInt();
            
            ReverseArrayInGroups Gr = new ReverseArrayInGroups(arr,k);
            Gr.print(arr);
            t--;
        }
    }
    
}
