package visao;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
 
public class FullAdderDesenho extends GateDesenho{
	
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        int x = 160;
        int y = 80;
		g.drawLine(45+x, 50+y, 90+x, 50+y);
		g.drawLine(45+x, 90+y, 90+x, 90+y);
		g.drawLine(45+x, 130+y, 90+x, 130+y);
		g.drawLine(90+x,30+y,90+x,150+y);
		g.drawLine(90+x, 30+y, 180+x, 30+y);
		g.drawLine(90+x, 150+y, 180+x, 150+y);
		g.drawLine(180+x, 30+y, 180+x,150+y);
		g.drawLine(180+x, 60+y, 225+x, 60+y);
		g.drawLine(180+x, 120+y, 225+x, 120+y);
    }
}