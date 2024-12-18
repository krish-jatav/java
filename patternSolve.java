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

// public class patternSolve {

//     static void  starPyramid(int n){

//        for(int i = 0; i<n; i++){
//        //space
//         for(int j=0; j<n-1-i; j++){
//            System.out.print(" ");
//         }
//         // star
//         for(int j=0; j<2*i+1; j++){

//             System.out.print("*");

//         }
//         // space
//         for(int j=0; j<n-1-i; j++){
//            System.out.print(" ");
//         }

//          System.out.println();
//        }

//     }
//     public static void main(String[] args) {
//           int n = 6;
//           starPyramid(n);

//     }
// }

// Inverted Star Pyramid

// public class patternSolve {

//    static void  starPyramid(int n){

//       for(int i = 0; i<n; i++){
//       //space
//        for(int j=0; j<i; j++){
//           System.out.print(" ");
//        }
//        // star
//        for(int j=0; j<2*n-(2*i+1); j++){

//            System.out.print("*");

//        }
//        // space
//        for(int j=0; j<i; j++){
//           System.out.print(" ");
//        }

//         System.out.println();
//       }

//    }
//    public static void main(String[] args) {
//          int n = 6;
//          starPyramid(n);

//    }
// }
//  
// public class  patternSolve{
//    public static void main(String[] args) {
//        int n = 5;
//        char ch = 'A';
//        for(int i = 1 ; i<=n; i++){
//          for(int chars = 1 ; chars<= i; chars++  ){
//             System.out.print(ch);
//             ch++;
//          }
//          System.out.println();
//        }
//    }
// }

public class patternSolve {

   public static void hallow(int totRow, int totCol) {
      for (int i = 1; i <= totRow; i++) {
         for (int j = 1; j <= totCol; j++) {
            if (i == 1 || i == totRow || j == 1 || j == totCol) {
               System.out.print("*");
            } else {
               System.out.print(" ");
            }
         }
         System.out.println();
      }

   }
   public static void main(String[] args) {
      hallow(4, 5);
   }

}