import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.TitledBorder;


public class Stash extends JFrame {
  
  private JRadioButton yarnButton = new JRadioButton("Yarn");
  private JRadioButton fibreButton = new JRadioButton("Fibre");
  
  private JButton stash = new JButton("Stash");

  // GUI 
  
  public Stash() {
    
    super("Nicole's Stash");
    setSize(275, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //Window Layout
    setLayout(new FlowLayout());
    
    // radio button panel
    JPanel radioPanel = new JPanel();
    radioPanel.setLayout(new GridLayout(1, 2));
    ButtonGroup radioGroup = new ButtonGroup();
    radioGroup.add(yarnButton);
    radioGroup.add(fibreButton);
    radioPanel.add(yarnButton);
    radioPanel.add(fibreButton);
    add(radioPanel);
    
    // label
    JPanel info = new JPanel();
    info.setLayout(new FlowLayout());
    info.add(new JLabel ("Select the fibre content:"));
    info.setBorder(new TitledBorder(""));
    add(info);
    
    //Check box Panel
    JPanel checkPanel = new JPanel();
    checkPanel.setLayout(new GridLayout(3, 2));
    
    final JCheckBox merino = new JCheckBox("Merino");
    final JCheckBox polwarth = new JCheckBox("Polwarth");
    final JCheckBox bluefacedLeister = new JCheckBox("Bluefaced Leister");
    final JCheckBox jacob = new JCheckBox("Jacob");
    final JCheckBox clunForest = new JCheckBox("Clun Forest");
    final JCheckBox shetland = new JCheckBox("Shetland");
    
    checkPanel.add(merino);
    checkPanel.add(polwarth);
    checkPanel.add(bluefacedLeister);
    checkPanel.add(jacob);
    checkPanel.add(clunForest);
    checkPanel.add(shetland);
    add(checkPanel);
    
    JPanel button = new JPanel();
    button.setLayout(new FlowLayout());
    button.add(stash);
    add(button);
    
  } // end gui
  
  public static void main (String [] args) {
    
    Stash frame = new Stash();
    frame.setVisible(true);
  } // end main
} // end class
