
package calculatorproject;

import java.awt.*;
import javax.swing.*;
public class CalculatorProject {
    
    JFrame frame = new JFrame("Calculator");
    
    CalculatorProject(){
    
    }
    
    public void prepareGui(){
        frame.setSize(305,510);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }

   
    public static void main(String[] args) {
        
        CalculatorProject calculator = new CalculatorProject();
        
    }
    
}
