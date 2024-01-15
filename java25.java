
// try with resources -> with this we can close resources without using finally block

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class java25{
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) // any resources defined here will automatically be closed after execution of try block
        {
            System.out.println("enter: ");
            int i = Integer.parseInt(br.readLine());
            System.out.println(i);
        }
    }
}
