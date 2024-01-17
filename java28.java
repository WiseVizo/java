
// Runnable vs Threads  note-> runable is Functionalinterface(with run method) which class thread implements 



class A implements Runnable{
    public void run(){
        int arr[] = new int[100];
        for(int i : arr){
            System.out.println("hi");
        }
    }
}

class B implements Runnable{
    public void run(){
        int arr[] = new int[100];
        for (int i: arr){
            System.out.println("hello");
        }
    }
}

public class java28 {
    public static void main(String[] args) {
        // since runnable don't hv start method we need to create threads and pass runnable object 
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());
        t1.start();
        t2.start();
    }
}
// outro -> we use runnable caz threads stops us from extending from other classes since multiple inheritance is not possible without interfaces 

