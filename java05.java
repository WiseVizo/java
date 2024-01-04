

// topic -> abstract class 

abstract class A {
    abstract public void sayhi(); //note-> only abstract class can have abstract methods
    public void sayBy(){
        System.out.println("bye");
    }
}

class B extends A{ // note-> any class that extends abstract class need to implement abstract methods of A unless they are abstract class themself 
    public void sayhi(){
        System.out.println("hi");
    }

}

public class java05 {
    public static void main(String[] args) {
        // A obj = new A(); // error -> u can't make objects of abstract classes
        B objB = new B();
        objB.sayhi();
        objB.sayBy();
    }
}
