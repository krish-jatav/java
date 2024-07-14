import java.util.*;

// Array --- Arrays are used to store multiple values in a single variable
// Operation in Array-- Create, input, Output, Update.
//
// Creating an Arrays- dataType arrayName[]= new dataType[size];
// new Keyword - ka kaam hai ki hame new memory location dene

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

// public class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int nums[] = new int[size];

//         // input loop
//         for (int i = 0; i < size; i++) {

//             nums[i] = sc.nextInt();
//         }
//         // output loop
//         for (int i = 0; i < size; i++) {
//             System.out.println(nums[i]);
//         }

//     }
// }

// public class array {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your marks");
//         int marks[] = new int[100];

//         marks[0] = sc.nextInt(); // phy
//         marks[1] = sc.nextInt(); // chem
//         marks[2] = sc.nextInt();// maths

//         System.out.println("phy : " + marks[0]);
//         System.out.println("chem : " + marks[1]);
//         System.out.println("maths : " + marks[2]);

//         int sum = marks[0] + marks[1] + marks[2];

//         int percentage = (marks[0] + marks[1] + marks[2]) / 3;

//         System.out.println("Total :" + sum);
//         System.out.println("Percentage : " + percentage + "%");

//     }
// }

// QUE : find the largest no. of Array [1,3,2,4,1,6]


// public class array {

//     public static void main(String[] args) {
//         int[] largest =  {1,3,6,9,2,5};
//         int arr =largest[0];
//         for (int i=0;i < largest.length;i++){
//             if(largest[i]> arr){
//                 arr = largest[i];
//             }
//         }
//         System.out.println("The largest element in the array is: " + arr);
//     }
// }

// public class array {
//     public static void update(int marks[]) {
//              for(int i=0; i<marks.length; i++){
//                 marks[i]=marks[i] + 1;
//              }
//     }
//     public static void main(String[] args) {
//         int marks[] ={97,98,99};
//         update(marks);
//         for(int i=0; i<marks.length;i++){
//             System.out.println(marks[i] + 1 + " ");
//         }
//         System.out.println();
//     }
// }


// Linear Search

// public class array {

//     public static int linearSearch( int num[] , int key) {

//        for(int i=0; i<num.length; i++){
//         if( num[i] == key){
//             return i;
//         }

//        }
//        return-1;

//     }

//         public static void main(String[] args) {

//             int num [] ={1,2,3,4,5,6,7,8};
//             int key = 10;
//             int index = linearSearch(num, key);
//             if(index==-1){
//                 System.out.println("Number is Not found");
//             }else{
//                 System.out.println("key is at index : " + index );
//             }


//     }
// }

// Linear Search with string

public class array {

    public static int  menuList(String [] menu , String key) {

        for(int i = 0; i<menu.length; i++){

            if(menu[i] == key){
                return i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
      String menu[] = {"Samosa", "jalabi","poha", "kachori"};
      String key = "poha";

      int  result = menuList(menu, key);
      if(result == -1 ){
        System.out.println("Not Found");
      }else{
        System.out.println("String is at index " + result);
      }



     }



}