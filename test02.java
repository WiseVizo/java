



public class test02 {
    static int[] swap(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        int ans[] = new int[2];
        ans[0] = a;
        ans[1] = b;
        return ans;

    }
    public static void main(String args[]){
        int a = 10;
        int b = 20;
        int arr[] = new int[2];
        arr = swap(a, b);
        a = arr[0];
        b = arr[1];
        System.out.println("a: "+a+","+"b: "+b);
    }
}
