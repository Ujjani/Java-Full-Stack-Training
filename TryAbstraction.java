abstract class Abs{
	abstract void show();
	
	void disp(){
	System.out.println("COMPLETE METHOD OF ABSTRACT CLASS");
		
	
	}
	

}

class Test extends Abs{
	void show(){
	System.out.println("ABSTRACT METHOD OF TEST CLASS");
	}

}

class TryAbstraction{
	public static void main(String[] args){
	Test t=new Test();
	
	t.show();
	t.disp();	
	}
}