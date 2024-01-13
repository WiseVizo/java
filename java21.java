
// custom exceptions

class myException extends Exception{
    public myException(String s){
        super(s); // passing string/error_msg to super class
    }
}

public class java21 {
    public static void main(String[] args) {
        int i = 10;
        int j;
        try {
            j = i/10;
            if (j==1)
                throw new myException("no 1s error");
            
        }
        catch (myException  e){
            System.out.println(e);
        }
         catch (Exception e) {
            System.out.println(e);
        }
    }
}