/*
 * Nicole Donnelly
 * 20171015
 * Project 4 - Project4Gui.java
 *
 * This class defines the the gui and handles database interactions for the Students
 * class which tracks id, name, major, and gpa of a student. 
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Project4Gui extends JFrame{

  //declare items needed to build the GUI
  private Font guiFont = new Font("MONOSPACED", Font.BOLD, 16);
  private Font inputFont = new Font("MONOSPACED", Font.PLAIN, 12);
  private JTextField idField = new JTextField(25);
  private JTextField nameField = new JTextField(25);
  private JTextField majorField = new JTextField(25);
  private JComboBox<String> selectionList = new JComboBox<String>(new String[] {"Insert", 
      "Delete", "Find", "Update"});
  private String request = "Insert";
  private JButton processButton = new JButton("Process Request");
  
  // declare items for the treemap
  Map<Integer, Student> studentDatabase = new TreeMap();
  private Integer id;
  
  // declare items for update guis
  
  public Project4Gui() {
    //title, size, closing action and listener
    super("Project 4");
    setSize(450, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //grid layout to hold panel items
    setLayout(new GridLayout(6,2,2,2));
    
    // enter id section
    JLabel idLabel = new JLabel("Id:");
    idLabel.setFont(guiFont);
    add(idLabel);
    idField.setFont(inputFont);
    add(idField);
    
    // enter name section
    JLabel nameLabel = new JLabel("Name:");
    nameLabel.setFont(guiFont);
    add(nameLabel);
    nameField.setFont(inputFont);
    add(nameField);
    
    // enter major section
    JLabel majorLabel = new JLabel("Major:");
    majorLabel.setFont(guiFont);
    add(majorLabel);
    majorField.setFont(inputFont);
    add(majorField);
    
    // add selection section
    JLabel selectionLabel = new JLabel("Choose Selection:");
    selectionLabel.setFont(guiFont);
    add(selectionLabel);
    selectionList.setFont(guiFont);
    add(selectionList);
    
    // process button
    processButton.setFont(guiFont);
    add(processButton);
    add(new JLabel());
    
    // extend frame for combo box list
    add(new JLabel());
    add(new JLabel());
    
    // listeners
    selectionList.addItemListener((ItemEvent event) -> 
      request = (String) selectionList.getSelectedItem());
    processButton.addActionListener(event -> processRequest(request));
    
  } // end Project4Gui
  
  // method for process request button
  private void processRequest(String selection) {
    
    try {
      checkId(); // all scenarios need a valid id number, so check the id value
      boolean idExists = studentDatabase.containsKey(id); // check if id exists
      
      switch(selection){ // run the requested process
        
        case "Insert": // if the id exists, provide message. else insert if all info provided.
          if (idExists == true){
            invalidId(selection);
          }
          else if(nameField.getText().equals("") || majorField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Both name and major are required.");
          }
          else {
            studentDatabase.put(Integer.parseInt(idField.getText()), 
                new Student(nameField.getText(), majorField.getText()));
            requestSuccess(selection);
          }
          break;
            
        case "Delete": // if the id does not exist, provide message. else delete.
          if (idExists == false){
            invalidId(selection);
          }
          else {
            studentDatabase.remove(Integer.parseInt(idField.getText()));
            requestSuccess(selection);
          }
          break;
        
        case "Find": // if the id does not exist, provide message. else display info.
          if (idExists == false){
            invalidId(selection);
          }
          else {
            requestSuccess(selection);
          }
            break;
            
        case "Update": // if the id does not exist, provide message. else update.
          if (idExists == false){
            invalidId(selection);
          }
          else {
            updateRecord(id);
          }
          break;
        } // end switch
    } // end try
    
    catch (NumberFormatException exception) {
      JOptionPane.showMessageDialog(null, "Please enter a positive integer value for ID.");
      } // catch exception from checkId

  } // end processRequest

  // provide notification of successful request
  private void requestSuccess(String selection) {
    if (selection.equals("Insert")){
      JOptionPane.showMessageDialog(null, "Student: " + id + "\n" +
          studentDatabase.get(id).toString() + "\nSuccessfully added.");
    }
    else if (selection.equals("Delete")){
      JOptionPane.showMessageDialog(null, "Student: " + id + "\n Successfully deleted.");
    }
    else if (selection.equals("Find")){
      JOptionPane.showMessageDialog(null, "Student: " + id + "\n" + 
           studentDatabase.get(id).toString());
    }
  } // end requestSuccess

  // check if the id exists or not and provide appropriate message
  private void invalidId(String selection) {
    if (selection.equals("Insert")){
      JOptionPane.showMessageDialog(null, "This ID value exists. Please enter "
          + "a different ID.");
      }
    else{
      JOptionPane.showMessageDialog(null, "There is no record with this ID. "
                + "Please enter a different ID.");
      }
    } // end invalidId

  private void updateRecord(int id) {
    
    // grade input box
    Object[] gradeSelection = {'A','B','C','D','F'};
    char grade = (char)JOptionPane.showInputDialog(null, "Choose grade:", "Grade", 
                   JOptionPane.INFORMATION_MESSAGE, null, gradeSelection, gradeSelection[0]);
    
    // credits input box
    Object[] creditSelection = {3, 6};
    int credits = (int)JOptionPane.showInputDialog(null, "Choose credits:", "Credits", 
                   JOptionPane.INFORMATION_MESSAGE, null, creditSelection, creditSelection[0]);
    
    // update record
    studentDatabase.get(id).courseCompleted(credits, grade);
    
    // message
    JOptionPane.showMessageDialog(null, "Student: " + id + "\nSuccessfully updated.\n" + 
        studentDatabase.get(id).toString());
    
    
  } // end updateRecord

  // check that the id is a valid int
  private void checkId() throws NumberFormatException {
    id = Integer.parseInt(idField.getText());
    } // end checkId

  public static void main (String [] args) {  
    Project4Gui project_4 = new Project4Gui();
    project_4.setVisible(true);
   
  } // end main
  
} // end class
