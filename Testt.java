import java.awt.*;
import java.awt.event.*;
class Testt extends Frame implements ActionListener{
	Testt(){
	setSize(400,400);
	setVisible(true);
	Button b1=new Button("Click it");
	setLayout(new FlowLayout());
	setBackground(Color.yellow);
	add(b1);
	b1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae){
		System.out.println("BUTTON CLICKED");
	}
	
	public static void main(String[] args)
	{
		new Testt();
	}

}

