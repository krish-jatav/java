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

public class patterns {

    public static void hallow_rectanglen(int Row, int Column) {
        for (int i = 1; i <= Row; i++) {
            for (int j = 1; j <= Column; j++) {
                if (i == 1 || i == Row || j == 1 || j == Column) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hallow_rectanglen(3, 6);
    }
}
