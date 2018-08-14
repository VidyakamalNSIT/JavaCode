/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackdta;
interface stack{
    public void push(int data);
    public int pop();
    public int length();
    public boolean isEmpty();
    public int topValue();
}
class Node{
    int data;
    Node(int data){
        this.data=data;
    }
    Node next;
}
public class StackDTA implements stack {
    int length;
    Node Top = null;
    StackDTA(){
        this.length=0;
    }
    @Override
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return (length==0);
    }
    @Override
    public void push(int data){
        Node temp = new Node(data);
        if(length==0){
            Top = temp;
            length++;
        }
        else{
            temp.next = Top;
            Top = temp;
            length++;
        }        
    }
    @Override
    public int pop(){
        if(length==0){
            return 0;
        }
        int data = Top.data;
        length--;
        Top = Top.next;
        return data;
    }
    @Override
    public int topValue(){
        if(length==0){
            return 0;
        }
        return Top.data;
    }
    public static void main(String[] args) {
        stack s1 = new StackDTA();
        s1.push(20);
        s1.push(201);
        System.out.println(s1.pop()+" "+s1.length()+" "+s1.isEmpty()+" "+s1.topValue());
        System.out.println(s1.pop()+" "+s1.length()+" "+s1.isEmpty()+" ");
        System.out.println(s1.pop()+" "+s1.length()+" "+s1.isEmpty()+" "+s1.topValue());
    }
    
}
