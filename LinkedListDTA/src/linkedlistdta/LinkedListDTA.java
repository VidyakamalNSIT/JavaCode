/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistdta;
class LinkNode{
    //Node Data & pointer
    private int Data;
    LinkNode Next;
    // Node Cunstructor
    LinkNode(int Data){
        this.Data = Data;
    }
    // Getting nextnode
    LinkNode getNext(){
        return this.Next;
    }
    // Method to Set next node
    void setNext(LinkNode Next){
        this.Next = Next;
    }
    // Method to get data of node
    int getData(){
        return Data;
    }
    // Methode to Set Data in node 
    void setData(int Data){
        this.Data = Data;
    }
    
}
public class LinkedListDTA {
    int length;
    // Defaulte cunstructore 
    LinkedListDTA(){
        length=0;
    }
    LinkNode head;
    // methode to get head 
    LinkNode getHead(){
        return head;
    }
    void insertAtBigin(int data){
        LinkNode NewNode = new LinkNode(data);
        if(length==0){
          head=NewNode;
          length++;
          return;
        }
        NewNode.Next = head;
        head = NewNode;              
        length++;
    }
    void insetAt(int p, int data){
        LinkNode NewNode = new LinkNode(data);
        LinkNode preNode=head;
        if(p==0){
            NewNode.Next=head;
            head = NewNode;
            return;
        }
        for(int i=1; i<p; i++){
            preNode = preNode.Next;
        }
        NewNode.Next = preNode.Next;
        preNode.Next=NewNode;
    }
    void deletAtEnd(){
        LinkNode preNode=head,Temp=head;
        while(Temp.Next != null){
            preNode=Temp;
            Temp=Temp.Next;
        }
        preNode.Next=null;
    }
    void insertAtEnd(int data){
        
        if(head==null){
            head=new LinkNode(data);
        }
        else{
            LinkNode p=head;
            while(p.getNext() != null){
              p= p.getNext();
            }
            p.setNext(new LinkNode(data));
        }
        length++;
    }
    int nthfind(int n){
        LinkNode temp = head;
        while(n-->1){
            temp=temp.Next;
        }
        return temp.getData();
    }
    int lastEliment(){
            if(head==null)
                return head.getData();
                LinkNode CurrentNode = head;
                while(CurrentNode.getNext()!=null){
                    CurrentNode= CurrentNode.getNext();
                }
                return CurrentNode.getData();
    }
    public String ToString(){
        String result="[";
        if(head==null)
            return result+"]";
        result += head.getData();
        LinkNode Temp = head.getNext();
        while(Temp!=null){
            result += ","+Temp.getData();
            Temp = Temp.getNext();
        }
        return result+"]";
    }
    
    public static void main(String[] args) {
        LinkedListDTA Link = new LinkedListDTA();
        System.out.println(Link.ToString());
        
        Link.insertAtBigin(5);
        
        System.out.println(Link.ToString());
        System.out.println("Last "+Link.lastEliment());
        //System.out.println("2 eliment "+Link.nthfind(2));
        Link.insetAt(1, 10);
        Link.insertAtBigin(015);
        System.out.println(Link.ToString());
        System.out.println("Last "+Link.lastEliment());
        System.out.println("2 eliment "+Link.nthfind(2));
        Link.deletAtEnd();
        System.out.println(Link.ToString());
        System.out.println("Last "+Link.lastEliment());
        System.out.println("2 eliment "+Link.nthfind(2));
    }
    
}
