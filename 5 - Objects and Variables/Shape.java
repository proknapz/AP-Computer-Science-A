//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;
   

   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
      yPos = y;
      width = wid;
      height = ht;
      color = col;
		//finish this constructor
   }


   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(xPos, yPos, width, height);
   }

   public void draws(Graphics window)
   {
      window.setColor(color);
      window.drawRect(xPos, yPos, width, height);
   }

   public void circle(Graphics window)
   {
      window.setColor(color);
      window.fillOval(xPos, yPos, width, height);
   }


   public void line(Graphics window)
   {
      window.setColor(color);
      window.fillOval(xPos, yPos, width, height);
   }
   
   
   
   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}