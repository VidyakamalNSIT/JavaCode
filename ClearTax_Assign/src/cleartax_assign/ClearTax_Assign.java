package cleartax_assign;

/* package codechef; // don't place package name! */

import java.util.*;

import java.io.FileReader;
import java.util.Map;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

/* Name of the class has to be "Main" only if the class is public. */

class ClearTax_Assign
{
    
public static void parse(Object obj, Map opt, boolean c){
        
    
try{  
Map m = ( Map)obj;
if(c) System.out.print("(");
parse(m.get("lhs"),opt,true);     
System.out.print(opt.get(m.get("op")));
parse(m.get("rhs"),opt,true);
if(c) System.out.print(")");
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
	
public static void main (String[] args) throws java.lang.Exception
	{
		
Object obj = new JSONParser().parse(new FileReader("JSONExample.json"));
        
Map opt = new LinkedHashMap();
        
opt.put("multiply"," * ");
        
opt.put("divide"," / ");
        
opt.put("add"," + ");
        
opt.put("subtract"," - ");
        
opt.put("equal"," = ");
        
// typecasting obj to JSONObject
        
JSONObject jo = (JSONObject) obj;
        
  
parse(jo.get("lhs"),opt,false);
System.out.print(opt.get((String) jo.get("op")));
parse(jo.get("rhs"),opt,false);
        	
}
}
