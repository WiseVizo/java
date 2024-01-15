public class java24 {
    public static void main(String args[]){
        int i = 0;
        try{
            System.out.println("hi");
            int j = 10/i;

        }
        finally{ // finally is used to manage resources like open files, db connections etc and it will run no matter if try bloack got any error or not 
            i = 1;
            System.out.println("yo");
        }
        
    }
}
