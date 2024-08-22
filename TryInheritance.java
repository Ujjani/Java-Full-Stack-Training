//multiple inheritance using interface

interface I1{
	void show();
}

class Test implements I1{
	public void show(){
	System.out.println("show method called");
	
	}

}

class TryInheritance {
	public static void main(String[] args){
			Test t=new Test();
			t.show();
	
	}
}