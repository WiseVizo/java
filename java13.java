
// enum with switch case

enum status{
    running, pending, success, failed
}

public class java13 {
    public static void main(String[] args) {
        status s = status.success;
        switch (s) {
            case running:
                System.out.println("running");
                break;
            
            case pending:
                System.out.println("pls wait");
                break;
            
            case success:
                System.out.println("all done");
                break;
        

            default:
                System.out.println("failed");
                break;
        }
    }
}
