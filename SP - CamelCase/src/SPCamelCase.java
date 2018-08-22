
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class SPCamelCase {
    public static void main (String[] args)
	 {
	 Scanner Sc = new Scanner(System.in);
	 int t = Sc.nextInt();
	 while(t>0){
            int n = Sc.nextInt();
            String[] arr = new String[n];
            for(int i=0; i<n ; i++){
                arr[i]= Sc.next();
            }
            String q = Sc.next();
            Map<String,String> MP = new HashMap<>();
            for(String i: arr){
                if(i.replaceAll("^*[a-z]","").length()==1)
                    MP.put(i, i);
                else
                    MP.put(i.replaceAll("^*[a-z]",""), i);
            }
            for(int i=0; i<arr.length; i++){
                if(arr[i].replaceAll("^*[a-z]","").length()>1)
                    arr[i] = arr[i].replaceAll("^*[a-z]","");
            }
            boolean flag =true;
            for(String i: arr){
                if(i.startsWith(q)){
                    System.out.println(MP.get(i));
                    flag = false;                    
                }
            }
            if(flag){
               System.out.println("No match found");
            }
	     t--;
	    }
	 }
}