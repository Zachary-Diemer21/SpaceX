package game;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class SpaceXDriver extends Applet {
	
	/**
	 * Overriding the specific functions init, paint, and update from Applet Class.
	 * We are overriding init to get our game started; we are overriding paint to make the applet draw our games graphics;
	 * we are overriding update to prevent the applet window from flickering 
	 */
	
	public void init(){
		resize(500,500); // make sure the applet is the right size
	}
	
	public void paint(Graphics gfx){
		 gfx.setColor(Color.red);
		 gfx.fillOval(0,0,50,50); // draw a red circle
	}
	
	public void update(Graphics gfx){
		 paint(gfx); // call paint without clearing the screen
	} 

}
