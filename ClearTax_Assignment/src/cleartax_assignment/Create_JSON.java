    package cleartax_assignment;


import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.simple.JSONObject;
public class Create_JSON {

    public static void main(String[] args)throws java.lang.Exception {
        
        JSONObject jo = new JSONObject();
	jo.put("op", "equal");        
        jo.put("rhs", 21);         
        Map m = new LinkedHashMap(3);
        m.put("op","add");         
        m.put("lhs",1);         
        Map m1 = new LinkedHashMap(3);
        m1.put("op","multiply");
        m1.put("lhs","x");
        m1.put("rhs",10);
        m.put("rhs",m1);
        jo.put("lhs",m);        
        PrintWriter pw = new PrintWriter("JSONExample.json");
        pw.write(jo.toJSONString());
        pw.flush();
        pw.close();
    }
}
