/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutput;

import java.io.*;
import java.io.IOException;

public class InputOutput {


    public static void main(String[] args)  throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
//char c = br.read();
        String c;
        do{
            c=br.readLine();
            System.out.print(c);
            
        }while(c!="q");
    }
    
}
