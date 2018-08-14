/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmatch;

import java.util.Scanner;

/**
 *
 * @author micro computer
 */

public class StringMatch {

   public int str(String[][] s,int n) {
int flg=0;
for(int j=0;j<s.length;j++) {
    System.out.println(s.length);
for(int i=0;i<n-1;i++) {
    System.out.print(s[j][i]+" and "+s[j][i+1]);
    if((s[j][i]=="1" )&& (s[j][i+1]=="1"))
    flg++;
    break;
}

}
return flg;
}
    public static void main(String[] args) {
        // TODO code application logic here
        StringMatch strin = new StringMatch();
        Scanner sc = new Scanner(System.in);
        int i,n = sc.nextInt();
        int n1 = sc.nextInt();
        String[][] arr = new String[n1][n];
        for(i=0;i<n1;i++)
            arr[i][0]=sc.nextLine();
        System.out.print(strin.str(arr, 3));
        
    }
    
}
