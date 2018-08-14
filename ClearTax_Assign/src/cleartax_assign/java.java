package cleartax_assign;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

/* Name of the class has to be "Main" only if the class is public. */

class ClearTax_Assign_2_3
{
 
    public static ArrayList<String> ans = new ArrayList<String>();   
    public static void transform(Map m,Map opt){
    ans.add((String)opt.get(m.get("op")));
    Map temp;
    try{
	temp = (Map)m.get("lhs");
	ans.add(String.valueOf(m.get("rhs")));
	ans.add(")");
	transform(temp,opt);
    }
    catch(Exception e){
	try{
		temp = (Map)m.get("rhs");
		ans.add(String.valueOf(m.get("lhs")));
		ans.add(")");
		transform(temp,opt);
	}
	catch(Exception ex){
		String s = String.valueOf(m.get("lhs"));
		if(s.equals("x")) ans.add(String.valueOf(m.get("rhs")));
		else ans.add(s);
	}
    }
}
	
    public static void main (String[] args) throws java.lang.Exception{
        Object obj = new JSONParser().parse(new FileReader("JSONExample1.json"));
        Map opt = new LinkedHashMap();
        opt.put("multiply"," / ");
        opt.put("divide"," * ");
        opt.put("add"," - ");
        opt.put("subtract"," + ");
        opt.put("equal"," = ");
        // typecasting obj to JSONObject
        JSONObject jo = (JSONObject) obj;
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
        if(s.equals(")")) count++;
        for(int i=0;i<count;i++)
        System.out.print("(");
        for(String s:ans)      	
        System.out.print(s);
    }
}