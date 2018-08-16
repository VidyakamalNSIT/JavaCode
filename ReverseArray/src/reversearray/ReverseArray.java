/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversearray;

import java.util.Scanner;

/**
 *
 * @author micro computer
 */
public class ReverseArray {

    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n+1];
            int[] arr2 = new int[n+1];
            for(int i=1; i<=n; i++){
                arr[i] = sc.nextInt();
            }
            boolean flag = true;
            int i;
           try{
               
                for(i=1; i<=n; i++){
                    if(arr2[arr[i]]==0)
                    arr2[arr[i]]=i;
                    else
                        flag=false;
                }
                if(!flag)
                    System.out.println("not inverse");
                else
                    System.out.println("inverse");
            }
            catch(ArrayIndexOutOfBoundsException e){
                i=n;
                System.out.println("not inverse");
            }
           
            
        }

    }
}
