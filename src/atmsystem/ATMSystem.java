package atmsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.imageio.ImageIO;
import java.io.*;

public class ATMSystem extends Frame implements ActionListener{

    Button btn_login,btn_exit;
    
    ATMSystem() {
        
        super("Advance ATM System");
        setLayout(null);
        setBackground(Color.blue);
        
        btn_login = new Button("Login");
        btn_login.setBounds(120, 350, 120, 40);
        btn_login.setFont(new Font("Arial ",Font.PLAIN,22));
        btn_login.setForeground(Color.RED);
        btn_login.setBackground(Color.gray);
        btn_login.addActionListener(this);
        add(btn_login);
        
        btn_exit = new Button("Exit");
        btn_exit.setBounds(270, 350, 120, 40);
        btn_exit.setFont(new Font("Arial",Font.PLAIN,22));
        btn_exit.setForeground(Color.RED);
        btn_exit.setBackground(Color.gray);
        btn_exit.addActionListener(this);
        add(btn_exit);
              
        
    }
    public void paint(Graphics g){
        
        g.setFont(new Font("Verdana",Font.PLAIN,36));
        g.setColor(Color.YELLOW);
        g.drawString("ATM SYSTEM", 150, 90);
        
        g.setFont(new Font("Algerian",Font.PLAIN,26));
        g.setColor(Color.blue);
        g.drawString("WelCome To The ATM System", 60,170);
        
        g.setColor(Color.YELLOW);
        g.setColor(Color.DARK_GRAY);
        g.drawRoundRect(45, 130, 420, 110, 60, 200);
        
        g.setFont(new Font("Algerian",Font.PLAIN,26));
        g.setColor(Color.red);
        g.drawString("Please Login Here", 120,220); 
        
        g.fillRect(100, 330, 310, 80);
        g.drawRect(100, 330, 310, 80);
        g.setColor(Color.YELLOW);
        g.drawRoundRect(50, 320, 410, 100, 60, 200);
        g.setColor(Color.PINK);
        g.fillRoundRect(50, 320, 410, 100,60,200);
        
        g.setColor(Color.red);
        g.drawString("Developed By ", 50, 470);
        g.setColor(Color.YELLOW);
        g.drawString("Aunog Arafat", 260,470);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn_login){
            
            Login lg = new Login();
            lg.setVisible(true);
            lg.setSize(400, 350);
            lg.setBackground(Color.GREEN);
            lg.setResizable(false);
            dispose();
        }
        
        if(e.getSource()==btn_exit){
            
            int rply = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit ?","Error",JOptionPane.YES_NO_OPTION);
            
            if(rply==JOptionPane.YES_OPTION){
                
                System.exit(0);
            }
            else
            {
                
                
            }
        }
        
    }
    public static void main(String[] args) {
  
        ATMSystem as = new ATMSystem();
        as.setVisible(true);
        as.setSize(500,500);
        as.setResizable(false);
        as.setResizable(false);
    }
    
}
