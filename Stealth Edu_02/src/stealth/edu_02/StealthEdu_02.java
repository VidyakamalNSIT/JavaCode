/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stealth.edu_02;
import java.util.*;

public class StealthEdu_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int sum =0;
        int n = sc.nextInt();
        if(n<1107 || n>21000){
            System.out.print("Given number is ");
            if (n<1107) {
                System.out.println("less than 1107");
            }
            else{
                System.out.println("greater than 21000");
            }
        }
        else{
            for(int i=1107; i<=21000; i=i+7){
                if(i%7!=0){
                    i= i+(7-i%7);                
                }
                sum += i;
            }
            System.out.println(sum);
        }
    }
    
}
