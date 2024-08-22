import java.awt.*;
import javax.swing.*;

class TryFrame2
	{
		public static void main(String[] args)
		{
			Frame f=new Frame("Notepad");
			f.setVisible(true);
			TextArea t=new TextArea();
			f.setSize(500,500);
			MenuBar mb=new MenuBar();
			f.setMenuBar(mb);
			f.add(t);
			
			//creating menus
			
			Menu m1=new Menu("File");
			Menu m2=new Menu("Edit");
			Menu m3=new Menu("View");
			Menu m4=new Menu("Search");
			Menu m5=new Menu("Help");
			
			//adding menus to menubar
			mb.add(m1);
			mb.add(m2);
			mb.add(m3);
			mb.add(m4);
			mb.add(m5);
			
			//creating menuitems
			MenuItem i1=new MenuItem("New");
			MenuItem i2=new MenuItem("Open");
			MenuItem i3=new MenuItem("Save");
			MenuItem i4=new MenuItem("SaveAs");
			MenuItem i5=new MenuItem("Exit");
			
			//adding menuitem to fieldmenu
			m1.add(i1);
			m1.addSeparator();
			m1.add(i2);
			m1.add(i3);
			m1.addSeparator();
			m1.add(i4);
			m1.add(i5);
	
		}
}