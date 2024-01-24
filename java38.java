
// Stream why? gives a lot of useful methods like filter map reduce and it allows us to use list data without mutating it 

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class java38 {
    public static void main(String[] args) {
        List <Integer> myli = Arrays.asList(1, 2, 3, 5);
        Stream <Integer> s1 = myli.stream(); // creating Stream obj
        Stream<Integer> s2 = s1.map(n-> n*2); // returns a new stream also u can only use 1 stream once 
        s2.forEach(n-> System.out.println(n));

    }
}
