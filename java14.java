
// enum with methods and private constructor

enum Laptop{
    Lap1(200), Lap2(300), Lap3;
    private int price;
    private Laptop(int price){ // lap1, 2 will call this comstructor
        this.price = price;
    }
    private Laptop(){ // lap3 will call this one
        this.price = 500;
    }
    // u can access prices or set them using getters and setters 
    
}

public class java14 {
    public static void main(String[] args) {
        
    }
}
