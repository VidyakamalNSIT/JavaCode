
package cleartax;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*; 
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
/* Name of the class has to be "Main" only if the class is public. */
public class JSon_create {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws java.lang.Exception {
        
        // Java program for write JSON to a file
        
        JSONObject jo = new JSONObject();
	jo.put("op", "equal");        
        jo.put("rhs", 20);         
        Map m = new LinkedHashMap(3);
        m.put("op","add");         
        m.put("lhs",1);         
        Map m1 = new LinkedHashMap(3);
        m1.put("op","multiply");
        m1.put("lhs","x");
        m1.put("rhs",6);
        m.put("rhs",m1);
        jo.put("lhs",m);        
        PrintWriter pw = new PrintWriter("JSONExample1.json");
        pw.write(jo.toJSONString());
        pw.flush();
        pw.close();
    }
}
