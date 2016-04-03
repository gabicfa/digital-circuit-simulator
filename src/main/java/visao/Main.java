package visao;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Main {//classe para ver o q eu estava desenhando
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new OrGateDesenho());//colocar porta que desenha ver o desenho
                frame.setSize(300,300);
                frame.setVisible(true);
            }
        });
    }
}
