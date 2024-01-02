//         Keyword | with   | effect
// topic - final   |variable| constant var
//         final   | class  | stops from getting inherited 
//         final   | method | stops from getting overridden


class Calc{
    public void add(int a, int b) {
        System.out.println(a+b);
    }
    final public void show(){
        System.out.println("In Calc");
    }
}

class AdCalc extends Calc{
    // public int show(){ // error -> The return type is incompatible with Calc.show()
    //     return 1;
    // }
//     public void show(){ // error-> Cannot override the final method from Calc
//     }
}



public class java03 {
    public static void main(String a[]){
        final int m = 10;
        // m = 20; // error-> The final local variable m cannot be assigned
        System.out.println(m);
    }    
}
