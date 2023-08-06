
package calculatorproject;

import java.awt.*;
import javax.swing.*;
public class CalculatorProject {
    
    JFrame frame = new JFrame("Calculator");
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton ("off");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("X");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonReciprocal = new JButton("1/x");
    JButton buttonSqrt = new JButton("\u221A");
    
    CalculatorProject(){
        prepareGui();
        addComponents();
    
    }
    
    public void prepareGui(){
        frame.setSize(305,510);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
    public void addComponents(){
        
        label.setBounds(250,0,50,50);
        label.setForeground(Color.white);
        frame.add(label);
        
        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Arial",Font.BOLD,20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);
        
        onRadioButton.setBounds(10, 95, 60, 40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial",Font.BOLD,14));
        onRadioButton.setBackground(Color.black);
        onRadioButton.setForeground(Color.white);
        onRadioButton.setFocusable(false);
        frame.add(onRadioButton);
        
        
        offRadioButton.setBounds(10, 120, 60, 40);
        offRadioButton.setSelected(true);
        offRadioButton.setFont(new Font("Arial",Font.BOLD,14));
        offRadioButton.setBackground(Color.black);
        offRadioButton.setForeground(Color.white);
        offRadioButton.setFocusable(false);
        frame.add(offRadioButton);
        
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);
        
        buttonSeven.setBounds(10, 230, 60, 40);
        buttonSeven.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonSeven);
        
        buttonEight.setBounds(80, 230, 60, 40);
        buttonEight.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonEight);
        
        buttonNine.setBounds(150, 230, 60, 40);
        buttonNine.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonNine);
        
        buttonFour.setBounds(10, 290, 60, 40);
        buttonFour.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonFour);
        
        
        
    
    
    
    }

   
    public static void main(String[] args) {
        
        CalculatorProject calculator = new CalculatorProject();
        
    }
    
}
