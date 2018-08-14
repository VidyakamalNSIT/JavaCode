/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinklist;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
    }
}
public class DoubleLinklist {
    int length;
    DoubleLinklist(){
        length=0;
    }
    Node head;
    void add(int data){
        Node NewNode = new Node(data);
        Node Temp=head;
        if(length==0){
            head = NewNode;
            length++;
            return;
        }
        while(Temp.next != null){
            Temp = Temp.next;
        }
        Temp.next = NewNode;
        NewNode.prev = Temp;
        NewNode.next= null;
        length++;
    }
    public String ToString(){
        String result="[";
        if(head==null)
            return result+"]";
        result += head.data;
        Node Temp = head.next;
        while(Temp!=null){
            result += ","+Temp.data;
            Temp = Temp.next;
        }
       
        return result+"]";
    }
    public static void main(String[] args) {
        // TODO code application logic here
        DoubleLinklist Dl = new DoubleLinklist();
        Dl.add(21);
        Dl.add(31);
        Dl.add(22);
        Dl.add(26);
        Dl.add(24);
        System.out.println(Dl.ToString()+"\nLength="+Dl.length);
    }
    
}
