
package project2;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class AddStudent extends JFrame implements ActionListener{
    JTextField tbname,tbfather,tbdob,tbsalary,tbaddress,tbphone,tbaemail,tbDesignation,tbcnic;
    Random ran=new Random();
    int number=ran.nextInt(9999);
    JButton btnadd,btnback;
    JComboBox cmbedu;
    JLabel lblStudentId;
    JLabel lblId;
    
    AddStudent(){
    getContentPane().setBackground(Color.GRAY);
    setSize(900,700);
    setLayout(null);
    setLocationRelativeTo(null);
    
    JLabel lbltitle=new JLabel("Add Student Record");
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
   
    JDateChooser dcdob = new JDateChooser(); 
    dcdob.setBounds(150,220,170,30);
    add(dcdob);
    
    //tbdob=new JTextField();
    //tbdob.setBounds(150,220,170,30);
    //add(tbdob);
    
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
    
    String courses[]={"BSCS","BBA","MBA"};
    cmbedu=new JComboBox(courses);
    cmbedu.setBounds(500,340,170,30);
    add(cmbedu);
    
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
    
  
    
    lblId =new JLabel(""+number);
    lblId.setBounds(150,440,120,50);
    lblId.setFont(new Font("SERIF",Font.PLAIN,20));
    lblId.setForeground(Color.WHITE);
    add(lblId);   
    
    btnadd =new JButton("Add Record");
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
    String edu= (String) cmbedu.getSelectedItem();
    String stdid=lblId.getText();
    try{
    Conn n=new Conn();
    String query="insert into Student values ('"+ name+"','"+father+"','"+dob+"','"+phone+"','"+ salary+"','"+address+"','"+email+"','"+designation+"','"+cnic+"','"+edu+"','"+stdid+"' )";
    int a=n.s.executeUpdate(query);
    if(a>0){
    JOptionPane.showMessageDialog(null, "Data Inserted");
    setVisible(false);
    new Home();
    }else{
    JOptionPane.showMessageDialog(null,"Data Not Inserted");
    }
   
    
    }catch(Exception a){    a.printStackTrace();}
    
        
    }else if(ae.getSource()==btnback){
    setVisible(false);
    new Home();
    }
    }
    public static void main(String args[]){
    new AddStudent();
    }
}
