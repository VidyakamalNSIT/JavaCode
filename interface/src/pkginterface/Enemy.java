
package pkginterface;


public class Enemy implements Charcter {
    String weapon = "lightsaver"; 
    
    @Override
    public String getweapon(){
        return weapon;
    }
    @Override
    public void attack(){
        System.out.println("Enemy Attack you...!!");
    }
    
    public void heal(){
        System.out.println("Enemy heal itself.....!!");
    }
    public void weapnchoice(){
        System.out.println("weapon drow out....!!"); 
    }
}
