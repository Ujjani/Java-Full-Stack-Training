class Test {
	void Dog(String name){
		System.out.println("Dog name is :"+ name);
	}

}

class Test2 extends Test{
		void Dog(String color){
		super.Dog("Coco");
		System.out.println("Color of dog is "+ color);
		}
}

class OverridingLab extends Test2{
	public static void main(String[] args){
	OverridingLab b=new OverridingLab();
	b.Dog("white");
	
	
	}


}