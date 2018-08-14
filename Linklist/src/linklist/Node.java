
package linklist;

public class Node {
    Node next;
    int Data;
    Node(int data) {
        Data  =  data;
        next = null;
    }
    Node(int data, Node NewNode ) {
        Data = data;
        next =NewNode;
    }
    int GetData() {
        return Data;
    }
    Node GetNext() {
        return next;
    }
    void SetData(int NewData) {
        Data =   NewData;
    }
    void SetNext(Node NewNode) {
        next = NewNode;
    }
}
