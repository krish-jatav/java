import java.util.Scanner;
import java.util.*;

public class patternSolve {
    static void nTringleNum(int n) {

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
          int n = 5;
        nTringleNum(n);

    }
}
