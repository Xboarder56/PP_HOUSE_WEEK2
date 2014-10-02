/**
 * House.java
 * @author Garrett J. Beasley
 * 09/29/2014
 * Draws a House Picture
 */

//Imports for the program.
import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.Color;
import java.util.Random;

public class House extends GraphicsProgram 
{
	public void run()
	{
		
		//Variables for the project.
		/**Values for the rect start points*/
		int startX = 0;
		int startY = 0;
		/**Values for the window Size*/
		int windowX = 400;
		int windowY = 300;
		
		//Sets the size of the window for the program
		 setSize(windowX, windowY);
		 
		GRect sky = new GRect(400, 200);
		sky.setLocation(startX+0, startY+0);
		sky.setFillColor(Color.CYAN);
		sky.setFilled(true);
		add(sky);
		 
		GRect rec = new GRect(200, 100);
		rec.setLocation(startX+100, startY+100);
		rec.setFillColor(Color.LIGHT_GRAY);
		rec.setFilled(true);
		add(rec);
		
		GRect window1 = new GRect(40, 40);
		window1.setLocation(startX+120, startY+120);
		window1.setFillColor(Color.CYAN);
		window1.setFilled(true);
		add(window1);
		
		GRect window2 = new GRect(40, 40);
		window2.setLocation(startX+240, startY+120);
		window2.setFillColor(Color.CYAN);
		window2.setFilled(true);
		add(window2);
		
		GRect door = new GRect(40, 60);
		door.setLocation(startX+180, startY+140);
		door.setFillColor(Color.BLUE);
		door.setFilled(true);
		add(door);
		
		GOval doorHandle = new GOval(10, 10);
		doorHandle.setLocation(startX+210, startY+170);
		doorHandle.setFillColor(Color.WHITE);
		doorHandle.setFilled(true);
		add(doorHandle);
		
		GPolygon roof = new GPolygon();
		roof.setLocation(startX+200, startY+50);
		roof.addVertex(0,0);
		roof.addVertex(100,50);
		roof.addEdge(-200, 0);
		roof.setFilled(true);
		roof.setFillColor(Color.LIGHT_GRAY);
		add(roof);
		
		GRect grass = new GRect(400, 100);
		grass.setLocation(startX+0, startY+200);
		grass.setFillColor(Color.GREEN);
		grass.setFilled(true);
		add(grass);
		
		GRect treeTrunk = new GRect(20, 60);
		treeTrunk.setLocation(startX+340, startY+140);
		treeTrunk.setFillColor(Color.LIGHT_GRAY);
		treeTrunk.setFilled(true);
		add(treeTrunk);
		
		GOval treeLeave1 = new GOval(30, 30);
		treeLeave1.setLocation(startX+320, startY+120);
		treeLeave1.setColor(Color.GREEN);
		treeLeave1.setFillColor(Color.GREEN);
		treeLeave1.setFilled(true);
		add(treeLeave1);
		
		GOval treeLeave2 = new GOval(30, 30);
		treeLeave2.setLocation(startX+350, startY+120);
		treeLeave2.setColor(Color.GREEN);
		treeLeave2.setFillColor(Color.GREEN);
		treeLeave2.setFilled(true);
		add(treeLeave2);
		
		GOval treeLeave3 = new GOval(30, 30);
		treeLeave3.setLocation(startX+335, startY+100);
		treeLeave3.setColor(Color.GREEN);
		treeLeave3.setFillColor(Color.GREEN);
		treeLeave3.setFilled(true);
		add(treeLeave3);
		
		GOval treeLeave4 = new GOval(30, 30);
		treeLeave4.setColor(Color.GREEN);
		treeLeave4.setLocation(startX+335, startY+120);
		treeLeave4.setFillColor(Color.GREEN);
		treeLeave4.setFilled(true);
		add(treeLeave4);
		
		
		
		
	}

}
