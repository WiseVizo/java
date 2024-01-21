import java.util.HashMap;

public class java34 {
    public static void main(String[] args) {
        HashMap <String, Integer> ar = new HashMap<String, Integer>();
        ar.put("student1", 10);
        ar.put("student2", 20);
        ar.put("student3", 30);
        ar.put("student4", 40);

        // System.out.println(ar); // printing whole map
        // System.out.println(ar.get("student2")); // accessing via keys
        // System.out.println(ar.keySet()); // prints all the keys in a Set datastructure
        System.out.println(ar.values()); // returns all values in a Set

    }
}
