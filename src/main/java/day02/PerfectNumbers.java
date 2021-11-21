package day02;

public class PerfectNumbers {

    public boolean isPerfectNumber(int number) {
        int sumOfDivider = 0;
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                sumOfDivider += i;
            }
        }
        return (sumOfDivider == number) ? true: false;
    }
}
