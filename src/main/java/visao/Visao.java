package main.java.visao; 

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
			
				
			
				}
				
			}
		);
		
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
	
