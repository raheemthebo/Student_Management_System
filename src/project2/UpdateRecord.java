
package project2;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class UpdateRecord extends JFrame implements ActionListener{
    JTextField tbname,tbfather,tbdob,tbsalary,tbaddress,tbphone,tbaemail,tbDesignation,tbcnic,tbedu;
    JButton btnadd,btnback;

    JLabel lblStudentId;
    JLabel lblId;
    String stdid;
    
    UpdateRecord(String stdid){
        this.stdid=stdid;
    getContentPane().setBackground(Color.GRAY);
    setSize(900,700);
    setLayout(null);
    setLocationRelativeTo(null);
    
    JLabel lbltitle=new JLabel("Update Student Record");
    lbltitle.setBounds(200,20,600,100);
    lbltitle.setFont(new Font("SERIF",Font.PLAIN,60));
    lbltitle.setForeground(Color.WHITE);
    add(lbltitle);
    
    JLabel lblname=new JLabel("Name");
    lblname.setBounds(50,150,70,50);
    lblname.setFont(new Font("SERIF",Font.PLAIN,25));
    lblname.setForeground(Color.WHITE);
    add(lblname);
    
    tbname=new JTextField();
    tbname.setBounds(150,160,170,30);
    add(tbname);
    
    JLabel lblfather=new JLabel("Father's");
    lblfather.setBounds(380,150,80,50);
    lblfather.setFont(new Font("SERIF",Font.PLAIN,25));
    lblfather.setForeground(Color.WHITE);
    add(lblfather);
    
    tbfather=new JTextField();
    tbfather.setBounds(500,160,170,30);
    add(tbfather);
    
    JLabel DOB =new JLabel("Date of Birth");
    DOB.setBounds(50,220,90,50);
    DOB.setFont(new Font("SERIF",Font.BOLD,15));
    DOB.setForeground(Color.WHITE);
    add(DOB);
    
    tbdob=new JTextField();
    tbdob.setBounds(150,220,170,30);
    add(tbdob);
    
    JLabel lblsalary=new JLabel("Salary");
    lblsalary.setBounds(380,210,80,50);
    lblsalary.setFont(new Font("SERIF",Font.PLAIN,25));
    lblsalary.setForeground(Color.WHITE);
    add(lblsalary);
    
     tbsalary=new JTextField();
    tbsalary.setBounds(500,220,170,30);
    add(tbsalary);    
    
    JLabel lbladdress =new JLabel("Address");
    lbladdress.setBounds(50,270,90,50);
    lbladdress.setFont(new Font("SERIF",Font.PLAIN,25));
    lbladdress.setForeground(Color.WHITE);
    add(lbladdress);
    
     tbaddress=new JTextField();
    tbaddress.setBounds(150,280,170,30);
    add(tbaddress);
    
    
    
    JLabel lblphone=new JLabel("Phone");
    lblphone.setBounds(380,270,80,50);
    lblphone.setFont(new Font("SERIF",Font.PLAIN,25));
    lblphone.setForeground(Color.WHITE);
    add(lblphone);
    
    tbphone=new JTextField();
    tbphone.setBounds(500,280,170,30);
    add(tbphone);
    
    JLabel lblemail =new JLabel("Email");
    lblemail.setBounds(50,330,90,50);
    lblemail.setFont(new Font("SERIF",Font.PLAIN,25));
    lblemail.setForeground(Color.WHITE);
    add(lblemail);
    
     tbaemail=new JTextField();
    tbaemail.setBounds(150,340,170,30);
    add(tbaemail);
    
    JLabel lbleducation=new JLabel("Education");
    lbleducation.setBounds(380,330,120,50);
    lbleducation.setFont(new Font("SERIF",Font.PLAIN,25));
    lbleducation.setForeground(Color.WHITE);
    add(lbleducation);
    
    
    tbedu=new JTextField();
    tbedu.setBounds(500,340,170,30);
    add(tbedu);
    
    JLabel lblDesignation =new JLabel("Designation");
    lblDesignation.setBounds(50,390,120,50);
    lblDesignation.setFont(new Font("SERIF",Font.PLAIN,20));
    lblDesignation.setForeground(Color.WHITE);
    add(lblDesignation);
    
    tbDesignation=new JTextField();
    tbDesignation.setBounds(150,400,170,30);
    add(tbDesignation);
    
      JLabel lblNic=new JLabel("CNIC");
    lblNic.setBounds(380,390,120,50);
    lblNic.setFont(new Font("SERIF",Font.PLAIN,25));
    lblNic.setForeground(Color.WHITE);
    add(lblNic);
    
    
    tbcnic=new JTextField();
    tbcnic.setBounds(500,400,170,30);
    add(tbcnic); 
    
     lblStudentId =new JLabel("Student ID");
    lblStudentId.setBounds(50,440,120,50);
    lblStudentId.setFont(new Font("SERIF",Font.PLAIN,20));
    lblStudentId.setForeground(Color.WHITE);
    add(lblStudentId);
    
  
    
    lblId =new JLabel();
    lblId.setBounds(150,440,120,50);
    lblId.setFont(new Font("SERIF",Font.PLAIN,20));
    lblId.setForeground(Color.WHITE);
    add(lblId);   
    
    btnadd =new JButton("Update Record");
    btnadd.setBounds(200,550,150,40);
    btnadd.setBackground(Color.BLACK);
    btnadd.setFont(new Font("SERIF",Font.PLAIN,20));
    btnadd.setForeground(Color.WHITE);
    btnadd.addActionListener(this);
    add(btnadd);

    btnback =new JButton("Back");
    btnback.setBounds(400,550,150,40);
    btnback.setBackground(Color.BLACK);
    btnback.setFont(new Font("SERIF",Font.PLAIN,20));
    btnback.addActionListener(this);
    btnback.setForeground(Color.WHITE);
    add(btnback);
   
    try{
    Conn n=new Conn();
    String query="select * from Student where emoid = '"+stdid+"'";
    ResultSet rs=n.s.executeQuery(query);
    while(rs.next()){
    tbname.setText(rs.getString("Sname"));
    tbfather.setText(rs.getString("father"));
    tbdob.setText(rs.getString("dob"));
    tbphone.setText(rs.getString("phone"));
    tbsalary.setText(rs.getString("salary"));
    tbaddress.setText(rs.getString("address"));
    tbaemail.setText(rs.getString("email"));
    tbDesignation.setText(rs.getString("designation"));
    tbcnic.setText(rs.getString("cnic"));
    tbedu.setText(rs.getString("edu"));
    
    lblId.setText(stdid);
    
    }
        
        
    }catch(Exception d){d.printStackTrace();}
    
    setVisible(true);
    
    }
    @Override
    public void actionPerformed(ActionEvent ae){

    if(ae.getSource()==btnadd){
    String name=tbname.getText();
    String father=tbfather.getText();
    String phone=tbphone.getText();
    String dob=tbdob.getText();
    String salary=tbsalary.getText();
    String address=tbaddress.getText();
    String email=tbaemail.getText();
    String designation=tbDesignation.getText();
    String cnic=tbcnic.getText();
    String edu= tbedu.getText();

    try{
    Conn n=new Conn();
    String query="Update Student set Sname ='"+ name+"',father = '"+father+"', dob = '"+dob+"', phone ='"+phone+"', salary = '"+ salary+"', address= '"+address+"',email = '"+email+"',designation = '"+designation+"',cnic= '"+cnic+"',edu= '"+edu+"'  where emoid= '"+stdid+"'";
    int a=n.s.executeUpdate(query);
    if(a>0){
    JOptionPane.showMessageDialog(null, "Data Updated");
    setVisible(false);
    new Home();
    }else{
    JOptionPane.showMessageDialog(null,"Data Not Updated");
    }
   
    
    }catch(Exception a){    a.printStackTrace();}
    
        
    }else if(ae.getSource()==btnback){
    setVisible(false);
    new Home();
    }
    }
    public static void main(String args[]){
    new UpdateRecord("");
    }
}
