
// annotations -> @override , @deprecated etc note-> they are like decorators from python like which dosen't affect our code but it helps to deliver our intent to compiler more clearly

@Deprecated // it means u can use it but don't use it 
class A{
    public void main(){
        System.out.println("hi");
    }
}

class B extends A{
    @Override
    public void main(){
        System.out.println("no");
    }
}

public class java15 {
    public static void main(String[] args) {
        B ob = new B();
        ob.main();

    }
}
