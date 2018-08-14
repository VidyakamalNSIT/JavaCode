/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rearrange.an.array;

import java.util.Scanner;

/**
 *
 * @author micro computer
 */
public class RearrangeAnArray {
    private int[] arr;
    RearrangeAnArray(int[] arr){
        this.arr = arr;
    }
    void array(){
        for(int i=0;i<arr.length;i++)
            arr[i] = arr[i]+(arr[arr[i]]%arr.length)*arr.length;
        for(int i=0;i<arr.length;i++)
            arr[i]=arr[i]/arr.length;
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t>0){
            int n = Sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = Sc.nextInt();
            RearrangeAnArray r = new RearrangeAnArray(arr);
            r.array();
            t--;
        }
    }
    
}
