
// Iterator -> gives u an iterator with .hasnext() and .next()

import java.util.Collection;
import java.util.TreeSet;
import java.util.Iterator;

public class java33 {
    public static void main(String[] args) {
        Collection <Integer> ar = new TreeSet<Integer>();
        ar.add(1);
        ar.add(200);
        ar.add(30);
        ar.add(4);
        ar.add(5);

        Iterator<Integer> values = ar.iterator(); // values is iterator now
        while (values.hasNext()) {
            System.out.println(values.next());
        }

    }
}
