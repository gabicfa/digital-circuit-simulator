package visao;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
 
public class NandGateDesenho extends JPanel{
	
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
		g.drawLine(50, 50, 100, 50);
		g.drawLine(50, 100, 100, 100);
		g.drawLine(100, 20, 100, 120);
		g.drawLine(180, 70, 220, 70);
		g.drawArc(160, 60, 20, 20, -30, 360);
		g.drawArc(60, 20, 100, 100, -100, 200);
    }
}

