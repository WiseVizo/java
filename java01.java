// Run time polymorphism

class A {

    public void show(){
        System.out.println("In A");
    }
    
}

class B extends A{
    public void show(){
        System.out.println("In B");
    }
}


public class java01 {
    public static void main(String a[]){

        A obj = new A(); 
        B obj1 = new B(); // valid
        // A obj = new B(); // valid Caz A is super class of B
        // B obj = new A(); // invalid; child class reference can't have parent class object
        obj.show();
        obj1.show();
    }
}
