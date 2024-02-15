import java.util.Scanner;

public class Fibonacci_2BSCS1_Llana {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("1. Non-recursive Fibonacci");
            System.out.println("2. Recursive Fibonacci");
            System.out.println("3. Exit and print your name");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the number of Fibonacci sequence terms: ");
                    int n1 = scanner.nextInt();
                    printFibonacciNonRecursive(n1);
                    break;
                case 2:
                    System.out.print("Enter the number of Fibonacci sequence terms: ");
                    int n2 = scanner.nextInt();
                    for (int i = 0; i < n2; i++) {
                        System.out.print(fibonacciRecursive(i) + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.println("Exiting... " + name);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 3);
        
        scanner.close();
    }
    
    public static void printFibonacciNonRecursive(int n) {
        int a = 0, b = 1;
        System.out.println("Fibonacci Sequence (Non-recursive): ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }
    
    public static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}