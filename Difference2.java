class Difference2{
	// Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
	}
	
	// Instance method
    void instanceMethod() {
        System.out.println("This is an instance method.");
    }

	// Constructor
    Difference2() {
        System.out.println("This is a constructor.");
        
    }
	
	public static void main(String[] args) {
	// Call static method directly using the class name
        Difference2.staticMethod();
		
		// Create an instance of Difference class
        Difference2 obj1 = new Difference2();
		obj1.instanceMethod();
	
	
	}
}