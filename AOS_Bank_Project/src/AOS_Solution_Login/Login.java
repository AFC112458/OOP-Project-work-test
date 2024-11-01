package AOS_Solution_Login;

import java.awt.Color;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
		public class Login extends JFrame implements ActionListener{
			
			JLabel label1,label2,label3;
			
			JTextField textField2;
			JPasswordField passwordField3;
			JButton bt1,bt2,bt3;
			
		Login(){
			super("AOS Micro Credit Solution");
			
			label1= new JLabel("Welcome to AOS Credit Union Ltd");
			 label1.setForeground(Color.BLUE);
			 label1.setFont(new Font("AvantGarde",Font.BOLD,38));
			label1.setBounds(180,75,650,40);
			add(label1);
			
			label2= new JLabel("Card No:");
			 label2.setFont(new Font("Ralway",Font.BOLD,28));
			 label2.setForeground(Color.BLUE);
				label2.setBounds(225,170,375,30);
				add(label2);
				
				textField2 = new JTextField(15);
				textField2.setBounds(345,173,325,30);
				textField2.setFont(new Font("Arial",Font.BOLD,14));
				add(textField2);
				
				label3= new JLabel("PIN No:");
				 label3.setFont(new Font("Ralway",Font.BOLD,28));
				 label3.setForeground(Color.BLUE);
					label3.setBounds(242,210,375,30);
					add(label3);
					
					passwordField3= new JPasswordField(15);
					passwordField3.setBounds(345,212,325,30);
					passwordField3.setFont(new Font("Arial",Font.BOLD,14));
					add(passwordField3);
				bt1 = new JButton("SIGN IN");
				bt1.setFont(new Font("Arial",Font.BOLD,14));
				bt1.setForeground(Color.WHITE);
				bt1.setBackground(Color.orange);
				bt1.setBounds(350,300,100,30);
				bt1.addActionListener(this);
				add(bt1);
				bt2 = new JButton("CLEAR");
				bt2.setFont(new Font("Arial",Font.BOLD,14));
				bt2.setForeground(Color.WHITE);
				bt2.setBackground(Color.orange);
				bt2.setBounds(550,300,100,30);
				bt2.addActionListener(this);
				add(bt2);
				
				bt3 = new JButton("SIGN UP");
				bt3.setFont(new Font("Arial",Font.BOLD,14));
				bt3.setForeground(Color.WHITE);
				bt3.setBackground(Color.orange);
				bt3.setBounds(420,360,150,30);
				bt3.addActionListener(this);
				add(bt3);
					
				
			ImageIcon k1 = new ImageIcon(ClassLoader.getSystemResource("loginbg.png"));
			Image k2 = k1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
			ImageIcon k3 = new ImageIcon(k2);
			JLabel kimage = new JLabel(k3);
			kimage.setBounds(0,0,850,480);
			add(kimage);
			
			
			setLayout(null);
			setSize(850,480);
			setLocation(450,200);
			setVisible(true);
		}
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(e.getSource()==bt1) {
						
					}else if(e.getSource()==bt2) {
						textField2.setText("");
						passwordField3.setText("");
						
					}else if(e.getSource()==bt3) {
						
					}
					
				}catch(Exception E) {
					E.printStackTrace();
				}
			
		}
		
public static void main(String[] args) {
	new Login();
}
	}


