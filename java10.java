
// topic-> more about interface -> its for designing classes ig


interface A{
    // by default every method is public abstract 
    // all variables in here are  final static by default
    void hi();
    void by();
}

class B implements A{

    @Override
    public void hi() {
        System.out.println("hi");
    }

    @Override
    public void by() {
        System.out.println("by");
    }

}

public class java10 {
    public static void main(String[] args) {
        A obA; // u can create reference variable of interface but not the object
        B oB = new B();
        oB.hi();
    }
}
