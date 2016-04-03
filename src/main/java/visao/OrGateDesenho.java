package visao;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
 
public class OrGateDesenho extends JPanel{
	
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
		g.drawLine(50, 50, 97, 50);
		g.drawLine(50, 100, 97, 100);
		g.drawLine(195, 75, 240, 75);
		g.drawArc(70, 25, 30, 110, -58, 135);
		g.drawArc(25, 25, 170, 100, -100, 205);
    }
}