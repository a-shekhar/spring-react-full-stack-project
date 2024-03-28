package main.com.aditya;
public class MyMath {
    public static void main(String[] args) {

    }

    public int calculateSum(int[] numbers) {
        int sum  = 0;
        for(int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
