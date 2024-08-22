import java.util.*;
 class VectorDemo
 {
	public static void main(String[] args)
	{
		Vector v=new Vector(2);
		int n1=v.capacity();
		System.out.println("Capcity of Vector"+ n1);
		v.add(211);
		v.add(25);
		v.add(532);
		int n2=v.capacity();
		System.out.println(v);
		System.out.println("Capcity of Vector"+ n2);
	}
 }