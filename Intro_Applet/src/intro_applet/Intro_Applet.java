/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro_applet;

import java.applet.Applet;
import java.awt.Graphics;


public class Intro_Applet extends Applet {

   @Override
   public void paint(Graphics g) {
        g.drawString("A Simple Applet", 20, 20);
    }
    
}
