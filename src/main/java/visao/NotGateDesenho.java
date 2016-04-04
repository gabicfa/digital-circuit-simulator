package visao;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
 
public class NotGateDesenho extends GateDesenho{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
		g.drawLine(100, 40, 160, 70);
		g.drawLine(100, 100, 160, 70);
		g.drawLine(100, 40, 100, 100);
		g.drawLine(50, 70, 100, 70);
		g.drawLine(170, 70, 210, 70);
		g.drawArc(160, 65, 10, 10, -20, 360);
    }
}