package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(900, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.RED);
        
      
        
        JLabel heading = new JLabel("<html> <U>College Management System</U> </html>");
        heading.setBounds(70, 20, 750, 60);
        heading.setFont(new Font("Tahoma", Font.BOLD, 45));
        add(heading);
        
        JLabel name = new JLabel("Developed By: Samuhik Sangthan");
        name.setBounds(70, 220, 550, 40);
        name.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(name);
        
        JLabel rollno = new JLabel("Year: 2023");
        rollno.setBounds(70, 280, 550, 40);
        rollno.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(rollno);
        
        JLabel contact = new JLabel("Contact: ankur78912@gmail.com, nirnaik27@gmail.com");
        contact.setBounds(70, 340, 750, 40);
        contact.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(contact);
        
        
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}