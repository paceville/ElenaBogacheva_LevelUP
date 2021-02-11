package homework_2.task_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    public void startApplication() {
        int count = 0;
        while (count <= 100) {
            boolean onward = proceed(count);

            if (!onward) {
                return;
            } else {
                int action = selectOperation();

                double number1 = 0;
                double number2 = 0;

                if (action <= 6) {
                    double[] numbers = enterNumbers(action);
                    number1 = numbers[0];
                    number2 = numbers[1];
                }

                switch (action) {

                    case 1:
                        addition(number1, number2);
                        break;

                    case 2:
                        subtraction(number1, number2);
                        break;

                    case 3:
                        multiplication(number1, number2);
                        break;

                    case 4:
                        power(number1, number2);
                        break;

                    case 5:
                        factorial(number1);
                        break;

                    case 6:
                        fibonacci(number1);
                        break;

                    default:
                        System.out.println("You can only choose the value between 1 and 6");
                        break;
                }
            }
            count++;
        }
    }

    public int selectOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to find the sum of numbers, enter 1");
        System.out.println("If you want to subtract any numbers, enter 2");
        System.out.println("If you want to multiply any numbers, enter 3");
        System.out.println("If you want to find the exponent of a number, enter 4");
        System.out.println("If you want to calculate the factorial of a number, enter 5");
        System.out.println("If you want to calculate the value of a given Fibonacci number, enter 6");
        int action = scanner.nextInt();
        return action;
    }

    public double[] enterNumbers(int action) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ");
        if (action !=4 && action !=5 && action != 6) {
            System.out.print("first ");
        }
        System.out.print("number: ");
        double number1 = scanner.nextDouble();

        double number2 = 0;
        if (action !=5 && action != 6) {
            if (action == 4) {
                System.out.print("Enter power of number: ");
            } else {
                System.out.print("Enter second number: ");
            }
            number2 = scanner.nextDouble();
        }

        double[] numbers = new double[2];
        numbers[0] = number1;
        numbers[1] = number2;

        return numbers;
    }

    public void addition(double number1, double number2) {
        double result = number1 + number2;
        System.out.println("Result is: " + result);
    }

    public void subtraction(double number1, double number2) {
        double result = number1 - number2;
        System.out.println("Result is: " + result);
    }

    public void multiplication(double number1, double number2) {
        double result = number1 * number2;
        System.out.println("Result is: " + result);
    }

    public void power(double number1, double power) {
        int result = 0;
        if (power != 0) {
            result = (int) number1;
            for (int i = 2; i <= power; i++) {
                result *= number1;
            }
            System.out.println("Result is: " + result);
        } else {
            System.out.println("Result is: 1");
        }
    }

    public void factorial(double number1) {
        int result = 0;
        if (number1 != 0) {
            result = (int) number1;
            for (int i = 1; i < number1; i++) {
                result *= (number1 - i);
            }
            System.out.println("Result is: !" + (int) number1 + " = " + result);
        } else {
            System.out.println("Result is: !" + (int) number1 + " = 1");
        }

    }

    public void fibonacci(double number1) {
        int index = (int) number1;
        ArrayList<Integer> fibonacci = new ArrayList<Integer>();

        System.out.print(("Fibonacci sequence is: "));

        int number = 0;
        fibonacci.add(0, number);
        fibonacci.add(1, number + 1);
        System.out.print(fibonacci.get(0) + " ");
        System.out.print(fibonacci.get(1) + " ");

        for (int i = 2; i < index; i++) {
            number = fibonacci.get(i-1) + fibonacci.get(i-2);
            fibonacci.add(i, number);
            System.out.print(fibonacci.get(i) + " ");
        }
        System.out.println("");
    }

    public boolean proceed(int count) {
        Scanner scanner = new Scanner(System.in);
        boolean onward = true;
        if (count != 0) {
            System.out.println("Do you want to proceed? Y/N");
            String proceed = scanner.nextLine();
            onward = proceed.equals("Y");
        }
        return onward;
    }
}
