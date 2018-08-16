/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gold.mine;

import java.util.Scanner;

/**
 *
 * @author micro computer
 */
public class GoldMine {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N*M dimention");
        int R = sc.nextInt();
        int C = sc.nextByte();
        System.out.println("Enter the Matrix");
        int arr[][] = new int[R+1][C+1];
        
        for(int i=1; i<=R; i++){
            for(int j=1; j<=C; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter Test Case:");
        int q= sc.nextInt();
        while(q-->0){
            System.out.println("Enter X1,X2,Y1,Y2:");
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int y1=sc.nextInt();
            int y2=sc.nextInt();
            int row =Math.min(x1, x2);
            int col =Math.max(y1, y2);
            int sum=0;
            for(int i=row; i<=Math.max(x1, x2); i++){
                for(int j=Math.min(y1, y2); j<=col; j++){
                    sum+=arr[i][j];
                }
            }
            System.out.println(sum);
        }
    }
    
}
