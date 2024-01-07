
// more interface->

interface A{
    void hi();
}

interface Ab{
    void hn();
}

interface B extends A{ // inheritance
    void no();
}

interface C extends A, Ab{ // multiple inheritance 

}

class D implements C{
    public void hi(){
        System.out.println("hi");
    }

    public void hn(){
        System.out.println("hn");
    }
}

public class java11{
    public static void main(String[] args) {
        C ob = new D();
        ob.hi();
        ob.hn();
    }
}