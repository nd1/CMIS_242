/* Nicole Donnelly
 * 20170915
 * Week04 - discussion
 * 
 * The simple hat calculator will compute the number of stitches to cast on for a knit
 * hat for a user specified finished size and knitting gauge. The calculator automatically computes
 * 2 inches of negative ease, which is standard when knitting a hat. 
 */

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;

class SimpleHatCalculator extends JFrame {

  private JTextField sizeField = new JTextField(5);
  private JTextField gaugeField = new JTextField(5);
  private JTextField stitchesField = new JTextField(5);
  
  // pass the method calculateStitches to the listener
  ActionListener calculateListener = event -> calculateStitches();
  
  public SimpleHatCalculator() {
    
    super("Simple Hat Calculator");
    setSize(350, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // create grid to hold jpanel items
    setLayout(new GridLayout(4, 1, 5, 5));
    
    // info
    JPanel info = new JPanel();
    info.setLayout(new FlowLayout());
    info.add(new JLabel ("Calculate the number of cast on stitches"));
    info.add(new JLabel ("for a hat of specified finished size and gauge."));
    info.setBorder(new TitledBorder(""));
    add(info);
    
    // input
    JPanel input = new JPanel();
    input.setLayout(new GridLayout(2, 2, 5, 5));
    input.add(new JLabel ("Final Hat Size (inches)"));
    input.add(sizeField);
    input.add(new JLabel ("Gauge (stitches per inch)"));
    input.add(gaugeField);
    input.setBorder(new TitledBorder(""));
    add(input);
    
    // button
    JPanel button = new JPanel();
    button.setLayout(new GridLayout(1, 3, 5, 5));
    JButton calculate = new JButton("Calculate");
    button.add(new JLabel(""));
    button.add(calculate);
    button.add(new JLabel(""));
    calculate.addActionListener(calculateListener);
    add(button);
    
    // output
    JPanel output = new JPanel();
    output.setLayout(new GridLayout(1, 2, 5, 5));
    output.add(new JLabel ("Cast On Number"));
    output.add(stitchesField);
    stitchesField.setEditable(false);
    output.setBorder(new TitledBorder(""));
    add(output);
       
  } //end SimpleHatCalculator
  
  private void calculateStitches() {
    
    //parse input, subtract 2 from the size for hat ease
    float size = Float.parseFloat(sizeField.getText()) - 2;
    float gauge = Float.parseFloat(gaugeField.getText());
    
    
    stitchesField.setText(Integer.toString((int) Math.round(size * gauge)));
    
  } //end calculate stitches
  
  public static void main(String[] args) {
    
    SimpleHatCalculator newHat = new SimpleHatCalculator();
    newHat.setVisible(true);
  } //end main
  
} //end class
