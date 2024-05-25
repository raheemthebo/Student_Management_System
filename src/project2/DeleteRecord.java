

package project2;

import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class DeleteRecord extends JFrame implements ActionListener {
    Choice cmbid;
    JTextField tbname,tbfather,tbphone;
    JButton delete,back;
    
    
    public DeleteRecord(){
    setSize(1000,400);
    setLocationRelativeTo(null);
    setLayout(null);
    JLabel lblid=new JLabel("Student ID");
    lblid.setBounds(30,30,100,50);
    add(lblid);
    
    cmbid=new Choice();
    cmbid.setBounds(140,40,150,30);
    
    
    try{
    Conn n=new Conn();
    String query="select * from Student";
    ResultSet rs=n.s.executeQuery(query);
    while(rs.next()){
    cmbid.add(rs.getString("emoid"));
    }
    }catch(Exception e){e.printStackTrace();}
    add(cmbid);
    
    JLabel lblname=new JLabel("Name ");
    lblname.setBounds(30,90,50,30);
    add(lblname);
    
    tbname=new JTextField();
    tbname.setBounds(140,90,150,30);
    tbname.setEnabled(false);
    add(tbname);
    
    JLabel lblfather=new JLabel("Father");
    lblfather.setBounds(30,130,50,50);
    add(lblfather);    
    
    tbfather=new JTextField();
    tbfather.setBounds(140,140,150,30);
    tbfather.setEnabled(false);
    add(tbfather);

    JLabel lblphone=new JLabel("Phone");
    lblphone.setBounds(30,170,50,50);
    add(lblphone);
    
    tbphone=new JTextField();
    tbphone.setEnabled(false);
    tbphone.setBounds(140,180,150,30);
    add(tbphone);
    getContentPane().setBackground(Color.WHITE);
    try{
    Conn n=new Conn();
    String query="select * from Student where emoid ='"+cmbid.getSelectedItem()+"'";
    ResultSet rs=n.s.executeQuery(query);
    while(rs.next()){
    tbname.setText(rs.getString("Sname"));
    tbfather.setText(rs.getString("father"));
    tbphone.setText(rs.getString("phone"));
    
    
    }
    }catch(Exception e){
            e.printStackTrace();}
    cmbid.addItemListener(new ItemListener(){
    public void itemStateChanged(ItemEvent ie){
        try{
    Conn n=new Conn();
    String query="select * from Student where emoid ='"+cmbid.getSelectedItem()+"'";
    ResultSet rs=n.s.executeQuery(query);
    while(rs.next()){
    tbname.setText(rs.getString("Sname"));
    tbfather.setText(rs.getString("father"));
    tbphone.setText(rs.getString("phone"));
    
    
    }
    }catch(Exception e){
            e.printStackTrace();}
        
        
    }
    });
    
    delete=new JButton("Delete Record");
    delete.setBounds(140,250,150,30);
    delete.setBackground(Color.BLACK);
    delete.setForeground(Color.WHITE);
    delete.addActionListener(this);
    delete.setFont(new Font("SERIF",Font.PLAIN,20));
    add(delete);

    back=new JButton("Back");
    back.setBounds(310,250,150,30);
    back.setBackground(Color.BLACK);
    back.setForeground(Color.WHITE);
    back.addActionListener(this);
    back.setFont(new Font("SERIF",Font.PLAIN,20));
    add(back);    
    
    setVisible(true);
    
    }

    @Override
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==delete){
            try{
            Conn n=new Conn();
            String query="delete from Student where emoid='"+cmbid.getSelectedItem()+"'";
            n.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Record Deleted Successfully");
            setVisible(false);
            new Home();
            
            }catch(Exception e){e.printStackTrace();}
                
            }else if(ae.getSource()==back){
            setVisible(false);
            new Home();
            }
        }
public static void main(String args[]){
new DeleteRecord();
}
}
