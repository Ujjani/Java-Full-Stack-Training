class Test2{
	void show()
	{
	System.out.println("Parent class method called");
	
	}

}

class Test extends Test2{
	
	
	void show(){
		
		super.show();
		System.out.println("child class method called");
	}
}

class TryOverriding{
	public static void main(String[] args) {
	Test t=new Test();
	t.show();
	//Test2 w=new Test2();
	//w.show();
	
	}
}