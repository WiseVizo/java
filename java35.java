

// HashTable -> same as HashMap so why create it ? it should be used when multiple threads are ascessing a HashMap. that's all ik for now

import java.util.Hashtable;

public class java35 {
    
    public static void main(String[] args) {
        Hashtable <String, Integer> ar = new Hashtable <String, Integer>();
        ar.put("student1", 10);
        ar.put("student2", 200);
        ar.put("student3", 30);
        ar.put("student4", 40);
        System.out.println(ar.values()); // returns all values in a Set

}
}
