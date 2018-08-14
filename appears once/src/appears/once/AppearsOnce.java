/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appears.once;

import java.util.Scanner;

/**
 *
 * @author micro computer
 */
public class AppearsOnce {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int flag =0;
        while(t-->0){
            int n=sc.nextInt();
	        int xor=0;
	        for(int i=0;i<n;i++)
	        {
	            xor=xor^(sc.nextInt());
	        }
	        System.out.println(xor);
        }
    }
    
    
}
