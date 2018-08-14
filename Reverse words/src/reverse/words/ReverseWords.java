/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse.words;
import java.util.Scanner;
/**
 *
 * @author micro computer
 */
public class ReverseWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t =sc.nextInt();
                
        while(t-->0){
            String s = sc.next();
                     String result[]=s.split("\\.");
            for(int i =result.length-1;i>0;i--){
                System.out.print(result[i]+" ");
            }
            
        }
    }
    
}
