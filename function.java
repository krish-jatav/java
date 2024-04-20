import java.util.Scanner;

// public class function {
// public static void helloWorld() {
//     System.out.println("hello world");
//     // System.out.println("hello world");
// }
// public static void main(String[] args) {
//     helloWorld();
//     // call
// }

// }

// Write a program that takes a input from the user and verify that this number is even or odd.

public class function {

    static Scanner sc = new Scanner(System.in);
    static long n = sc.nextInt();

    public static void verifying() {
        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        return;

    }

    public static void main(String[] args) {

        verifying();
    }

}
