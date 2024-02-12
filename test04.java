public class test04 {
    public static boolean armStrongNumber(int num){
        int temp = num;
        int sum = 0;
        int order = order(num);
        while (num!=0) {
            int rem = num%10;
            System.out.println(rem);
            sum += Math.pow(rem, order);
            num/=10;
        }

        return temp==sum;
    }
    static int order(int x){
        int n = 0;
        while (x != 0) {
            n++;
            x = x / 10;
        }
        return n;
    }
    public static void main(String args[]){
        int i = 407;
        System.out.println(armStrongNumber(i));
    }
}
