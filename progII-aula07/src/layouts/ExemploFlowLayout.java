package layouts;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//CTRL + SHIFT + I
/**
 * @author prof-salu
 */
public class ExemploFlowLayout extends JFrame{
    public ExemploFlowLayout(){
        super("FlowLayout");
    }
    
    public void init(){
        setBounds(50, 100, 400, 150);
        
        FlowLayout layout = new FlowLayout();
        
        JPanel panel = new JPanel();
        
        panel.setLayout(layout);
        getContentPane().add(panel);
        
        for(int i = 1; i <= 8; i++){
            JButton botao = new JButton("Click " + i);
            panel.add(botao);
        }
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        ExemploFlowLayout frame = new ExemploFlowLayout();
        frame.init();
    }
}
