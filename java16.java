
// functional interface -> if interface only got 1 method it is called functional interface 

interface A{
    void main();
}



public class java16 {
    public static void main(String[] args) {
        A ob = ()->System.out.println("hi"); // it was only possible caz of functional interface
        // above line is same as this also its called lamda 
        A ob1 = new A(){
            public void main(){
                System.out.println("hi");
            }
        };
    }
}
