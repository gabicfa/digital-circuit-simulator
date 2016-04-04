package visao; 

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JCheckBox;

public class Visao {
	public static void main(String s[]) {
		JFrame frame = new JFrame ("Simulador de Circuito Digital");
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());;
		JLabel label = new JLabel("Selecione a porta lógica que deseja simular");
		
		JButton not = new JButton();
		not.setText("Not");
		not.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog notWindow = new JDialog(frame, "Not", true);
				notWindow.setLocationRelativeTo(frame);;
				notWindow.setVisible(true);
				notWindow.setSize(500,300); //bug não funciona
				notWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				notWindow.setVisible(true);
				private JCheckBox notA, notB;
				notA = new JCheckBox("A");
				notB = new JCheckBox("B");
				add(notA);
				add(notB);
				setVisible(true);
				
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
				    }
				}
				
			}
		});
		
		JButton and = new JButton();
		and.setText("And");
		and.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog andWindow = new JDialog(frame, "And", true);
				andWindow.setLocationRelativeTo(frame);;
				andWindow.setVisible(true);
				andWindow.setSize(500,300); //bug não funciona
				andWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				andWindow.setVisible(true);
				private JCheckBox andA, andB;
				andA = new JCheckBox("A");
				andB = new JCheckBox("B");
				add(andA);
				add(andB);
				setVisible(true);
				
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
				    }
				}
			}
		});
		
		JButton or = new JButton();
		or.setText("Or");
		or.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog orWindow = new JDialog(frame, "Or", true);
				orWindow.setLocationRelativeTo(frame);;
				orWindow.setVisible(true);
				orWindow.setSize(500,300); //bug não funciona
				orWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				orWindow.setVisible(true);
				private JCheckBox orA, orB;
				orA = new JCheckBox("A");
				orB = new JCheckBox("B");
				add(orA);
				add(orB);
				setVisible(true);
				
				public class OrGateDesenho extends GateDesenho{
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
			    }
			}
			}
		});
		
		JButton xor = new JButton();
		xor.setText("Xor");
		xor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog xorWindow = new JDialog(frame, "Xor", true);
				xorWindow.setLocationRelativeTo(frame);;
				xorWindow.setVisible(true);
				xorWindow.setSize(500,300); //bug não funciona
				xorWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				xorWindow.setVisible(true);
				private JCheckBox xorA, xorB;
				xorA = new JCheckBox("A");
				xorB = new JCheckBox("B");
				add(xorA);
				add(xorB);
				setVisible(true);
				public class XorGateDesenho extends GateDesenho{
					
				    @Override
				    protected void paintComponent(Graphics g) {
				        super.paintComponent(g);
				        int x = 160;
				        int y = 80;
				        g.setColor(Color.BLACK);
						g.drawLine(50+x, 50+y, 97+x, 50+y);
						g.drawLine(50+x, 100+y, 97+x, 100+y);
						g.drawLine(195+x, 75+y, 240+x, 75+y);
						g.drawArc(70+x, 25+y, 30, 110, -58, 135);
						g.drawArc(65+x, 25+y, 25, 110, -58, 135);
						g.drawArc(25+x, 25+y, 170, 100, -100, 205);    }
				}
				
			}
		});
		
		JButton nand = new JButton();
		nand.setText("Nand");
		nand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog nandWindow = new JDialog(frame, "Nand", true);
				nandWindow.setLocationRelativeTo(frame);;
				nandWindow.setVisible(true);
				nandWindow.setSize(500,300); //bug não funciona
				nandWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				nandWindow.setVisible(true);
				private JCheckBox nandA, nandB;
				nandA = new JCheckBox("A");
				nandB = new JCheckBox("B");
				add(nandA);
				add(nandB);
				setVisible(true);
				
				public class NandGateDesenho extends GateDesenho{
					
				    public void paintComponent(Graphics g) {
				        super.paintComponent(g);
				        g.setColor(Color.BLACK);
				        int x = 160;
				        int y = 80;
						g.drawLine(50+x, 50+y, 100+x, 50+y);
						g.drawLine(50+x, 100+y, 100+x, 100+y);
						g.drawLine(100+x, 20+y, 100+x, 120+y);
						g.drawLine(180+x, 70+y, 220+x, 70+y);
						g.drawArc(160+x, 60+y, 20, 20, -30, 360);
						g.drawArc(60+x, 20+y, 100, 100, -100, 200);
				    }
				}
				
			}
		});
		
		JButton fullAdder = new JButton();
		fullAdder.setText("FullAdder");
		fullAdder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog fullAdderWindow = new JDialog(frame, "FullAdder", true);
				fullAdderWindow.setLocationRelativeTo(frame);;
				fullAdderWindow.setVisible(true);
				fullAdderWindow.setSize(500,300); //bug não funciona
				fullAdderWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fullAdderWindow.setVisible(true);
				private JCheckBox fullAdderA, fullAdderB, fullAdderC;
				fullAdderA = new JCheckBox("A");
				fullAdderB = new JCheckBox("B");
				fullAdderC = new JCheckBox("C");
				add(fullAdderA);
				add(fullAdderB);
				add(fullAdderC);
				setVisible(true);
				
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
				
			}
		});
		
		JButton halfAdder = new JButton();
		xor.setText("HalfAdder");
		xor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog halfAdderWindow = new JDialog(frame, "HalfAdder", true);
				halfAdderWindow.setLocationRelativeTo(frame);;
				halfAdderWindow.setVisible(true);
				halfAdderWindow.setSize(500,300); //bug não funciona
				halfAdderWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				halfAdderWindow.setVisible(true);
				private JCheckBox halfAdderA, halfAdderB;
				halfAdderA = new JCheckBox("A");
				halfAdderB = new JCheckBox("B");
				add(halfAdderA);
				add(halfAdderB);
				setVisible(True);
				
				public class HalfAdderDesenho extends GateDesenho{
					
				    @Override
				    protected void paintComponent(Graphics g) {
				        int x = 160;
				        int y = 80;
				        super.paintComponent(g);
				        g.setColor(Color.BLACK);
						g.drawLine(45+x, 60+y, 90+x, 60+y);
						g.drawLine(45+x, 120+y, 90+x, 120+y);
						g.drawLine(90+x,30+y,90+x,150+y);
						g.drawLine(90+x, 30+y, 180+x, 30+y);
						g.drawLine(90+x, 150+y, 180+x, 150+y);
						g.drawLine(180+x, 30+y, 180+x,150+y);
						g.drawLine(180+x, 60+y, 225+x, 60+y);
						g.drawLine(180+x, 120+y, 225+x, 120+y);
				    }
				}
				
			}
		});
		
		
		panel.add(label);
		panel.add(not);
		panel.add(and);
		panel.add(or);
		panel.add(xor);
		panel.add(nand);
		panel.add(fullAdder);
		panel.add(halfAdder);
		frame.add(panel);
		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	
	}
	
	
}