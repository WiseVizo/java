
// throw keyword

public class java20 {
    public static void main(String[] args) {
        int i = 10;
        int j;
        try {
            j = i/10;
            if (j==1)
                throw new ArithmeticException("no 1s error");
            
        }
        catch (ArithmeticException  e){
            System.out.println(e);
        }
         catch (Exception e) {
            System.out.println(e);
        }
    }
}
