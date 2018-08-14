
package linklist;
public class Linklist {
    
    Node  Head;
    int count;
    Linklist() {
        Head = null;
        count=0;
    }
    Linklist(Node NewHead) {
        Head = NewHead;
    }
    void add(int data) {
        Node Temp = new Node(data);
        Node current = Head;
        while(current.GetNext()!=null)
        current.SetNext(Temp);
        count++;  
    }
    public int get(int index) {
        
        if(index <=0){
            return -1;
        }
        Node current = Head;
        for(int i=1;i<index ; i++)
            current = current.GetNext();
        return current.GetData();    
    }
    public int Size() {
        return count;
    }
    public boolean IsEmpty() {
        return Head==null;
    }
    public void Remove() {
         Node current =Head;
         while(current.GetNext().GetNext()!=null) {
             current = current.GetNext();
         }
         current.SetNext(null);
         count--;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Linklist Linkl = new Linklist();
        Linkl.add(23); 
    }
   
    
}
