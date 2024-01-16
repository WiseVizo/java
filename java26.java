
// threads -> used to run tasks in parllel 

class A extends Thread{
    public void run(){ // method name has to be run
        int arr[] = new int[100];
        for(int i : arr){
            System.out.println("hi");
        }
    }
}

class B extends Thread{
    public void run(){ // method name has to be run
        int arr[] = new int[100];
        for(int i : arr){
            System.out.println("hello");
        }
    }
}

public class java26 {
    public static void main(String[] args) {
        A th1 = new A();
        B th2 = new B();
        // with the help of below lines both run() methods are running in parllel as we can see in output
        th1.start(); // method from thread class
        th2.start();
    }
}
