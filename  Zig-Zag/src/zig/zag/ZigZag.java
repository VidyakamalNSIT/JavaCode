
package zig.zag;

import java.util.Scanner;

public class ZigZag {

    int[] arr;
    ZigZag(int[] arr){
        this.arr = arr;
    }
    void result(){
        int max = Math.max(arr[0],arr[1]);
        for(int i=2; i<arr.length; i++){
            
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Sc = new Scanner(System.in);
	 int t = Sc.nextInt();
	 while(t-->0){
	     int n = Sc.nextInt();
	     int[] arr = new int[n];
	     for(int i=0; i<n ; i++)
                arr[i]= Sc.nextInt();
             ZigZag z = new ZigZag(arr);
	 }
    }
    
}
