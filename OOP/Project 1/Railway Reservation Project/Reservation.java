package project;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Reservation implements ActionListener{
  JFrame f;
  JLabel name,age,gender,train,station1,station2,type_train,type_bed;
  JTextField t1,t2;
  JButton b;
  JComboBox<String> c1,c2,c3,c4;
  JCheckBox ch1,ch2,ch3,ch4;
  FileWriter fw;
  Reservation()
  {
    f=new JFrame("RAILWAY TICKET BOOKING SYSTEM");
    f.setSize(400,300);
    name=new JLabel("Name: ");
    f.add(name);
    t1=new JTextField(80);
    
    f.add(t1);
    age=new JLabel("Age: ");
    f.add(age);
    t2=new JTextField(80);
    f.add(t2);
    gender=new JLabel("Gender: ");
    f.add(gender);
    ch1=new JCheckBox("M");
    ch1.setBounds(80,80,100,100);
    ch2=new JCheckBox("F");
    ch2.setBounds(80,80,100,100);
    f.add(ch1);
    f.add(ch2);
    train=new JLabel("Train");
    f.add(train);
    String[] trains=new String[]{"palaknama","Deccan","Indo","RajDhani","Humsafar","Simhadri","Shatabdi"};
    c1=new JComboBox<String>(trains);
    c1.setBounds(60,60, 80,80);
    f.add(c1);
    
    station1=new JLabel("source");
    f.add(station1);
    String[] platforms1=new String[] {"a","b","c","d","e","f","g"};
      c2=new JComboBox<String>(platforms1);
      c2.setBounds(60,60, 80,80);
      f.add(c2);
      
    station2=new JLabel("Depart");
    f.add(station2);
    String[] platforms2=new String[] {"a","b","c","d","e","f","g"};
    
     c3=new JComboBox<String>(platforms2);
     c3.setBounds(60,60, 80,80);
     f.add(c3);
    type_train=new JLabel("TypeTrain: ");
    f.add(type_train);
    
    
    String[] type=new String[] {"Express","Passenger","SuperFast"};
    c4=new JComboBox<String>(type);
    c4.setBounds(60,60, 80,80);
    f.add(c4);
    ch3=new JCheckBox("AC");
    ch4=new JCheckBox("Non A/C");
    ch3.setBounds(80,80,100,100);
    ch4.setBounds(80,80,100,100);
    f.add(ch3);
    f.add(ch4);
    b=new JButton("SUBMIT");
    b.setBounds(80,80,100,100);
    f.add(b);
    f.setLayout(new FlowLayout());
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    b.addActionListener(this);
  }
  
  
  public void actionPerformed(ActionEvent e){  
  
      if(e.getSource()==b)
      {
        JOptionPane.showMessageDialog(null, "Successfully submitted");
        try {
          fw=new FileWriter("/Users/apple/Desktop/Eclipse/GUI/src/project/Passenger info");
          fw.write("Name: "+t1.getText());
          fw.write("\n ");
          fw.write("Age:"+t2.getText());
          
          fw.write("\n");
          fw.write("Train: "+c1.getSelectedItem());
          fw.write("\n");
          fw.write("Arrival: "+c2.getSelectedItem());
          fw.write("\n");
          fw.write("Departure: "+c3.getSelectedItem());
          fw.write("\n");
          fw.write("TrainType:"+c4.getSelectedItem());
          fw.write("\n");
          fw.write("Cost of ticket is: "+585);
          fw.close();
          
        }
        catch(Exception x) 
        {JOptionPane.showMessageDialog(null, x);}
          
        }
      }
  }
