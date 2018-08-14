/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kthsmallestno;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestNo {
    private int[] n;
    private int k;
    int count=0;
    
    KthSmallestNo(int[] n, int k){
        this.n = n;
        this.k = k;
    }
    void find(){
        while(count<k){
            int flag =count;
            for(int i =count+1;i<n.length ;i++){
            if(n[flag]>n[i])
                flag = i;
            }
            if(flag!=0)
            swap(count,flag);
            count++;
        }
    }
    void swap(int count,int flag){
       int temp = n[count];
        n[count]=n[flag];
        n[flag]=temp;       
    }
    void print(){
        find();
        System.out.println(n[count-1]);
    }
   
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t>0){
            int n = Sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n ; i++)
                arr[i] = Sc.nextInt();
            int k = Sc.nextInt();
            KthSmallestNo kth = new KthSmallestNo(arr,k);
            kth.print();
            t--;
        }// TODO code application logic here
    }
    
}
