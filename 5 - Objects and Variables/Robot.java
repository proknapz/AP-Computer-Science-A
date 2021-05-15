//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      head(window);
     
      //call other methods
      
      upperBody(window);
      
      lowerBody(window);

           }

   public void head( Graphics window )
   {
           window.setColor(Color.YELLOW);
           window.fillOval(300, 100, 200, 100);
           window.setColor(Color.GREEN);
           window.fillOval(350, 125,  15,  15);
           window.fillOval(425, 125,  15,  15);  
           window.setColor(Color.BLACK);
           window.fillOval(380, 155,  30,  10);     
           window.setColor(Color.RED);
           window.drawArc(350, 140,  89,  50, 180, 180 );
		
				
   }

   public void upperBody( Graphics window )
   {

	        window.setColor(Color.BLUE);
           window.fillRect(350,220,95,50);
           window.setColor(Color.BLACK);
           window.drawLine(350,220,300,190);
           window.drawLine(445,220,495,190);

   }

   public void lowerBody( Graphics window )
   {

		     window.setColor(Color.GRAY);
           window.fillRect(350,280,95,50);
           window.setColor(Color.BLACK);
           window.drawLine(350,330,295,350);
           window.drawLine(445,330,495,350);

   }
}
