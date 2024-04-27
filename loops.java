import java.util.Scanner;
import java.util.*;

//while loop
//Q.print 1 to 100 number?

// public class loops {

//     public static void main(String[] args) {
//         int i = 1;
//         while (i<=100) {
//             System.out.println(i);
//             i++;
//         }
//     }
// }

//print the values from 1 to n(by taking the n value from the user).

// public class loops {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = 1;
//         System.out.println("Enter your Number");
//         int n = sc.nextInt();
//         System.out.println("---counting start---");
//         while (num<=n) {
// System.out.println(num);
// num++;
//         }

//     }
// }

 /**
  * loops
  */
//  public class loops {

//     public static void main(String[] args) {
//         int n = 13;
//         int sum = 0;
//         int i =1;
//         while (i<=n) {
//             sum = sum +i;
//             i++;
//         }
//         System.out.println(sum);
//     }
//  }

 // FOR LOOP:-
// for(initialisation;condition;updation){
//      do something
// }

// Q.Print "helo world" 10 times using for loop.

public class loops {

    public static void main(String[] args) {
        for(int i = 1 ; i <= 10; i++){
            System.out.println(i+ " Hello, World");
        }
    }
}