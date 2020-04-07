import javax.swing.*;
class  twobuttons
{	
	public static void main(String[] args) 
	{
		JFrame f=new JFrame();
		JFrame e=new JFrame();
		JButton b=new JButton("click");
		JLabel c=new JLabel("hello welcome to swing");
		b.setBounds(100,100,150,30);
		c.setBounds(100,100,150,30);
		f.add(b);
		e.add(c);
		f.setSize(400,500);
		e.setSize(600,600);
		f.setLayout(null);
		e.setLayout(null);
		f.setVisible(true);
		e.setVisible(true);
	}
}
