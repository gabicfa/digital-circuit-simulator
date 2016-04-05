package main.java.visao;

import java.awt.Color;
import java.awt.Graphics;
 
public class OrGateDesenho extends GateDesenho{
	private static final long serialVersionUID = 1L;

    @Override
    protected void paintComponent(Graphics g) {
        int x = 160;
        int y = 80;
        super.paintComponent(g);
        g.setColor(Color.BLACK);
		g.drawLine(50+x, 50+y, 97+x, 50+y);
		g.drawLine(50+x, 100+y, 97+x, 100+y);
		g.drawLine(195+x, 75+y, 240+x, 75+y);
		g.drawArc(70+x, 25+y, 30, 110, -58, 135);
		g.drawArc(25+x, 25+y, 170, 100, -100, 205);
		g.drawString("Pin1",210,125);
		g.drawString("Pin2",210,175);
		g.drawString("Saida",370,150);
    }
}