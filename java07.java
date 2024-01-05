
// topic-> anonymous inner class
// application -> to override a method of some class without extending it

class A{
    public void sayHi(){
        System.out.println("hiii");
    }
}

public class java07 {
    public static void main(String[] args) {
        A ob = new A(){ // can't add new methods using this way only method overridding works
            public void sayHi(){
                System.out.println("noo");
            }
        };
        ob.sayHi();
    }
}
