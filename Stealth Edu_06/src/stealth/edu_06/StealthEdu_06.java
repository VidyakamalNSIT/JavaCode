
package stealth.edu_06;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Vidyakamal
 */
public class StealthEdu_06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str =str.replaceAll(" ", "");
        str = str.toLowerCase();
        HashMap<Integer,Character> strMap = new HashMap<>();
        //loop to store unique in map
        int k=1;
        for(int i=0; i<str.length(); i++){
            if(!strMap.containsValue(str.charAt(i))){
                strMap.put(k, str.charAt(i));
                k++;
            }
        }
        //Pring All unique Character
        System.out.print("Unique Character's :");
        for(int i=1; i<=strMap.size(); i++){
            System.out.print(" "+strMap.get(i));
        }
        System.out.println("");
    }
    
}
