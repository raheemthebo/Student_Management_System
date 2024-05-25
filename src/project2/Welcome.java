/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project2;/**
 *
 * @author sabah computer
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Welcome extends JFrame implements ActionListener{
    Welcome(){
        
    setSize(1170,650);
    setLocationRelativeTo(null);
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);
    JLabel lable=new JLabel("Student Managemnt System");
    lable.setBounds(140,10,1200,80);
    lable.setFont(new Font("serif",Font.PLAIN,75));
    ImageIcon img1=new ImageIcon("E:\\Pic\\back.jpg");
    Image img2=img1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
    ImageIcon img3=new ImageIcon(img2);
    JLabel image=new JLabel(img3);
    image.setBounds(50,100,1050,500);
    JButton click=new JButton("Continue");
    click.setBounds(400,400,300,70);
    click.setBackground(Color.BLACK);
    click.setForeground(Color.WHITE);
    click.addActionListener(this);
    image.add(click);
    add(image);
    add(lable);
    setVisible(true);
    while(true){
    lable.setVisible(false);
    try{
    Thread.sleep(500);
    }catch(InterruptedException e){
    
    }
    lable.setVisible(true);
    try{
    Thread.sleep(500);
    }catch(InterruptedException e){
    
    }
    }
    }
    @Override
    public void actionPerformed(ActionEvent e){
        setVisible(false);
        
        new Login();
    }
public static void main(String args[]){
new Welcome();

        }    
}
