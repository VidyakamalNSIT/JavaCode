
package remove.friends;

import java.util.Scanner;

class ChristieFriend{
    int popular;
    ChristieFriend nextFriend;
    ChristieFriend(int data){
       popular = data;
    }
}
class RemoveFriends {
    static ChristieFriend Start;
    void addFriend(int popular){
        if(Start==null)
            Start = new ChristieFriend(popular);
        else{
        ChristieFriend Temp = Start;
        while(Temp.nextFriend != null){
            Temp = Temp.nextFriend;
        }
        Temp.nextFriend = new ChristieFriend(popular);
        }
    }
    void unFriend(){
            boolean flag = false;
            ChristieFriend p= Start;
            if(p.popular<p.nextFriend.popular){
                    Start = p.nextFriend;
                    return;
                }
            while(p.nextFriend.nextFriend != null){
                
                if(p.nextFriend.popular<p.nextFriend.nextFriend.popular){
                    p.nextFriend = p.nextFriend.nextFriend;
                    return;  
                }
                p=p.nextFriend;
            }
            if(flag==false){
                while(p.nextFriend.nextFriend!= null){
                    p=p.nextFriend;
                }
                p.nextFriend=null;
            }
    }
    void print(){
        ChristieFriend current=Start;
        while(current != null){
            System.out.print(current.popular+" ");
            current = current.nextFriend;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        int t = Sc.nextInt();
        while(t-->0){
            int n = Sc.nextInt();
            int k = Sc.nextInt();
            RemoveFriends RF = new RemoveFriends();
            Start = new ChristieFriend(Sc.nextInt());
            ChristieFriend NewNode = Start;
            while(n-->1){
                NewNode.nextFriend = new ChristieFriend(Sc.nextInt());
                NewNode = NewNode.nextFriend;
            }
            while(k-->0){
                RF.unFriend();
            }
           RF.print();
        }
    }
    
}
