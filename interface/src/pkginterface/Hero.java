
package pkginterface;


public class Hero implements Charcter{
    String weapon = "The force";

    public String getweapon(){
        return weapon;
    }
    public void attack(){
     System.out.println("The hero attack enemy");   
    }
    
    public void heal(){
        System.out.println("The hero heal you");
    }
}
