import java.util.*;

public class LambdaExpressionDemo
{
	public static void main(String[] args)
	{
		List<String> list=new ArrayList<String>();
		list.add("ankita");
		list.add("mayank");
		list.add("irfan");
		list.add("jai");
		
		list.forEach(
			(i)->System.out.print(i+"  ")
		);
	}
}