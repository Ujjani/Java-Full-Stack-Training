import java.util.*;

 class StackDemo
 {
	public static void main(String[] args)
	{
		Stack s=new Stack();
		s.push(22);
		s.push(44);
		s.push(55);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
	
	}
 }