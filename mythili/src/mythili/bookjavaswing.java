package mythili;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class bookjavaswing extends JFrame implements ActionListener {
    static JFrame f; 
    static JPanel p4;
    static JTabbedPane tp1;
    static JTabbedPane tp2;
    bookjavaswing()
    {
    }
    public static void main(String[] args)
    {
       
        f = new JFrame("BUS BOOKING SERVICE");
        JLabel l = new JLabel();
        l.setText("BOOK MY BUS");
        l.setBounds(200,10,100,100);
        JLabel l1 = new JLabel();
        l1.setText("From");
        l1.setBounds(170,50,80,80);
        String cities[]={"Tirupur","Erode","salem","Dharmapuri","Trichy"};
        JComboBox cb=new JComboBox(cities);
        cb.setBounds(170,100,90,20);
        JLabel l2 = new JLabel();
        l2.setText("To");
        l2.setBounds(280,30,100,120);
        JComboBox cb1=new JComboBox(cities);
        cb1.setBounds(280,100,90,20);
        JLabel l3 = new JLabel();
        l3.setText("Depart on");
        l3.setBounds(170,50,180,180);
        JTextField ta=new JTextField(10);
        ta.setBounds(170,150,100,20);
        JLabel l4 = new JLabel();
        l4.setText("No of Passengers");
        l4.setBounds(170,50,280,280);
        JTextField ta1=new JTextField(10);
        ta1.setBounds(170,200,100,20);
        JLabel l5 = new JLabel();
        l5.setText("Seat options");
        l5.setBounds(170,150,180,180);
        DefaultListModel<String> list1 = new DefaultListModel<>();  
          list1.addElement("Cama");  
          list1.addElement("Semi-Cama");  
          list1.addElement("Normal");   
          JList<String> list = new JList<>(list1);  
          list.setBounds(170,260, 75,75);
          JButton b=new JButton("Next");  
          b.setBounds(200,370,95,30);
          JLabel l11 = new JLabel();
          l11.setText("BUS BOOKING SERVICE");
          l11.setBounds(200,10,200,100); 
          JLabel l12 = new JLabel();
        l12.setText("Name");
        l12.setBounds(170,50,180,180);
        JTextField ta11=new JTextField(10);
        ta11.setBounds(170,150,100,20);
        JLabel l13 = new JLabel();
        l13.setText("Mail id");
        l13.setBounds(170,50,280,280);
        JTextField ta12=new JTextField(10);
        ta12.setBounds(170,200,100,20); 
        JPasswordField value = new JPasswordField();   
        JLabel l14=new JLabel("Password:");    
        l14.setBounds(170,50,380,380);    
         value.setBounds(170,250,100,20);
         JButton b11=new JButton("SIGN UP");  
         b11.setBounds(120,340,95,30);
         JButton b12=new JButton("LOG IN");  
         b12.setBounds(240,340,95,30);
         JLabel l26 = new JLabel();
        l26.setText("CUSTOMER DETAILS");
        l26.setBounds(200,10,200,100);  
        JLabel l21 = new JLabel();
        l21.setText("First name");
        l21.setBounds(170,30,100,120);
        JTextField ta21=new JTextField(10);
        ta21.setBounds(170,100,90,20);
        JLabel l22 = new JLabel(); 
        l22.setText("Last name");
        l22.setBounds(280,30,100,120);
        JTextField ta22=new JTextField(10);
        ta22.setBounds(280,100,90,20);
        JLabel l23 = new JLabel();
        l23.setText("Mobile Number");
        l23.setBounds(170,100,100,120);
        JTextField ta23=new JTextField(10);
        ta23.setBounds(170,170,90,20);
        JLabel l24 = new JLabel();
        l24.setText("Mail id");
        l24.setBounds(170,160,120,120);
        JTextField ta24=new JTextField(10);
        ta24.setBounds(170,228,90,20); 
        JLabel l25=new JLabel("Gender:");    
        l25.setBounds(170,233,100,120); 
	JRadioButton r1=new JRadioButton(" Male");    
	JRadioButton r2=new JRadioButton(" Female");    
	r1.setBounds(170,300,100,30);    
	r2.setBounds(270,300,100,30);    
	ButtonGroup bg=new ButtonGroup();    
	bg.add(r1);bg.add(r2);
	JButton b21=new JButton("Done");  
    b21.setBounds(200,370,95,30);
    JLabel l44 = new JLabel();
    l44.setText("CHOOSE YOURS...");
    l44.setBounds(200,10,200,100); 
	JLabel l41 = new JLabel();
    l41.setText("Number of buses available");
    l41.setBounds(170,50,180,180);
    JTextField ta41=new JTextField(10);
    ta41.setText("3");
    ta41.setBounds(170,150,100,20);
    JLabel l42 = new JLabel();
    l42.setText("Timing");
    l42.setBounds(170,150,180,180);
    DefaultListModel<String> list41 = new DefaultListModel<>();  
          list41.addElement("9:00-12:30 ");  
          list41.addElement("10:00-13:30");  
          list41.addElement("14:00-17:30");   
          JList<String> listz = new JList<>(list41);  
          listz.setBounds(170,260, 75,75);
          JButton bz=new JButton("Next");  
          bz.setBounds(200,370,95,30);
          
          JLabel l51 = new JLabel();
          l51.setText("PAYMENT DETAILS");
          l51.setBounds(200,10,200,100);
          JLabel l52 = new JLabel();
          l52.setText("Cardholder name");
          l52.setBounds(170,30,100,120);
          JTextField ta51=new JTextField(10);
          ta51.setBounds(170,100,130,30);
          JLabel l53 = new JLabel();
          l53.setText("Card Number");
          l53.setBounds(170,100,100,120);
          JTextField ta52=new JTextField(10);
          ta52.setBounds(170,170,130,30);
          JLabel l54 = new JLabel();
          l54.setText("End date");
          l54.setBounds(170,150,180,180);
          String month[]={"01","02","03","04","05","06","07","08","09","10","11","12"};
          JComboBox cb51=new JComboBox(month);
          cb51.setBounds(170,260, 75,30);
          String year[]={"2020","2021","2022","2023","2024","2025","2026","2027","2028"};
          JComboBox cb52=new JComboBox(year);
          cb52.setBounds(260,260, 75,30);
          JPasswordField value1 = new JPasswordField();   
          JLabel l55=new JLabel("CCV");    
          l55.setBounds(170,300,100,30);    
         value1.setBounds(170,330,130,30);
         JButton b51=new JButton("Done");  
         b51.setBounds(200,390,95,30);
        JPanel p = new JPanel(null);
JPanel p1 = new JPanel(null);
JPanel p2 = new JPanel(null);
JPanel p3 = new JPanel(null);
p4 = new JPanel(null);
 tp1=new JTabbedPane();
tp1.setBounds(0,0,500,500);
tp2=new JTabbedPane();




	b11.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            tp1.setSelectedIndex(1); 
    }  
    });  
	b12.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            tp1.setSelectedIndex(2); 
    }  
    });  
	b21.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            tp1.setSelectedIndex(2); 
    }  
    });  
	b.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            tp1.setSelectedIndex(3); 
    }  
    });  
	bz.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            tp1.setSelectedIndex(4); 
    }  
    });  



	p.add(l11);
	p.add(l12);
	p.add(ta11);
	p.add(l13);
	p.add(ta12);
	p.add(value); 
	p.add(l14);
	p.add(b11);
	p.add(b12);
	p1.add(l26);
	p1.add(l21); 
	p1.add(ta21);
	p1.add(l22); 
	p1.add(ta22);
	p1.add(l23); 
	p1.add(ta23);
	p1.add(l24); 
	p1.add(ta24);
	p1.add(l25);
        p1.add(r1);
	p1.add(r2);
	p1.add(b21);
p2.add(l);
p2.add(l1);
p2.add(l2);
p2.add(cb);
p2.add(cb1);
p2.add(l3);
p2.add(ta);
p2.add(l4);
p2.add(ta1);
p2.add(l5);
p2.add(list);
p2.add(b);
p3.add(l44);
p3.add(l41);
p3.add(ta41);
p3.add(l42);
p3.add(listz);
p3.add(bz);
p4.add(l51);
p4.add(l52);
p4.add(ta51);
p4.add(l53);
p4.add(ta52);
p4.add(l54);
p4.add(cb51);
p4.add(cb52);
p4.add(value1); 
p4.add(l55);
p4.add(b51);
f.add(p);
f.add(p1);
f.add(p2);
f.add(p3);
f.add(p4);
tp1.add("Login",p);
tp1.add("Provider details",p1);
tp1.add("Booking",p2);
tp1.add("Availability",p3);
tp1.add("Payment",p4);
f.add(tp1);
        f.setSize(500, 500);
f.setLayout(null);
        f.show();
	
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}