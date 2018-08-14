/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trappingrainwater;

import java.util.Scanner;

public class TrappingRainWater {
    int[] n;
    int result=0;
    int LeftMax=0,RightMax=0,first,last;
    
    TrappingRainWater(int[] n){
        this.n = n;
        last = n.length - 1;
        first= 0;
    }
   int result(){
       while(first<=last){
           if(n[first]<n[last])
           {
               if(n[first]>LeftMax)
                  LeftMax=n[first]; 
               else
                  result += LeftMax-n[first];
                first++; 
           }
           else{
               if(n[last]>RightMax)
                   RightMax = n[last];
               else
                result +=RightMax-n[last];
            last--;
            }
        }
       return result;
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t>0){
            int n = Sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n ; i++)
                arr[i] = Sc.nextInt();
            TrappingRainWater kth = new TrappingRainWater(arr);
            System.out.println(kth.result());
            t--;
        }
    }
    
}
