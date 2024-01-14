
// taking number input from user finally

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java23 {
    public static void main(String[] args) throws IOException {
        System.out.println("enter a number: ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);
        // can't understand shit ? https://youtu.be/bwHr9G5VIls?si=NHUZJ4HTYZCDTH-y 
    }
}
