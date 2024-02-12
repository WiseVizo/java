import java.util.Scanner;

public class test01 {
    public static void main(String args[]){
        System.out.println("enter a number: ");
        String i ;
        Scanner s = new Scanner(System.in);
        i = s.nextLine();
        System.out.println("ur num was : "+i +" : "+ i.length());
    }
}
