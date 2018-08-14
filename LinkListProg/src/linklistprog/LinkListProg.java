/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklistprog;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author micro computer
 */
public class LinkListProg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;//=sc.nextLine();
        int ch;
        LinkedList<Integer> Test;
        Test = new LinkedList<>();
        do{
        Test.add(sc.nextInt());
        System.out.print("To continue: Press 1 ");
        ch=sc.nextInt();
        }while(ch==1);
        System.out.println(Test);
        Test.add(3, 00);
        System.out.println(Test);
    }
    
}
    