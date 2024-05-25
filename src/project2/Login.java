/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    JTextField tbname,tbpassword;
    Login(){
        //setSize(600,300);
                setBounds(300,250,600,400);
        setLocationRelativeTo(null);

        getContentPane().setBackground(Color.blue);
        setLayout(null);
        
        JLabel lblname=new JLabel("Username");
        lblname.setBounds(270,10,200,200);
        lblname.setForeground(Color.WHITE);
        lblname.setFont(new Font("serif",Font.BOLD,16));
        
        JLabel lblpass=new JLabel("Password");
        lblpass.setBounds(270,90,200,200);
        lblpass.setForeground(Color.WHITE);
        lblpass.setFont(new Font("serif",Font.BOLD,16));
        
        tbname=new JTextField();
        tbname.setBounds(150,130,300,40);
        
        
        tbpassword=new JTextField();
        tbpassword.setBounds(150,205,300,40);
        
        JButton btnlogin=new JButton("Login");
        btnlogin.setBounds(260,270,100,30);
        btnlogin.setBackground(Color.WHITE);
        btnlogin.setForeground(Color.BLACK);
        btnlogin.addActionListener(this);
        ImageIcon img1=new ImageIcon("E:\\Pic\\Login.png");
        Image img2=img1.getImage().getScaledInstance(250, 150, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel image=new JLabel(img3);
        image.setBounds(200,-50,200,200);
        add(image);
        add(btnlogin);
        add(tbname);
        add(tbpassword);
        add(lblpass);
        add(lblname);
        setVisible(true);
    
        
       }
    @Override
    public void actionPerformed(ActionEvent e){
       try{ String name=tbname.getText();
        String password=tbpassword.getText();
       String query="select * from login where username = '"+name+"' and password = '"+password+"'";
       Conn c=new Conn();
        ResultSet rs= c.s.executeQuery(query);
       if(rs.next()){
        JOptionPane.showMessageDialog(null,"Welcome");
       setVisible(false);
       new Home();
       }else{
       JOptionPane.showMessageDialog(null,"Invalid Login");
       }
       }catch(Exception s){
       s.printStackTrace();
       }
    }
public static void main(String args[]){
	new Login();
}    
}
