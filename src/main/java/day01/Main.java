package day01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PositiveNumberContainer positiveNumberContainer = new PositiveNumberContainer();
        Scanner sc = new Scanner(System.in);

        double number;
        do {
            number = sc.nextDouble();
            if (number>0) {
                positiveNumberContainer.addRealNumbers(number);
            }
        } while (number>0);
            System.out.println(positiveNumberContainer.realNumbers);
    }


}
