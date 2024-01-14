
// ducking an exception using throws keyword

class A{
    public void show()throws ArithmeticException{ 
        int i = 10/0;
        System.out.println("bye");
    }
}

class B extends A{
    public void hi() throws ArithmeticException{
        this.show(); // hi() method is calling show() so it either need to catch exception using try catch or throw it to higher lvl
        System.out.println("hi");
    }

}

public class java22 {
    public static void main(String args[]){
        B b = new B();
        try{
            b.hi(); // b is calling hi() so we need to catch exception here
        } catch (ArithmeticException e) {
            System.out.println("gotcha");
        } 
        System.out.println("later");
    }
}
