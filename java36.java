
// comparator -> can be used to define logic for sort()

import java.util.ArrayList;
import java.util.Comparator;

public class java36 {
    public static void main(String args[]){
        ArrayList <Integer> ar = new ArrayList<>();
        ar.add(99);
        ar.add(98);
        ar.add(97);
        ar.add(96);
        ar.add(94);

        Comparator <Integer> cr = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if(i<j){
                    return -1; // -1 if u don't want  to swap
                } 
                return 1; // 1 if u want to swap
            }
        };
        System.out.println(ar);
        ar.sort(cr);
        System.out.println(ar);
        }
    }

