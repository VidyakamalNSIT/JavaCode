/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotatedoublyll;
import java.util.Scanner;
interface DoubleLL{
    public void ToString();
    public void creatList();
}
class node{
    int data;
    node(int data){
        this.data = data;
    }
    node next;
    node prev;
}

public class RotateDoublyLL implements DoubleLL{
    static Scanner SC = new Scanner(System.in);
    int n,p;
    node start;
    RotateDoublyLL(int n, int p){
        this.n = n;
        this.p = p;
    }
    public void creatList(){
        node start = new node(SC.nextInt());
            node preNode = new node(SC.nextInt());
            start.next = preNode;
            preNode.prev = start;
            node newNode;
            while(n-->2){
                newNode = new node(SC.nextInt());
                preNode.next = newNode;
                newNode.prev = preNode;
                preNode = newNode;
            }
            this.start=start;
    }
    public void ToString(){
        while(start!= null){
                System.out.print(start.data+" ");
                start = start.next;
            }
    }
    public void rotation(){
        node temp=start;
        int i = p;
        while(p-->0){
            temp = temp.next;
        }
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        while(i-->0){
            System.out.print(start.data+" ");
            start = start.next;
        }
    }

    public static void main(String[] args) {
        //Scanner SC = new Scanner(System.in);
        int t = SC.nextInt();
        while(t-->0){
            int n = SC.nextInt();
            int p = SC.nextInt();
            RotateDoublyLL rl = new RotateDoublyLL(n,p);
            rl.creatList();
            rl.rotation();                
            //rl.ToString();
        }
    }
    
}
