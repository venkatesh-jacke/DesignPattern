public class Main {
    public static void main(String[] args) {
        System.out.println(sumOfAllDivisors(3));
    }
    public static int sumOfAllDivisors(int n){
        // Write your code here.
        int res=0;
        for(int i=1;i<=n;i++){
            System.out.println((n/i)*i);
            res+=(n/i)*i;
        }
        return res;
    }
}