import java.util.*;

// public class array {
// public static void main(String[] args) {
//     int[] marks = new int [3];
//     marks[0] = 77;
//     marks[1] = 87;
//     marks[2] = 90;
//     System.out.println(marks[0]);
//     System.out.println(marks[1]);
//     System.out.println(marks[2]);

// }
// }

// public class array {
//     public static void main(String[] args) {
//         int[] marks = new int[3];
//         marks[0] = 77;
//         marks[1] = 87;
//         marks[2] = 90;
//         for (int i = 0; i < 3; i++) {
//             System.out.println(marks[i]);
//         }

//     }
// }

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[] = new int[size];
        
        // input loop
        for (int i = 0; i < size; i++) {

            nums[i] = sc.nextInt();
        }
        // output loop
        for (int i = 0; i < size; i++) {
            System.out.println(nums[i]);
        }

    }
}
