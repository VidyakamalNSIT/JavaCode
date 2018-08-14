
package javapro;

import java.util.Scanner;
import java.util.Set;


public class JavaPro {
     void tower(int n,char Start,char End,char Aux){
        if(n==1)
        {
            System.out.println("Move disk 1 from rod " +  Start + " to rod " + End);
            return;
        }
        tower(n-1,Start,Aux,End);
        System.out.println("Move disk " + n + " from rod " +  Start + " to rod " + End);
        tower(n-1,Aux,End,Start);
        }

    public static void main(String args[]){
        JavaPro JP = new JavaPro();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char Start= 'A',Aux='B',End='C';
        JP.tower(n,Start,End,Aux);
    
       
   }
}