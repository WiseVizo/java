
// lambda with retrun

interface A{
    int add(int n1, int n2);
}

public class java17 {
    public static void main(String[] args) {
        A ob = (a, b)->{
            return a + b; 
        };
        // or
        A ob1 = (a, b)-> a+b;  // if only 1 line in method body we can omit {} and if only return statement is there we can also omit {} and return keyword

        System.out.println(ob1.add(2, 3));
        System.out.println(ob.add(2, 3));

    }
}
