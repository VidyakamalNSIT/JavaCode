/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cleartax_assignment;
import java.util.*;

import java.io.FileReader;
import java.util.Map;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
public class ClearTax_Assignment {
    
    public static ArrayList<String> ans = new ArrayList<String>();
    public static void transform(Map m,Map opt){
        ans.add((String)opt.get(m.get("op")));
        Map temp;
        try{
            temp = (Map)m.get("lhs");
            ans.add(String.valueOf(m.get("rhs")));
            ans.add(" )");
            transform(temp,opt);
        }
        catch(Exception e){
            try{
		temp = (Map)m.get("rhs");
		ans.add(String.valueOf(m.get("lhs")));
		ans.add(" )");
		transform(temp,opt);
            }
            catch(Exception ex){
		String s = String.valueOf(m.get("lhs"));
		if(s.equals("x")) ans.add(String.valueOf(m.get("rhs")));
		else ans.add(s);
            }
        }
    }
    public static void parse(Object obj, Map opt, boolean c){
        try{  
            Map m = ( Map)obj;
            if(c) System.out.print("( ");
            parse(m.get("lhs"),opt,true);     
            System.out.print(opt.get(m.get("op")));
            parse(m.get("rhs"),opt,true);
            if(c) System.out.print(" )");
        }
        catch(Exception ex){
            try{
                String rhs = ( String) obj;
                System.out.print(rhs);}
                catch(Exception e){
                Long rhs = ( Long) obj;
                System.out.print(rhs);
            }
        }
    }
        public static int evaluate(String expn){
            char[] Temp = expn.toCharArray();
            Stack<Integer> val = new Stack<Integer>();
            Stack<Character> op = new Stack<Character>();
            for (int i = 0; i < Temp.length; i++){
                if (Temp[i] == ' '){
                continue;
                }
                if (Temp[i] >= '0' && Temp[i] <= '9'){
                    StringBuffer sbuf = new StringBuffer();
                    while (i < Temp.length && Temp[i] >= '0' && Temp[i] <= '9')
                    sbuf.append(Temp[i++]);
                    val.push(Integer.parseInt(sbuf.toString()));
                }
                else if (Temp[i] == '(')
                op.push(Temp[i]);
                else if (Temp[i] == ')'){
                    while (op.peek() != '(')
                    val.push(applyOp(op.pop(), val.pop(), val.pop()));
                    op.pop();
                }
                else if (Temp[i] == '+' || Temp[i] == '-' ||
                     Temp[i] == '*' || Temp[i] == '/'){               
                    while (!op.empty() && hasPrecedence(Temp[i], op.peek()))
                    val.push(applyOp(op.pop(), val.pop(), val.pop()));
                    op.push(Temp[i]);
                }
        }

            while (!op.empty())
            val.push(applyOp(op.pop(), val.pop(), val.pop()));
        return val.pop();
    }
    public static boolean hasPrecedence(char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }
    public static int applyOp(char op, int b, int a)
    {
        switch (op)
        {
        case '+':
            return a + b;
        case '-':
            return a - b;
        case '*':
            return a * b;
        case '/':
            if (b == 0)
                throw new
                UnsupportedOperationException("Cannot divide by zero");
            return a / b;
        }
        return 0;
    }
	
    public static void main (String[] args) throws java.lang.Exception{
		
        Object obj = new JSONParser().parse(new FileReader("JSONExample.json"));
        Map opt = new LinkedHashMap();
        opt.put("multiply"," * ");
        opt.put("divide"," / ");
        opt.put("add"," + ");
        opt.put("subtract"," - ");
        opt.put("equal"," = ");    
        
    // Assignment 1
        
        JSONObject jo = (JSONObject) obj;
        System.out.println("-----------------Ans of Assignment 1---------------");
        parse(jo.get("lhs"),opt,false);
        System.out.print(opt.get((String) jo.get("op")));
        parse(jo.get("rhs"),opt,false);
        
    // Assignment 2  
        System.out.println("\n");
        System.out.println("-----------------Ans of Assignment 2---------------");
        System.out.print("x = ");
        ans.add(String.valueOf(jo.get("rhs"))); 
        try{
            Map m = (Map)jo.get("lhs");      
            transform(m,opt);
        }
        catch(Exception e){
            ans.add(String.valueOf(jo.get("rhs")));
        } 
        int count=0;
        for(String s:ans)      	
        if(s.equals(" )")) count++;
        for(int i=0;i<count;i++)
        System.out.print("( ");
        for(String s:ans) 	
            System.out.print(s);
        System.out.println();
            
// Assignment 2  
         String str="(";
        for(String s:ans) {     	
        str += s;
        }
        System.out.println();
        System.out.println("-----------------Ans Of Assignment 3---------------");
        System.out.println(ClearTax_Assignment.evaluate(str));
    }   
    
}
