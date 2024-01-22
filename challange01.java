
// sort a array of strings in increasing order of their lengths

import java.util.ArrayList;
import java.util.Comparator;

public class challange01 {
    public static void main(String[] args) {
        ArrayList <String> ar = new ArrayList<>();
        ar.add("null000");
        ar.add("null0000");
        ar.add("null0");
        ar.add("null00");
        ar.add("null00000");

        System.out.println(ar);

        Comparator <String> cm = new Comparator<String>() {
            public int compare(String s, String j){
                if(s.length()<j.length()){
                    return -1;
                }
                return 1;
            }
        };
        ar.sort(cm);
        System.out.println(ar);
    }
}
