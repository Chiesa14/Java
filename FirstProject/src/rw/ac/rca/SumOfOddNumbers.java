package rw.ac.rca;

public class SumOfOddNumbers {

    public  static void main(String[] args){
        int sum = 0;
        for (int i = 2; i <= 20; i++) {
            if (!(i % 2 == 0)){
                sum +=i;
            }
        }
        System.out.println("the sum of all even numbers to 100 is: " + sum);
    }
}
