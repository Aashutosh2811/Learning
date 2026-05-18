import java.util.Scanner;

class array {
    static int reverse(int num) {
        int result = 0;

        while (num > 0) {
            int digit = num % 10;   // take last digit
            result = result * 10 + digit; // add it
            num = num / 10; // remove last digit
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create Scanner object

        System.out.print("Enter a number: ");
        int number = sc.nextInt(); // take input from user


        // if we dont use satic keyword then we have to create object of class to call method
        //array obj = new array(); // create object of class
        //int answer = obj.reverse(number); // call method using object

        int answer = reverse(number); // call method

        System.out.println("Reversed number is: " + answer);
    }
}