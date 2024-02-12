public class test03 {
    static void printPrime(int num){
        if(num<2){
            System.out.println("no prime numbers found :/");
            return;
        }
        int flag;
        for(int i=2; i<=num; i++){
            flag = 0;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args) {
        int num = 100;
        printPrime(num);
    }
}
