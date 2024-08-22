import java.util.*;

class PropertiesDemo{
	public static void main(String[] args)
	{
		Properties obj=new Properties();
		obj.put("Cricket","Sachin");
		obj.put("Chess", "Anand");
		System.out.println(obj);
		System.out.println(obj.getProperty("Cricket"));
		System.out.println(obj.getProperty("Chess"));
	}
}