/**Write a Java program using Swing to create a frame having three text fields, threelabels and a 
button. The interface has to accept a number in the first text field. While clicking the button, 
the second and third textfields have to display the previous number and next number 
respectively, of the accepted input number */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class questionTwo implements  ActionListener {
    
     public static void main(String args[])
     {
        JFrame f = new JFrame();
        f.setSize(500,500);

        JLabel l1 = new JLabel("Input Number ");
        JLabel l2 = new JLabel("previous Number ");
        JLabel l3 = new JLabel("Next Number ");

        JButton b = new JButton("click");

        JTextField tf1 = new JTextField();
        JTextField tf2 = new JTextField();
        JTextField tf3 = new JTextField();
        
        l1.setBounds(100, 100, 150, 50);
        l2.setBounds(100,150,150,50);
        l3.setBounds(100,200,150,50);
        tf1.setBounds(250, 111, 100, 30);
        tf2.setBounds(250, 161, 100, 30);
        tf3.setBounds(250, 211, 100, 30);
        b.setBounds(200, 250, 100, 50);


        f.add(l1);f.add(l2);f.add(l3);f.add(tf1);f.add(tf2);f.add(tf3);f.add(b);
        f.setLayout(null);
        f.setVisible(true);

       
        b.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int num = Integer.parseInt(tf1.getText());
                String s1 = new Integer(num+1).toString();
                String s2 = new Integer(num-1).toString();
                tf2.setText(s2);
                tf3.setText(s1);
            }
           });

     }

    @Override // not nessesary
    public void actionPerformed(ActionEvent e) {
    
    }
}
