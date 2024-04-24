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

// public class function {

//     static Scanner sc = new Scanner(System.in);
//     static long n = sc.nextInt();

//     public static void verifying() {
//         if (n % 2 == 0) {
//             System.out.println("even");
//         } else {
//             System.out.println("odd");
//         }

//         return;

//     }

//     public static void main(String[] args) {

//         verifying();
//     }

// }

// public class function {

//     public static void swap (int a , int b){

//         int temp;
//         temp = a;
//         a=b;
//         b= temp;
//         System.out.println(a);
//         System.out.println(b);
//     }
//     public static void main(String[] args) {
//         int a= 10;
//         int b = 20;
//         swap(a, b);
//     }

// }

//1. Initially, a is 10 and b is 20.
//2. When the swap method is called with a and b as arguments, the values 10 and 20 are passed to the method parameters a and b.
//3. Inside the swap method, the values of a and b are swapped using a temporary variable temp.
//4. After swapping, a becomes 20 and b becomes 10.
//5. These swapped values are printed inside the swap method.
//6. However, since Java passes arguments by value, the changes made to a and b inside the swap method do not affect the original variables a and b in the main method. So, the values of a and b remain 10 and 20 respectively in the main method.

//write a program to print the sum of numbers by taking the input from the user.

// public class function {

//     public static void calculate(int num1, int num2) {
//         int sum = num1 + num2;
//         System.out.println("The sum is = " + sum );
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b= sc.nextInt();
//         calculate(a, b);
//     }
// }

// find the product

// public class function {

//     public static int multiply (int a , int b){

//         int product =a *b;
//         return product;
//     }
//     public static void main(String[] args) {
//         int a = 2;
//         int b= 4;
//         int prod = multiply(a, b);
//         System.out.println(prod);
//     }
// }

//Find the Factorial of the number
// n!=n*(n-1)*(n-2)*(n-3).....1.

// public class function {

//     public static int Factorial(int n){
//         int facto = 1;
//         for (int i = 1; i <= n; i++ ){
//             facto = facto*i;
//         }
//         return facto;
//     }
//     public static int Binomialcoefficient(int n, int r) {
//         int a= Factorial(n);
//         int b = Factorial(r);
//         int c = Factorial(n-r);
//         int BC =a / (b * c);

//         return BC;

//     }
//     public static void main(String[] args) {
//         System.out.println(Binomialcoefficient(3,2));
//     }
// }

// FUNCTION OVERLOADING using parameters
// it means multiple functions have same name but different parameters.
// public class function {

//     public static int sum(int a, int b) {
//         return a + b;
//     }

//     public static int sum(int a, int b, int c) {
//         return a + b + c;
//     }

//     public static void main(String[] args) {
//         System.out.println(sum(2, 5));
//         System.out.println(sum(2, 3, 4));
//     }
// }

// Prime number or not.

public class function {

    public static void prime(int n) {
        if (n == 2) {
            System.out.println("2 is always prime number");
        } else {
            boolean isprime = true;
            for (int i = 2; i <= n-2 ; i++) {
                if (n % i == 0){
                    isprime = false;
                }
            }
            if (isprime == true) {
                System.out.println("number is prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();
        prime(n);
    }
}

