
// thread priority -> in java it varies from 1 to 10. 1 being least and 10 being most and 5 is default priority


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

public class java27 {
     public static void main(String[] args) {
        A th1 = new A();
        B th2 = new B();
        // even tho we are giving th1 more priority its just a suggestion to our cpu scheduler and th2 might even execute before 
        th1.setPriority(7);
        th2.setPriority(1);
        th1.start(); 
        th2.start();
    }
}
