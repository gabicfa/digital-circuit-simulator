package visao;
 import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.Random;
import javax.swing.*; 

class Main extends JPanel
    {
        static final int AND = 0, OR = 1, XOR = 2, NAND = 3, FULLADDER = 4, HALFADDER=5, NOT = 6;
        
        AndGateDesenho andGate = new AndGateDesenho ();
        OrGateDesenho orGate = new OrGateDesenho ();
        XorGateDesenho xorGate = new XorGateDesenho ();
        NandGateDesenho nandGate = new NandGateDesenho ();
        FullAdderDesenho fullAdder = new FullAdderDesenho ();
        HalfAdderDesenho halfAdder = new HalfAdderDesenho ();
        NotGateDesenho notGate = new NotGateDesenho ();
      	
        int shapeType = -1;
  
        public Main(){
            setBackground(Color.white);
        }
  
        public void makeAnd(){
            shapeType = AND;
            repaint();
        }
  
        public void makeOr(){
            shapeType = OR;
            repaint();
        }
  
        public void makeXor(){
            shapeType = XOR;
            repaint();
        }
  
        public void makeFullAdder(){
            shapeType = FULLADDER;
            repaint();
        }
        
        public void makeNand(){
            shapeType = NAND;
            repaint();
        }
        
        public void makeHalfAdder(){
            shapeType = HALFADDER;
            repaint();
        }
        
        public void makeNot(){
            shapeType = NOT;
            repaint();
        }
       
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            for(int i = 0; i < 1; i++)
            {
                
            switch(shapeType){
            	case AND:
            		break;
            	case OR:
                    break;
                case XOR:
                    break;
                case NAND:
                    break;
                case FULLADDER:
                    break;
                case HALFADDER:
                    break;
                case NOT:
                    break;
                }
            
                if(shapeType == 0){
                	andGate.paintComponent(g);
                }
                
                else if(shapeType == 1){
                	orGate.paintComponent(g);
                }
                else if(shapeType == 2){
                	xorGate.paintComponent(g);
                }
                else if(shapeType == 3){
                	nandGate.paintComponent(g);
                }   
                else if(shapeType == 4){
                	fullAdder.paintComponent(g);
                } 
                else if(shapeType == 5){
                	halfAdder.paintComponent(g);
                } 
                else if(shapeType == 6){
                	notGate.paintComponent(g);
                } 
        }
}
  
        public static void main(String[] args)
        {
            new Screen();
        }
    }

