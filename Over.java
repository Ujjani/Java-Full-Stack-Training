class Test{
	void shape(int i)
	{
		System.out.println("Triangle"+i);
	}
	
	void shape(float j)
	{
		System.out.println("Square"+j);
	}
	
	void shape(long k)
	{
		System.out.println("Recatangle"+k);
	}

	}
	
class Over extends Test{

	public static void main(String[] args){
		 Over t=new Over();
		 t.shape(9);
		 t.shape(20f);
		 t.shape(20l);
	}


}