import java.util.*;
class SetDemo
{
	public static void main(String[] args)
	{
		HashSet hs=new HashSet();
		hs.add(121);
		hs.add(121);
		hs.add("Hi");
		hs.add("Hello");
		hs.add(12.121);
		System.out.println(hs);
	}
}