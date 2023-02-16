import java.util.Scanner;
public class Main {
    Scanner sc = new Scanner(System.in);
    //function to checkPalindrome
    public void checkPalindrome(int number)  {
        int orig_number = number;
        int reverse = 0;
        int remainder;
        while(number>0){
            remainder = number%10;
            reverse = reverse*10 + remainder;
            number = number/10;
        }
        if(reverse == orig_number){
            System.out.println("Number is Palindrome");
        }
        else {
            System.out.println("Number is not Palindrome");
        }
    }
    //function to printPattern
    public void printPattern(int n) {
        for (int i = n; i>0; i-- ){
            for(int j = 0; j < i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //function to check no is prime or not
    public void checkPrimeNumber(int number) {
        for(int i = 2; i < ((number/2) +1);i++){
            if (number % i ==0) {
                System.out.println("Number is not prime");
                return;
            }
        }
        System.out.println("Number is Prime");
    }
    // function to print Fibonacci Series
    public void printFibonacciSeries(int n) {
        //initialize the first and second value as 0,1 respectively.
        int first = 0, second = 1;
        if (n == 1){
            System.out.print(first);
        } else if (n==2) {
            System.out.print(first);
            System.out.print(second);
        }else {
            int tmp;
            System.out.print(first);
            for (int i = 1; i<n; i++){
                System.out.print(second);
                tmp = first;
                first = second;
                second = tmp+second;
            }
            System.out.println();
        }
    }
//main method which contains switch and do while loop

    public static void main(String[] args) {
        Main obj = new Main();
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

                    + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

                    + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
            System.out.println();
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    choice = 0;
                    break;
                case 1: {
                    System.out.print("Enter a number to check if it is Palindrome:");
                    int number = sc.nextInt();
                    obj.checkPalindrome(number);
                }
                break;
                case 2: {
                    System.out.print("Enter a number for printing pattern:");
                    int number = sc.nextInt();
                    obj.printPattern(number);
                }
                break;
                case 3: {
                    System.out.print("Enter a number to check if it's prime:");
                    int number = sc.nextInt();
                    obj.checkPrimeNumber(number);
                }
                break;

                case 4: {
                    System.out.print("Enter a number of terms of fibonacci to be printed:");
                    int number = sc.nextInt();
                    obj.printFibonacciSeries(number);
                }
                break;

                default:
                    System.out.println("Invalid choice. Enter a valid no.\n");
            }

        } while (choice != 0);
        System.out.println("Exited Successfully!!!");
        sc.close();
    }
}
