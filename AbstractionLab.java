abstract class Test{
		//abstract method
		abstract void Coffee();
		
		//complete method 
		void Tea(String type)
		{
			System.out.println("Hi, I am "+ type+" Tea");
		
		}

}

class Test2 extends Test{
		void Coffee(){
			System.out.println("Hi, I am Coffee");
			
		}

}

class AbstractionLab{

	public static void main(String[] args){
	Test2 t=new Test2();
	
	t.Coffee();
	t.Tea("Ginger");
	}


}