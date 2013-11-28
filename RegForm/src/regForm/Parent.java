package regForm;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

import javax.swing.JOptionPane;
import javax.swing.text.html.Option;
public class Parent extends Frame implements ActionListener
{
  String msg;
  Button b1=new Button("save");
  Label r11=new Label("Parent details",Label.CENTER);
  Label r1=new Label("Name:",Label.LEFT);
  Label r3=new Label("Gender(M/F):",Label.LEFT);
  Label r4=new Label("Address:",Label.LEFT);
  Label r5=new Label("Occupation:",Label.LEFT);
  Label r8=new Label("Tel_Number:",Label.LEFT);
  Label r7=new Label("",Label.RIGHT);
  
  TextField t1=new TextField();
  Choice c1=new Choice();
  TextField t2=new TextField();
  Choice c2=new Choice();
  TextField t3=new TextField();
  Choice c3=new Choice();
  TextField t4 =new TextField();
  Choice c4 = new Choice();
  
  CheckboxGroup cbg=new CheckboxGroup();
  Checkbox ck1=new Checkbox("Male",false,cbg);
  Checkbox ck2=new Checkbox("Female",false,cbg);
 
  
public Parent()
 {
  addWindowListener(new myWindowAdapter());
  setBackground(Color.gray);
  setForeground(Color.black);
  setLayout(null);
  add(r11);
  add(r1);
  add(r3);
  add(r4);
  add(r5);
  add(r7);
  add(r8);
  add(t1);
  add(t2);
  add(t3);
  add(t4);
  add(ck1);
  add(ck2);
  add(b1);
  
  b1.addActionListener(this);
  r1.setBounds(25,65,90,20);
  r3.setBounds(25,120,90,20);
  r4.setBounds(25,185,90,20);
  r5.setBounds(25,260,90,20);
  r7.setBounds(25,260,90,20);
  r8.setBounds(25,300,90,100);
  r11.setBounds(10,40,280,20);
  t1.setBounds(120,65,170,20);
  t2.setBounds(120,185,170,60);
  t3.setBounds(120,250,170,60);
  t4.setBounds(120,350,150,40);
  ck1.setBounds(120,120,50,20);
  ck2.setBounds(170,120,60,20);
  b1.setBounds(120,400,100,40);
}

public void actionPerformed(ActionEvent make)
{
	if(make.getActionCommand().equals("save"))
  {
		JOptionPane.showMessageDialog(null, "Saved!");
		msg="Parents details saved!";
   setForeground(Color.red);
   }
}
public static void main(String g[])
{Parent par=new Parent();
 par.setSize(new Dimension(500,500));
 par.setTitle("Parent registration");
 par.setVisible(true);
}
}
 class myWindowAdapter2 extends WindowAdapter
{
	public void windowClosing(WindowEvent we)

 
 {
  System.exit(0);
 }
}