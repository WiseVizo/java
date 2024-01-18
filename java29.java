
// synchronised , threads and race conditions 

class Counter{
    int count=0;
    public synchronized void increment(){ // synchronized will stop t1 and t2 from entering this method at same time i.e preventing race conditions
        count = count+1;
    }
}

public class java29 {
    public static void main(String[] args) throws InterruptedException{
        Counter c = new Counter();
        Runnable r1 = ()->{
            for(int i = 1; i<=10000; i++){
                c.increment();
        }};

        Runnable r2 = ()->{
            for(int i = 1; i<=10000; i++){
                c.increment();
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
        t1.join(); // join() method will stop main thread to execute further until t1 thread has merged back into main thread 
        t2.join();
        System.out.println(c.count);
    }
}
