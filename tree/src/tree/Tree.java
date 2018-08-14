/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;
import java.io.*;
import java.util.Scanner;

public class Tree {

    void addLeft(int data) {
        btNode temp = root;
        while(temp!=null){
            temp=temp.left;
        }
    }

    void addRight(int data) {}
    static class btNode{
        int data;        
        btNode left,right;
        btNode(int data){
            this.data = data;
            left = null;
            right = null;
            
        }
    }
    static btNode root;
    void preOrder(btNode root){
        if(root!=null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    
    }
    void inOrder(btNode root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

    }
    void postOrder(btNode root){
        if(root!= null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int sum =0;
        int n = sc.nextInt();
        int a= sc.nextInt();
        int b= sc.nextInt();
        int a_arr[] = new int[n];
        int b_arr[] = new int[n];
        int result[] = new int[n];
        for(int i=0; i<n; i++){
            a_arr[i]= sc.nextInt();
        }
        for(int i=0; i<n; i++){
            b_arr[i]= sc.nextInt();
        }
        for(int i=0; i<n; i++){
            result[i]= Math.max(a_arr[i], b_arr[i]);
            sum+=result[i];
        }
        System.out.println(sum);
        }
//        Tree tree = new Tree();
//        int t = sc.nextInt();
//        while(t-->0){
//            String ans ="y";
//            root = new btNode(sc.nextInt());
//            while(ans.equals("y")){
//                System.out.print("For Left node:\"L\" For Right: \"R\"");
//                String nodeType = sc.nextLine();
//                int data = sc.nextInt();
//                if(nodeType.equals("L"))
//                    tree.addLeft(data);
//                else
//                    tree.addRight(data);
//            }
//        }
//        tree.preOrder(root);
//        tree.postOrder(root);
//        tree.inOrder(root);
        
    }
    
}
