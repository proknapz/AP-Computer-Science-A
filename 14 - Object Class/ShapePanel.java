//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel extends JPanel
{
	public ShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);


		//instantiate a Shape
		//tell your shape to draw
      Shape a = new Shape(69, 69, 169, 69, Color.RED);
      a.draw(window);

		//instantiate a Shape
		//tell your shape to draw
      Shape b = new Shape(169, 69, 69, 169, Color.YELLOW);
      b.draws(window);
      b.circle(window);
      
		//instantiate a Shape
		//tell your shape to draw
      
      Shape c = new Shape(300, 350, 150, 169, Color.BLUE);
      c.draw(window);
      c.line(window);
      
      Shape d = new Shape(400, 350, 200, 50, Color.GREEN);
      d.circle(window);
      
      Shape e = new Shape(450, 225, 300, 200, Color.PINK);
      e.draws(window);
      e.circle(window);
      
      Shape f = new Shape(424, 250, 150, 150, Color.ORANGE);
      f.circle(window);
      
      Shape g = new Shape(424, 150, 300, 25, Color.BLACK);
      g.draws(window);
      g.circle(window);

	}
}