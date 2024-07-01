import java.util.Scanner;
import java.util.*;

// public class patternSolve {
//     // static void nTringleNum(int n) {

//     //     for(int i = 1; i <= n; i++) {
//     //         for(int j = 1; j <= i; j++) {
//     //             System.out.print(i+" ");
//     //         }
//     //         System.out.println();
//     //     }

//     // }

//     public static void main(String[] args) {
//           int n = 5;
//           nTringleNum(n);

//     }
// }


// Inverted Right Pyramid

// public class patternSolve {

//     static void  starPyramid(int n){
//         for(int i=0; i<n; i++){
//             for(int j = n; j>i; j--){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String[] args) {
//           int n = 5;
//           rTriangle(n);

//     }
// }

// Inverted Numbered Right Pyramid

// public class patternSolve {

//     static void  rTriangle(int n){
//         for(int i=1; i<=n; i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String[] args) {
//           int n = 5;
//           rTriangle(n);

//     }
// }


// Star Pyramid

public class patternSolve {

    static void  starPyramid(int n){

       for(int i = 0; i<n; i++){
       //space
        for(int j=0; j<n-1-i; j++){
           System.out.print(" ");
        }
        // star
        for(int j=0; j<2*i+1; j++){

            System.out.print("*");

        }
        // space
        for(int j=0; j<n-1-i; j++){
           System.out.print(" ");
        }

         System.out.println();
       }

    }
    public static void main(String[] args) {
          int n = 5;
          starPyramid(n);

    }
}
