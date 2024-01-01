
// Multi level inheritance

class A{
    public void sayhi(){
        System.out.println("hi from a");
    }
}

class B extends A{
    public void saybye(){
        System.out.println("bye from b");
    }
}

class C extends B{

}

public class java02 {
    public static void main(String a[]){
        C obj = new C();
        obj.saybye();
        obj.sayhi();
    }    
}
