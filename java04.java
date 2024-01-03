// wrapper class and boxing / unboxing
// wraapper class -> to store every premitive value there is a class called wrapper class in java like int(value) -> Integer(class)

public class java04 {
    public static void main(String[] args) {
        int n = 7;
        Integer n2 = new Integer(8); // called boxing
        Integer n3 = 8; // auto boxing. bts its same as boxing 

        int n4 = n3.intValue(); // unboxing
        int n5 = n3; // auto unboxing 
    }
}
