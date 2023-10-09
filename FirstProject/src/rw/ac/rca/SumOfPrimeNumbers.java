package rw.ac.rca;

public class SumOfPrimeNumbers {
    public  static void main(String[] args){
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (isPrime(i)) sum += i;
        }
        System.out.println("The sum of all Prime numbers to 100 is : " + sum);
    }
    public static boolean isPrime(int n){
        int i;
        for (i = 2; i <= n; i++) {
            if (n%i == 0) break;
        }
        if (n == i) return  true;
        else return false;
    }
}
