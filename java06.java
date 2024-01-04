
// topic-> inner class
class A{
    public void main(){
        System.out.println("hi");
    }
     class B{ // inner class of A. and B cannot be accessed directly like normal classes 
        public void config(){
            System.out.println("configuring...");
        }
    }
}

public class java06 {
    public static void main(String[] args) {
        A obA = new A();
        obA.main();
        // for accessing inner class B
        A.B objB =  obA.new B();
        objB.config();
        // if inner class is static 
        // A.B obj = new A.B();
        // obj.config();
    }
}
