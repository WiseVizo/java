
// topic -> anonymous inner class with abstract class

abstract class A{
    public abstract void main();
}

public class java08{
    public static void main(String[] args) {
        A ob = new A() {
            public void main(){
                System.out.println("hi");
            }
        };
        ob.main();
    }
}