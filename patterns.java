import java.util.Scanner;

// public class patterns {
//     public static void main(String[] args) {
//         for (int i = 0; i < 10; i++) {
//             for (int j = 0; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// // QUE --Hollow rectangle
// public class patterns {

//     public static void hallow_rectanglen(int Row, int Column) {
//         for (int i = 1; i <= Row; i++) {
//             for (int j = 1; j <= Column; j++) {
//                 if (i == 1 || i == Row || j == 1 || j == Column) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         hallow_rectanglen(3, 6);
//     }
// }

// public class patterns {

//     public static void tringle(int n) {
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 int sum = i + j;
//                 if (sum % 2 == 0) {
//                     System.out.print("1");
//                 } else {
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         tringle(4);
//     }}

//     butterfly pattern

//     public class patterns {

//         public static void butterfly(int n) {
//             // Outer loop for the top part of the butterfly
//             for (int i = 1; i <= n; i++) {
//                 // Print stars for the left side of the butterfly
//                 for (int j = 1; j <= i; j++) {
//                     System.out.print("*");
//                 }
//                 // Print spaces between the wings of the butterfly
//                 for (int j = 1; j <= 2 * (n - i); j++) {
//                     System.out.print(" ");
//                 }
//                 // Print stars for the right side of the butterfly
//                 for (int j = 1; j <= i; j++) {
//                     System.out.print("*");
//                 }
//                 // Move to the next line
//                 System.out.println();
//             }

//             // Outer loop for the bottom part of the butterfly
//             for (int i = n - 1; i >= 1; i--) {
//                 // Print stars for the left side of the butterfly
//                 for (int j = 1; j <= i; j++) {
//                     System.out.print("*");
//                 }
//                 // Print spaces between the wings of the butterfly
//                 for (int j = 1; j <= 2 * (n - i); j++) {
//                     System.out.print(" ");
//                 }
//                 // Print stars for the right side of the butterfly
//                 for (int j = 1; j <= i; j++) {
//                     System.out.print("*");
//                 }
//                 // Move to the next line
//                 System.out.println();
//             }
//         }

// public static void main(String[] args) {
// butterfly(4);
// // You can change the parameter to adjust the size of the
// }
// }

// public class patterns {

//     // Method to print a solid rhombus pattern
//     public static void rhombus(int n) {

//         // Loop through each row
//         for (int i = 1; i <= n; i++) {

//             // Print spaces for left indentation
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             // Print asterisks for each column
//             for(int j = 1; j <= n; j++){
//                 System.out.print("*");
//             }

//             // Move to the next line after each row
//             System.out.println();
//         }
//     }

//     // Main method
//     public static void main(String[] args) {
//         // Call the rhombus method with a size of 4
//         rhombus(4);
//     }
// }
//Numbers pyramid

// public class pattern {
// public static void numbers_pyramid(int n){
//     //outer loop
//     for (int i = 1; i <=n; i++) {
//         //spaces
//         for (int j = 1; j <=n-i; j++) {
//             System.out.print(" ");
//         }
//         //numbers
//         for (int j = 1; j <=i; j++) {
//             System.out.print(i+" ");
//         }
//         System.out.println();
//     }

// }
//     public static void main(String[] args) {
//         numbers_pyramid(6);
//     }
// }

// class pattern {

//     static void pattern (int N){
//         for(int i=0 ; i<N ; i++){
//             for(int j=0; j<N; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int N =4;
//         pattern1(N);
//     }

//     }



// Pattern-2: Right-Angled Triangle Pattern

/**
 * pattern
 */
// public class pattern {

//     static void pattern(int N){
//         for(int i = 0; i<N; i++){
//             for(int j=0; j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String[] args) {
//         pattern(5);
//     }
// }

// Pattern - 3: Right-Angled Number Pyramid

public class patterns {

     static void nTringle(int n) {

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.println(j+" ");
            }
            System.out.println();
        }

    }
}

