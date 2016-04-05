package main.java.visao;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JCheckBox;
import main.java.modelo.*;

public class Screen extends JFrame
{

	private static final long serialVersionUID = 1L;
	
	private static String item;
    private InputPin pinA;
    private InputPin pinB;
    private InputPin pinD;
    private InputPin pinL1;
    private InputPin pinL2;
    private Lamp lamp1;
    private Lamp lamp2;
    
	AndGate and = new AndGate();
	OrGate or = new OrGate();
    XorGate xor = new XorGate();
    NandGate nand = new NandGate();
	FullAdder fullAdder = new FullAdder();
	HalfAdder halfAdder = new HalfAdder();
    NotGate not = new NotGate();
	
    public Screen()
    {
        super("Simulador");
        
        Main comboPanel = new Main();       
        String[] gateItems = {
            "And", "Or", "Xor", "Nand", "FullAdder","HalfAdder", "Not"
        };
        
        JComboBox<String> gateBox = new JComboBox<>(gateItems);
        JCheckBox pin1  = new JCheckBox("Pin1");
        JCheckBox pin2 = new JCheckBox("Pin2");
        JCheckBox pin3 = new JCheckBox("Pin3");
        JCheckBox pinS = new JCheckBox("Saida");
        JCheckBox pinC = new JCheckBox("Carry");
        
		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		Switch switch3 = new Switch();
		
		lamp1 = new Lamp();
		lamp2 = new Lamp();
		pinL1 = new InputPin();
		pinL2 = new InputPin();
		pinL1.setIndex(0);
		pinL2.setIndex(1);
		lamp1.setInputPin(pinL1);
		lamp2.setInputPin(pinL2);
        
        gateBox.addItemListener(new ItemListener()
        {
			public void itemStateChanged(ItemEvent e)
            {
                if(e.getStateChange() == ItemEvent.SELECTED)
                {
                    item = (String)e.getItem();
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
        panel.add(gateBox);
        comboPanel.setLayout(null);
        
        pinS.setBounds(450, 120, 80, 20);
        pinC.setBounds(450, 160, 80, 20);
        pin1.setBounds(100, 110,80, 20);
        pin2.setBounds(100, 140,80, 20);
        pin3.setBounds(100, 170,80, 20);
        
        pinS.setEnabled(false);
        pinC.setEnabled(false);
        
        switch1.desligarBotao();
        switch2.desligarBotao();
        switch3.desligarBotao();
		             
		pin1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				 pinA = new InputPin();
				 pinB = new InputPin();
				 pinD = new InputPin();
				 pinA.setSource(switch1);
				 pinB.setSource(switch2);
				 pinD.setSource(switch3);
 				 switch1.setBotao(pin1.isSelected());
		                   
 				 if(item.equals("And")){
					pinA.setSource(switch1);
					pinB.setSource(switch2);
					
					and.setPinA(pinA);
					and.setPinB(pinB);
					pinL1.setSource(and);
						
					pinS.setEnabled(true);
					pinS.setSelected(lamp1.getLampValue());
					pinS.setEnabled(false);
				}
		                    
                if(item.equals("Or")){
                	pinA.setSource(switch1);
    				pinB.setSource(switch2);
    				
    				or.setPinA(pinA);
    				or.setPinB(pinB);
    				pinL1.setSource(or);
    				
    				pinS.setEnabled(true);
    				pinS.setSelected(lamp1.getLampValue());
    				pinS.setEnabled(false);
                }
                
                if(item.equals("Xor")){
    				pinA.setSource(switch1);
    				pinB.setSource(switch2);
    				
    				xor.setPinA(pinA);
    				xor.setPinB(pinB);
    				pinL1.setSource(xor);
    				
    				pinS.setEnabled(true);
    				pinS.setSelected(lamp1.getLampValue());
    				pinS.setEnabled(false);
                }
                
                if(item.equals("Nand")){
    				pinA.setSource(switch1);
    				pinB.setSource(switch2);
    				
    				nand.setPinA(pinA);
    				nand.setPinB(pinB);
    				pinL1.setSource(nand);
    				
    				pinS.setEnabled(true);
    				pinS.setSelected(lamp1.getLampValue());
    				pinS.setEnabled(false);
                }
                
                if(item.equals("FullAdder")){

            		pinA.setSource(switch1);
            		pinB.setSource(switch2);
            		pinD.setSource(switch3);
            		
            		fullAdder.setPinA(pinA);
            		fullAdder.setPinB(pinB);
            		fullAdder.setPinC(pinD);
            		
    				pinS.setEnabled(true);
    				pinC.setEnabled(true);
    				pinS.setSelected(fullAdder.getOutputValue(0));
    				pinC.setSelected(fullAdder.getOutputValue(1));
    				pinS.setEnabled(false);
    				pinC.setEnabled(false);
                }
                   
                
                if(item.equals("HalfAdder")){

            		pinA.setSource(switch1);
            		pinB.setSource(switch2);
            		pinD.setSource(switch3);
            		
            		halfAdder.setPinA(pinA);
            		halfAdder.setPinB(pinB);
            		
    				pinS.setEnabled(true);
    				pinC.setEnabled(true);
    				pinS.setSelected(halfAdder.getOutputValue(0));
    				pinC.setSelected(halfAdder.getOutputValue(1));
    				pinS.setEnabled(false);
    				pinC.setEnabled(false);
                }
                
                if(item.equals("Not")){

    				pinA.setSource(switch1);
    				pinB.setSource(switch2);
    				
    				not.setPin(pinA);
    				pinL1.setSource(not);
    				
    				pinS.setEnabled(true);
    				pinS.setSelected(lamp1.getLampValue());
    				pinS.setEnabled(false);
                }
            }                          
		});
		
		pin2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				 pinA = new InputPin();
				 pinB = new InputPin();
				 pinD = new InputPin();
				 pinA.setSource(switch1);
				 pinB.setSource(switch2);
				 pinD.setSource(switch3);
 				 switch2.setBotao(pin2.isSelected());
		                   
 				 if(item.equals("And")){
					pinA.setSource(switch1);
					pinB.setSource(switch2);
					
					and.setPinA(pinA);
					and.setPinB(pinB);
					pinL1.setSource(and);
						
					pinS.setEnabled(true);
					pinS.setSelected(lamp1.getLampValue());
					pinS.setEnabled(false);
				}
		                    
                if(item.equals("Or")){
                	pinA.setSource(switch1);
    				pinB.setSource(switch2);
    				
    				or.setPinA(pinA);
    				or.setPinB(pinB);
    				pinL1.setSource(or);
    				
    				pinS.setEnabled(true);
    				pinS.setSelected(lamp1.getLampValue());
    				pinS.setEnabled(false);
                }
                
                if(item.equals("Xor")){
    				pinA.setSource(switch1);
    				pinB.setSource(switch2);
    				
    				xor.setPinA(pinA);
    				xor.setPinB(pinB);
    				pinL1.setSource(xor);
    				
    				pinS.setEnabled(true);
    				pinS.setSelected(lamp1.getLampValue());
    				pinS.setEnabled(false);
                }
                
                if(item.equals("Nand")){
    				pinA.setSource(switch1);
    				pinB.setSource(switch2);
    				
    				nand.setPinA(pinA);
    				nand.setPinB(pinB);
    				pinL1.setSource(nand);
    				
    				pinS.setEnabled(true);
    				pinS.setSelected(lamp1.getLampValue());
    				pinS.setEnabled(false);
                }
                
                if(item.equals("FullAdder")){

            		pinA.setSource(switch1);
            		pinB.setSource(switch2);
            		pinD.setSource(switch3);
            		
            		fullAdder.setPinA(pinA);
            		fullAdder.setPinB(pinB);
            		fullAdder.setPinC(pinD);
            		
    				pinS.setEnabled(true);
    				pinC.setEnabled(true);
    				pinS.setSelected(fullAdder.getOutputValue(0));
    				pinC.setSelected(fullAdder.getOutputValue(1));
    				pinS.setEnabled(false);
    				pinC.setEnabled(false);
                }
                   
                
                if(item.equals("HalfAdder")){

            		pinA.setSource(switch1);
            		pinB.setSource(switch2);
            		pinD.setSource(switch3);
            		
            		halfAdder.setPinA(pinA);
            		halfAdder.setPinB(pinB);
            		
    				pinS.setEnabled(true);
    				pinC.setEnabled(true);
    				pinS.setSelected(halfAdder.getOutputValue(0));
    				pinC.setSelected(halfAdder.getOutputValue(1));
    				pinS.setEnabled(false);
    				pinC.setEnabled(false);
                }
                
                if(item.equals("Not")){

    				pinA.setSource(switch1);
    				pinB.setSource(switch2);
    				
    				not.setPin(pinA);
    				pinL1.setSource(not);
    				
    				pinS.setEnabled(true);
    				pinS.setSelected(lamp1.getLampValue());
    				pinS.setEnabled(false);
                }
            }                          
		});
		
		pin3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				 pinA = new InputPin();
				 pinB = new InputPin();
				 pinD = new InputPin();
				 pinA.setSource(switch1);
				 pinB.setSource(switch2);
				 pinD.setSource(switch3);
 				 switch3.setBotao(pin3.isSelected());
		                  
                if(item.equals("FullAdder")){

            		pinA.setSource(switch1);
            		pinB.setSource(switch2);
            		pinD.setSource(switch3);
            		
            		fullAdder.setPinA(pinA);
            		fullAdder.setPinB(pinB);
            		fullAdder.setPinC(pinD);
            		
    				pinS.setEnabled(true);
    				pinC.setEnabled(true);
    				pinS.setSelected(fullAdder.getOutputValue(0));
    				pinC.setSelected(fullAdder.getOutputValue(1));
    				pinS.setEnabled(false);
    				pinC.setEnabled(false);
                }
                   
                
                if(item.equals("HalfAdder")){

            		pinA.setSource(switch1);
            		pinB.setSource(switch2);
            		pinD.setSource(switch3);
            		
            		halfAdder.setPinA(pinA);
            		halfAdder.setPinB(pinB);
            		
    				pinS.setEnabled(true);
    				pinC.setEnabled(true);
    				pinS.setSelected(halfAdder.getOutputValue(0));
    				pinC.setSelected(halfAdder.getOutputValue(1));
    				pinS.setEnabled(false);
    				pinC.setEnabled(false);
                }
            }                          
		});
		
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