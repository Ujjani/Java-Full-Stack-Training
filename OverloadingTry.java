class Test{
	void dog(String name)
	{	
		System.out.println("Dog name is :"+ name);
	}
	
	void dog(String name, String color)
	{	
		System.out.println("Dog name is :"+ name+ " & Color of Dog is "+ color);
	}

}

class OverloadingTry{

	public static void main(String[] args){
	Test t=new Test();
	t.dog("Coco");
	t.dog("Coco", "White");
	
	}
		

}