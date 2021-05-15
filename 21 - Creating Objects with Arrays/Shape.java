//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

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
	private int xSpeed;
	private int ySpeed;

   /*
    *The constructor is used to initialize all instance variables.
    *The constructor makes the object.
    */
   public Shape(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
		xPos = x;
		//finish this constructor
		yPos = y;
		width = wid;
		height = ht;
		color = col;
		xSpeed = xSpd;
		ySpeed = ySpd;
   }

      /*
    *The draw method draws the shape on the screen.
    */
   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(xPos, yPos, width, height);
      window.setColor(Color.WHITE);
      window.fillRect(xPos+10, yPos+10, width-20, height-20);
      window.setColor(Color.GREEN);
      window.fillOval(xPos+15, yPos+15, width-30, height-30);
      window.setColor(Color.RED);
      window.drawLine(xPos-10,yPos-10,xPos,yPos);
      window.drawLine(xPos+width,yPos,xPos+width+10,yPos-10);
      window.setColor(Color.ORANGE);
      int hm = width/5;
      window.fillRect(xPos+hm,yPos+height,6,14);
      window.fillRect(xPos+hm*3,yPos+height,6,14);      
   }

   /*
    *This draw method will be used to erase the shape.
    */
   public void draw(Graphics window, Color col)
   {
      window.setColor(col);
      window.fillRect(xPos, yPos, width, height);
   }



   //add in set and get methods for xPos, yPos, xSpeed, and ySpeed
   public int getXSpeed()
   {
   return xSpeed;
   }
   public void setXSpeed(int xSpd)
   {
   xSpeed = xSpd;
   }
   public int getX()
   {
   return xPos;
   }
   public void setX(int x)
   {
   xPos = x;
   }
    public int getYSpeed()
   {
   return ySpeed;
   }
   public void setYSpeed(int ySpd)
   {
   ySpeed = ySpd;
   }
   public int getY()
   {
   return yPos;
   }
   public void setY(int y)
   {
   yPos = y;
   }
   
   


   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color+" "+xSpeed+" "+ySpeed;
   }
      public void moveAndDraw(Graphics window)
   {
   xPos += xSpeed;
    yPos += ySpeed;
    
    if (xPos <=0 ) {
        xSpeed *= -1;
         }
    else if ( xPos >= 800 - width) {
            xSpeed  *= -1;
    if ( xPos >= 800 - width) {
        
    }
    if ( yPos <= 0 ) {
        ySpeed *= -1;
        
    }
     draw ( window );
   }
   }
}
