
// try with multiple catch



public class java19 {
    public static void main(String[] args) {
        int i = 8;
        int j = 0;
        int arr[] = new int[5];
        try{
            j = 10/i;
            System.out.println(j);
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println("can't divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index out of range");
        }
        System.out.println("bye");
    }
}
