package project2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Home extends JFrame implements ActionListener{
    JButton btnadd,btnupdate,btnview,btndelete;
    Home(){
        setLayout(null);
    setSize(1120,700);
    setLocation(100,20);
    setTitle("DashBoard");
    ImageIcon img1=new ImageIcon("E:\\Pic\\Home.jpg");
    Image img2= img1.getImage().getScaledInstance(1120, 700,Image.SCALE_DEFAULT);
    ImageIcon img3=new ImageIcon(img2);
    JLabel image=new JLabel(img3);
    image.setBounds(0,0,1120,700);
    
    add(image);
    
    JLabel lbltitle=new JLabel("Student Management System");
    lbltitle.setBounds(200,20,800,100);
    lbltitle.setForeground(Color.WHITE);
    lbltitle.setFont(new Font("serif",Font.PLAIN,60));
    image.add(lbltitle);
    
     btnadd=new JButton("Insert");
    btnadd.setBounds(600,150,150,50);
    btnadd.addActionListener(this);
    
     btnupdate=new JButton("Update");
    btnupdate.setBounds(770,150,150,50);
    btnupdate.addActionListener(this);
    
     btndelete=new JButton("Delete");
    btndelete.setBounds(600,220,150,50);
    btndelete.addActionListener(this);
    
     btnview=new JButton("View");
    btnview.setBounds(770,220,150,50);
    btnview.addActionListener(this);
    
    image.add(btndelete);
    image.add(btnview);
    image.add(btnupdate);
    
    image.add(btnadd);
    setVisible(true);
    
    }
    @Override
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource() ==btnadd){
    setVisible(false);
    new AddStudent();
    }else if(ae.getSource()==btnupdate){
    setVisible(false);
    new ViewStudentRecord();
    }else if(ae.getSource()==btndelete){
        setVisible(false);
        new DeleteRecord();
    }else if(ae.getSource()==btnview){
    setVisible(false);
    new ViewStudentRecord();
    
    }
    }
public static void main(String args[]){
    new Login();
	

}    
}
