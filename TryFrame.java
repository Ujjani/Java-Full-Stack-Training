import java.awt.*;

class TryFrame{
	public static void main(String[] args){
	 Frame f=new Frame("Frame Demo");
	 f.setVisible(true);
	 f.setBackground(Color.red);
	 f.setSize(500,500);
	 Button b1=new Button("Button1");
	 f.add(b1);
	 f.setLayout(new GridLayout(2,2));
	 
	 
	}

}