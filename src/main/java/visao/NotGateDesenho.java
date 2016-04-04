package main.java.visao;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
 
public class NotGateDesenho extends GateDesenho{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
		g.drawLine(290, 140, 350, 170);
		g.drawLine(290, 200, 350, 170);
		g.drawLine(290, 140, 290, 200);
		g.drawLine(240, 170, 290, 170);
		g.drawLine(360, 170, 400, 170);
		g.drawArc(350, 165, 10, 10, -20, 360);
		g.drawString("Pin1",240,168);
		g.drawString("Saida",370,168);
    }
}