/*
Given an unsorted array of size N. Find the first element in array such that all of its left elements are smaller and all right elements to it are greater than it.

Note: Left and right side elements can be equal to required element. And extreme elements cannot be required element.

Input:
The first line of input contains an integer T denoting the number of test cases. 
Then T test cases follow. Each test case consists of two lines. 
First line of each test case contains an Integer N denoting size of array and the second line contains N space separated array elements.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package left.small.right.greater;

import java.util.Arrays;
import java.util.Scanner;

public class LeftSmallRightGreater {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int testCase=in.nextInt();
        while(testCase-->0){
            int size=in.nextInt();
            int arr[]=new int[size];
            int leftMax[]=new int[size];
            int rightMax[]=new int[size];
            for(int i=0;i<size;i++){
                arr[i]=in.nextInt();
            }
            int temp1=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){

                if(arr[i]>temp1){
                    leftMax[i]=arr[i];
                    temp1=arr[i];
                }else {
                    leftMax[i]=temp1;
                }
            }
            System.out.print(Arrays.toString(leftMax)+" ");
            int temp2=Integer.MAX_VALUE;
            for(int i=size-1;i>=0;i--){

                if(arr[i]<temp2){
                    rightMax[i]=arr[i];
                    temp2=arr[i];
                }else {
                    rightMax[i]=temp2;
                }
            }
            System.out.println(Arrays.toString(rightMax)+" ");
            boolean found=false;
            int temp=0;
            for(int i=1;i<size-1;i++){
                if(arr[i]>=leftMax[i] && arr[i]<=rightMax[i]){
                found=true;
                temp=arr[i];
                break;
                }
            }
            if(found){
                System.out.println(temp);
            }else {
                System.out.println(-1);
            }
        }
    }
}