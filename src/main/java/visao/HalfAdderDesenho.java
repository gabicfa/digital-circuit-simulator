package visao;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
 
public class HalfAdderDesenho extends JPanel{
	
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
		g.drawLine(45, 60, 90, 60);
		g.drawLine(45, 120, 90, 120);
		g.drawLine(90,30,90,150);
		g.drawLine(90, 30, 180, 30);
		g.drawLine(90, 150, 180, 150);
		g.drawLine(180, 30, 180,150);
		g.drawLine(180, 60, 225, 60);
		g.drawLine(180, 120, 225, 120);
    }
}