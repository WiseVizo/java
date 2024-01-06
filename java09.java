
// topic -> interface -> so in my understanding they r like make an abstract concept rn and code it later similar to abstract classes

interface Computer{
    public void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("code : compile : run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code : compile : run : faster");
    }
}

class Developer{
    public void develop(Computer c){
        c.code();
    }
}

public class java09 {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer dev = new Developer();
        dev.develop(lap);
        dev.develop(desk);

    }
}
