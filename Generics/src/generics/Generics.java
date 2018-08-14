/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author micro computer
 */
public class Generics <T>{
    //T ob;
    int ob;
    Generics(int a){
         ob = a;
    }
   void print(){
       System.out.print(ob);
   }
    public static void main(String[] args) {
        // TODO code application logic here
        Generics <String> st = new Generics <String>(8);
        st.print();
    }
    
}
