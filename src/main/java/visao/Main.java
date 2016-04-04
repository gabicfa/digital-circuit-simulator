package visao;
 import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.Random;
import javax.swing.*; 

class Main extends JPanel
    {
        int w, h;
        static final int
            AND = 0,
            OR = 1,
            XOR = 2,
            NAND = 3,
        	FULLADDER = 4,
        	HALFADDER=5,
        	NOT = 6;
        	
        int shapeType = -1;
  
        public Main()
        {
            setBackground(Color.white);
        }
  
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            for(int i = 0; i < 1; i++)
            {
                
            switch(shapeType)
               {
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
                	
                    g.setColor(Color.BLACK);
	        		g.drawLine(50, 50, 100, 50);
	        		g.drawLine(50, 100, 100, 100);
	        		g.drawLine(100, 20, 100, 120);
	        		g.drawLine(160, 70, 220, 70);
	        		g.drawArc(60, 20, 100, 100, -100, 200);
                }
                
                else if(shapeType == 1){

                    g.setColor(Color.BLACK);
            		g.drawLine(50, 50, 97, 50);
            		g.drawLine(50, 100, 97, 100);
            		g.drawLine(195, 75, 240, 75);
            		g.drawArc(70, 25, 30, 110, -58, 135);
            		g.drawArc(25, 25, 170, 100, -100, 205);
                }
                else if(shapeType == 2){

                    g.setColor(Color.BLACK);
            		g.drawLine(50, 50, 97, 50);
            		g.drawLine(50, 100, 97, 100);
            		g.drawLine(195, 75, 250, 75);
            		g.drawArc(70, 25, 30, 110, -58, 135);
            		g.drawArc(65, 25, 25, 110, -58, 135);
            		g.drawArc(25, 25, 170, 100, -100, 205);
                }
                else if(shapeType == 3){

                    g.setColor(Color.BLACK);
            		g.drawLine(50, 50, 100, 50);
            		g.drawLine(50, 100, 100, 100);
            		g.drawLine(100, 20, 100, 120);
            		g.drawLine(180, 70, 220, 70);
            		g.drawArc(160, 60, 20, 20, -30, 360);
            		g.drawArc(60, 20, 100, 100, -100, 200);
                }  
                
                else if(shapeType == 4){

                    g.setColor(Color.BLACK);
            		g.drawLine(45, 50, 90, 50);
            		g.drawLine(45, 90, 90, 90);
            		g.drawLine(45, 130, 90, 130);
            		g.drawLine(90,30,90,150);
            		g.drawLine(90, 30, 180, 30);
            		g.drawLine(90, 150, 180, 150);
            		g.drawLine(180, 30, 180,150);
            		g.drawLine(180, 60, 225, 60);
            		g.drawLine(180, 120, 225, 120);
                } 
                else if(shapeType == 5){

            		g.drawLine(45, 60, 90, 60);
            		g.drawLine(45, 120, 90, 120);
            		g.drawLine(90,30,90,150);
            		g.drawLine(90, 30, 180, 30);
            		g.drawLine(90, 150, 180, 150);
            		g.drawLine(180, 30, 180,150);
            		g.drawLine(180, 60, 225, 60);
            		g.drawLine(180, 120, 225, 120);
                } 
                else if(shapeType == 6){

                    g.setColor(Color.BLACK);
            		g.drawLine(100, 40, 160, 70);
            		g.drawLine(100, 100, 160, 70);
            		g.drawLine(100, 40, 100, 100);
            		g.drawLine(50, 70, 100, 70);
            		g.drawLine(170, 70, 210, 70);
            		g.drawArc(160, 65, 10, 10, -20, 360);
                } 
        }
}
        public void makeAnd()
        {
            shapeType = AND;
            repaint();
        }
  
        public void makeOr()
        {
            shapeType = OR;
            repaint();
        }
  
        public void makeXor()
        {
            shapeType = XOR;
            repaint();
        }
  
        public void makeFullAdder()
        {
            shapeType = FULLADDER;
            repaint();
        }
        
        public void makeNand()
        {
            shapeType = NAND;
            repaint();
        }
        
        public void makeHalfAdder()
        {
            shapeType = HALFADDER;
            repaint();
        }
        
        public void makeNot()
        {
            shapeType = NOT;
            repaint();
        }
    
        public static void main(String[] args)
        {
            new Screen();
        }
    }

