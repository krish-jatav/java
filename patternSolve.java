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

//     static void  rTriangle(int n){
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

public class patternSolve {

    static void  rTriangle(int n){
        for(int i=0; i<n; i++){
            for(int j = n; j>i; j--){
                System.out.print(n-j+1+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
          int n = 5;
          rTriangle(n);

    }
}

