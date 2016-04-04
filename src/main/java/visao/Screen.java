package visao;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.JCheckBox;
  
public class Screen extends JFrame
{
	//private JCheckBox pin1, pin2, pin3;

    public Screen()
    {
        super("Simulador");
        
        Main comboPanel = new Main();
        //Logica boxPanel = new Logica();
        
        String[] shapeItems = {
            "And", "Or", "Xor", "Nand", "FullAdder","HalfAdder", "Not"
        };
        
        JComboBox shapeBox = new JComboBox(shapeItems);
        JCheckBox pin1  = new JCheckBox("Pin1");
        JCheckBox pin2 = new JCheckBox("Pin2");
        JCheckBox pin3 = new JCheckBox("Pin3");
        JCheckBox pinS = new JCheckBox("Saida");
        JCheckBox pinC = new JCheckBox("Carry");
        
        shapeBox.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent e)
            {
                if(e.getStateChange() == ItemEvent.SELECTED)
                {
                    String item = (String)e.getItem();
                    if(item.equals("And"))
                        comboPanel.makeAnd();
                    if(item.equals("Or"))
                        comboPanel.makeOr();
                    if(item.equals("Xor"))
                        comboPanel.makeXor();
                    if(item.equals("Nand"))
                        comboPanel.makeNand();
                    if(item.equals("FullAdder"))
                        comboPanel.makeFullAdder();
                    if(item.equals("HalfAdder"))
                        comboPanel.makeHalfAdder();
                    if(item.equals("Not"))
                        comboPanel.makeNot();
                }                     
            }
        });

        JPanel panel = new JPanel();
        JLabel jlabel = new JLabel("This is a label");
        panel.add(shapeBox);
        comboPanel.setLayout(null);
        pinS.setBounds(450, 120, 80, 20);
        pinC.setBounds(450, 160, 80, 20);
        pin1.setBounds(100, 110,80,20);
        pin2.setBounds(100, 140,80,20);
        pin3.setBounds(100, 170,80,20);
        comboPanel.add(jlabel);
        comboPanel.add(pinS);
        comboPanel.add(pinC);
        comboPanel.add(pin1);
        comboPanel.add(pin2);
        comboPanel.add(pin3);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().add(comboPanel, "Center");
        getContentPane().add(panel, "South");
        setSize(600,400);
        setLocation(300,150);
        setVisible(true);
    }
    
}