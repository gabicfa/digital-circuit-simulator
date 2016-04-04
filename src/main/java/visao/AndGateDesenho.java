package visao;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
 
public class AndGateDesenho extends GateDesenho{ 

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        int x = 160;
        int y = 80;
		g.drawLine(50+x, 50+y, 100+x, 50+y);
		g.drawLine(50+x, 100+y, 100+x, 100+y);
		g.drawLine(100+x, 20+y, 100+x, 120+y);
		g.drawLine(160+x, 70+y, 220+x, 70+y);
		g.drawArc(60+x, 20+y, 100, 100, -100, 200);
		g.drawString("Pin1",210,125);
		g.drawString("Pin2",210,175);
		g.drawString("Saida",350,145);
    }
}
