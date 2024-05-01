import java.util.Scanner;

// public class patterns {
// public static void main(String[] args) {
//    for(int i = 0 ; i < 10 ; i++){
//     for(int j= 0; j<=i; j++){
//         System.out.print(j);
//     }
//     System.out.println();
//    }
// }
// }

//QUE --Hollow rectangle
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

//     public static void main(String[] args) {
//         int n = 5;
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
// }

// OUTPUT:-
// 1
// 01
// 101
// 0101
// 10101
// -----------------------------------------------

// butterfly pattern

// public class patterns {

//     public static void butterfly(int n) {
//         // Outer loop for the top part of the butterfly
//         for (int i = 1; i <= n; i++) {
//             // Print stars for the left side of the butterfly
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             // Print spaces between the wings of the butterfly
//             for (int j = 1; j <= 2 * (n - i); j++) {
//                 System.out.print(" ");
//             }
//             // Print stars for the right side of the butterfly
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             // Move to the next line
//             System.out.println();
//         }

//         // Outer loop for the bottom part of the butterfly
//         for (int i = n - 1; i >= 1; i--) {
//             // Print stars for the left side of the butterfly
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             // Print spaces between the wings of the butterfly
//             for (int j = 1; j <= 2 * (n - i); j++) {
//                 System.out.print(" ");
//             }
//             // Print stars for the right side of the butterfly
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             // Move to the next line
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         butterfly(4); // You can change the parameter to adjust the size of the butterfly
//     }
// }
// // OUTPUT:-
// // *      *
// // **    **
// // ***  ***
// // ********
// // ***  ***
// // **    **
// // *      *