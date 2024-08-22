
interface MyInterface {
    void method1();
    void method2();
}


class MyClass implements MyInterface {
    
    //Override
    public void method1() {
        System.out.println("Implementation of method1");
    }

    //Override
    public void method2() {
        System.out.println("Implementation of method2");
    }
    
    // You can also add other methods specific to MyClass
    public void additionalMethod() {
        System.out.println("Additional method in MyClass");
    }
}


public class Day2LabInterface {
    public static void main(String[] args) {
        // Instantiate MyClass
        MyClass myObject = new MyClass();
        
        // Call methods defined in MyInterface
        myObject.method1();
        myObject.method2();
        
        // Call additional method in MyClass
        myObject.additionalMethod();
    }
}
