
// Consumer interface and forEach() 


import java.util.Arrays;
import java.util.List;

public class java37 {
    public static void main(String[] args) {
        List <Integer> myli = Arrays.asList(1, 2, 3, 5); // asList -> list obj
        myli.forEach(n->System.out.println(n+1)); // for Each takes Consumer obj
    }
}
