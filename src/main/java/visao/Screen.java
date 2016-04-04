package visao;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.Random;
import javax.swing.*;
  
public class Screen extends JFrame
{
    public Screen()
    {
        super("Simulador");
        
        final Main comboPanel = new Main();
        
        String[] shapeItems = {
            "And", "Or", "Xor", "Nand", "FullAdder","HalfAdder", "Not"
        };
        
        JComboBox shapeBox = new JComboBox(shapeItems);
        
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
        
        JPanel southPanel = new JPanel();
        southPanel.add(shapeBox);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().add(comboPanel, "Center");
        getContentPane().add(southPanel, "South");
        setSize(600,400);
        setLocation(300,150);
        setVisible(true);
    }
    
}