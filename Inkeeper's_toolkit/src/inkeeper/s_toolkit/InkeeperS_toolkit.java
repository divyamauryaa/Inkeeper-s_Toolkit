
package inkeeper.s_toolkit;

import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;

public class InkeeperS_toolkit extends JFrame implements ActionListener {

    InkeeperS_toolkit(){
        setSize(1366,565);
       setLocation(50,50);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        JLabel image = new JLabel(i1);
        add(image);
        
        JLabel text = new JLabel("HOTEL MANAGEMENT SYSTEM");
        text.setBounds(20,430,1000,90);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("serif", Font.PLAIN, 30));
        image.add(text);
        
        JButton next = new JButton("NEXT");
        next.setBounds(1100,450,150,50);
        next.setBackground(Color.WHITE);
        next.setForeground(Color.MAGENTA);
        next.addActionListener(this);
        next.setFont(new Font("serif", Font.PLAIN, 20));
        image.add(next);
        
         setVisible(true);
         while(true){
                        text.setVisible(false); // lid =  j label
                    try{
                        Thread.sleep(500); //1000 = 1 second
                    }catch(Exception e){} 
                        text.setVisible(true);
                    try{
                        Thread.sleep(500);
                    }catch(Exception e){}
                }
	
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }
    
    public static void main(String[] args) {
        new InkeeperS_toolkit();
    }
    
}
