
// ArrayList -> why? caz don't hv to pre define space beforehand

import java.util.ArrayList;
import java.util.Collection;

public class java30 {
    public static void main(String[] args) {
        Collection <Integer> ar = new ArrayList<Integer>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);

        System.out.println(ar);
    }
}
