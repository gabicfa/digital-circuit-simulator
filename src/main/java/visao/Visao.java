package visao; 

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
		});
		JButton and = new JButton();
		and.setText("And");
		JButton or = new JButton();
		or.setText("Or");
		JButton xor = new JButton();
		xor.setText("Xor");
		panel.add(label);
		panel.add(not);
		panel.add(and);
		panel.add(or);
		panel.add(xor);
		frame.add(panel);
		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	
	}
	
	
}
