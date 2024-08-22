class Difference {
    // Static variable
    static int staticVariable = 0;

    // Instance variable
    int instanceVariable;

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
        System.out.println("Static variable: " + staticVariable);
        // Instance methods and instance variables cannot be accessed directly
        // from static methods without creating an instance of the class.
        // Uncommenting the following line will cause a compile-time error:
        // System.out.println("Instance variable: " + instanceVariable);
    }

    // Instance method
    void instanceMethod() {
        System.out.println("This is an instance method.");
        System.out.println("Instance variable: " + instanceVariable);
        // Static methods and variables can be accessed from instance methods.
        System.out.println("Static variable: " + staticVariable);
    }

    // Constructor
    Difference(int initialValue) {
        System.out.println("This is a constructor.");
        instanceVariable = initialValue;
        staticVariable++; // Increment static variable
    }

    public static void main(String[] args) {
        // Call static method directly using the class name
        Difference.staticMethod();
System.out.println("in main");
        // Create an instance of Difference class
        Difference obj1 = new Difference(10);
        Difference obj2 = new Difference(20);
System.out.println("in main");
        // Call instance method using the instance
        obj1.instanceMethod();
        obj2.instanceMethod();

        // Access and print static variable through class name
        System.out.println("Static variable after creating instances: " + Difference.staticVariable);
    }
}
