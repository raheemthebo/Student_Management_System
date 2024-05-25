package project2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import net.proteanit.sql.DbUtils;
import java.sql.*;
public class ViewStudentRecord extends JFrame implements ActionListener  {
    JTable tb;JLabel lblsearch;
    Choice chid;
    JButton btnsearch,btnupdate,btnprint,btnback;
    
    ViewStudentRecord(){
    getContentPane().setBackground(Color.WHITE);
    setSize(900,700);
    setLayout(null);
    setLocationRelativeTo(null);
    
    tb=new JTable();
    chid= new Choice();
    chid.setBounds(180,33,150,50);
    add(chid);
    
    try{
    Conn c=new Conn();
    ResultSet rs=c.s.executeQuery("select * from Student");
    
    while(rs.next()){
    chid.add(rs.getString("emoid"));
    }
    }catch(Exception e){e.printStackTrace();}
    
    try{
    Conn c=new Conn();
    ResultSet rs=c.s.executeQuery("select * from Student");
    tb.setModel(DbUtils.resultSetToTableModel(rs));
    while(rs.next()){
    chid.add(rs.getString("emoid"));
    }
    }catch(Exception e){e.printStackTrace();}
    
    JScrollPane jsp=new JScrollPane(tb);
    jsp.setBounds(0,100,900,600);
    
    add(jsp);
    
    lblsearch=new JLabel("Search Student By ID");
    lblsearch.setBounds(20,20,150,50);
    add(lblsearch);
    
    btnsearch =new JButton("Search");
    btnsearch.setBounds(20,70,80,20);
    btnsearch.addActionListener(this);
    add(btnsearch);
   
    btnupdate =new JButton("Update");
    btnupdate.setBounds(120,70,80,20);
    btnupdate.addActionListener(this);
    add(btnupdate);   
    
    btnprint =new JButton("Print");
    btnprint.setBounds(220,70,80,20);
    btnprint.addActionListener(this);
    add(btnprint);

    btnback =new JButton("Back");
    btnback.setBounds(320,70,80,20);
    btnback.addActionListener(this);
    add(btnback);    
    
    setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == btnsearch){
        String query="select * from Student where emoid='"+chid.getSelectedItem()+"'";
        try{
        
        Conn n=new Conn();
        ResultSet rs=n.s.executeQuery(query);
        tb.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch(Exception l){
        l.printStackTrace();
        }
        }else if(ae.getSource()== btnupdate){
        setVisible(false);
        new UpdateRecord(chid.getSelectedItem());
        }else if(ae.getSource()== btnback){
            
        setVisible(false);
        new Home();
            
        }else if(ae.getSource()==btnprint){
        try{tb.print();}catch(Exception f){f.printStackTrace();}
        }
    
    }
    
    public static void main(String args[]){
    new ViewStudentRecord();
    
    }
}
