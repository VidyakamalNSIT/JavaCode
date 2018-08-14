
package pkginterface;

import java.util.Random;


public class Interface {

   Charcter SummonCharcter(){
      Random rnd =new Random();
      if(Math.abs(rnd.nextInt())%2 == 0)
          return new Enemy();
      else 
          return new Hero();
   }
    public static void main(String[] args) {
        Interface in = new Interface();
        // TODO code application logic here
        Enemy en = new Enemy();
        Hero hr = new Hero();
        en.attack();
        hr.attack();
        en.heal();
        hr.heal();
        System.out.println("Enenmy Weapon :"+en.getweapon());
        System.out.println("Hero Weapon :"+hr.getweapon());
        Charcter spy = in.SummonCharcter();
        spy.attack();
        spy.heal();
    }
    
}
