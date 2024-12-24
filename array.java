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
// public class array {
//     public static int menuList(String[] menu, String key) {
//         for (int i = 0; i < menu.length; i++) {
//             if (menu[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         String menu[] = { "Samosa", "jalabi", "poha", "kachori" };
//         String key = "poha";
//         int result = menuList(menu, key);
//         if (result == -1) {
//             System.out.println("Not Found");
//         } else {
//             System.out.println("String is at index " + result);
//         }
//     }
// }
// LARGEST NUMBER IN ARRAY
// public class array {
//     public static int getLargest(int num []) {
//         int largest = Integer.MIN_VALUE;  // - infinity
//         int small = Integer.MAX_VALUE; // + infinity
//         for(int i=0; i<num.length; i++){
//             if (largest<num[i]) {
//                 largest = num[i];
//             }if(small > num[i]){
//                 small = num [i];
//             }
//         }
//  System.out.println("Small number is : " + small);
//       return largest;
//     }
//     public static void main(String[] args) {
//         int num[] = {1,3,4,6,2,3};
//         System.out.println("The Largest Number is : " + getLargest(num));
//     }
// }
// binary search-----
// public class array {
// public static int binarySearch(int number [] , int key) {
//     int start = 0, end = number.length-1;
//     while (start <= end) {
//         int mid = (start + end)/2;
//         if(number[mid]==key){
//             return mid;
//         }
//         if(number[mid] < key){
//             start = mid+1;
//         }else{
//             end =mid-1;
//         }
//     }
//     return-1;
// }
//     public static void main(String[] args) {
//         int number[] = {2, 4, 6, 8, 9, 10};
//         int key = 6;
//         System.out.println("Index of key: " + binarySearch(number, key));
//     }
// }
// reverse an array-------------
//
// public class array {
//     public static boolean duplicate(int[] num) {
//         for (int i=0; i<num.length-1; i++){
//            for(int j=i+1; j<num.length; j++){
//                if (num[i]== num[j]) {
//                    return true;
//                }
//            }
//         }
//         return false;
//        }
//    public static void main(String[] args) {
//         int num[] = {1, 2, 3, 1};
//         boolean result = duplicate( num);
//         System.out.println(result);
//    }
// }
// public class array {
//     public static boolean duplicate(int[] num) {
//         for (int i=0; i<num.length-1; i++){
//            for(int j=i+1; j<num.length; j++){
//                if (num[i]== num[j]) {
//                    return true;
//                }
//            }
//         }
//         return false;
//        }
//    public static void main(String[] args) {
//         int num[] = {1, 4 , 5 , 10, 10 , 1};
//         boolean result = duplicate( num);
//         System.out.println(result);
//    }
// }
//  public class array{
//     public static void update(int marks[]) {
// for(int i =0; i < marks.length; i++){
//     marks[i] = marks[i] + 1;
// }
//     }
//     public static void main(String[] args) {
//         int marks[] ={98, 60, 90};
//         update(marks);
//         for (int i = 0; i < marks.length; i++) {
//             System.out.println(marks[i]+" ") ;
//         }
// System.out.println();
//     }
//  }
// public class array{
//     public static int linearSearch(int numbers [], int key) {
//         for (int i = 0; i < numbers.length ; i++) {
//            if(numbers [i] == key) {
//             return i ;
//            } 
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int numbers [] = {2,4,6,8,10,12};
//         int key = 10;
//         int index = linearSearch(numbers, key);
//         if (index == -1) {
//             System.out.println("not a num");
//         } else {
//             System.out.println("key is a index : "+ index);
//         }
//     }
// }
// find the largest number in this array..............................
// public class array{
//     public static int largestNum(int number[]) {
//         int largest = Integer.MIN_VALUE;
//         for (int i = 0; i < number.length; i++) {
//             if(largest < number[i]){
//                 largest = number[i];
//             }
//         }
//         return largest;
//     }
//     public static void main(String[] args) {
//         int numbers [] = {2,3,7,5,6};
//         System.out.println("the largest number is " + largestNum(numbers));
//     }
// }
// public class array {
//     public static int  getlargest(int  number []){
//         int largest = Integer.MIN_VALUE;
//         for(int i = 0 ; i < number.length; i++){
//             if(largest < number[i]){
//                 largest = number[i];
//             }
//         }
//         return  largest;
//     }
// public static int getsmallest(int number []) {
//     int smallest = Integer.MAX_VALUE;
//     for (int i = 0; i < number.length; i++) {
//         if(smallest > number[i]){
//             smallest = number[i];
//         }
//     }
//     return smallest;
// }
//     public static void main(String[] args) {
//         int  numbers [] = { 2,4,5,3,9,5};
//         System.out.println("the largest number is "+ getlargest(numbers));
//         System.out.println("the smallest number is "+ getsmallest(numbers));
//     }
// }
// public class array {
//     public static void reverseArr(int[] arr) {
//         for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//         }
//     }
//     public static void main(String[] args) {
//         int[] numbers = {2, 4, 5, 6};
//         reverseArr(numbers);
//         for (int num : numbers) {
//             System.out.print(num + " ");
//         }
//     }
// }
// public class array {
//     public static void Pair(int numbers[]) {
//         int tp = 0;
//         for (int i = 0; i < numbers.length; i++) {
//             // int curr = numbers[i]; 2, 4, 5, 7, 8, 8, 9, 9
//             for (int j = i + 1; j < numbers.length; j++) {
//                 System.out.print("(" + numbers[i] + "," + numbers[j] + ")");
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println("total numbers of pair = "+ tp);
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 5, 7, 8, };
//         Pair(numbers);
//     }
// }
public class array {

    // Method to print all subarrays of the given array
    public static void printSubArray(int numbers[]) {
        int ts = 0; // Total subarrays counter

        // Loop to set the starting point of subarray
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            
            // Loop to set the ending point of subarray
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                int currentSum = 0;

                // Loop to print elements from start to end
                for (int k = start; k <= end; k++) {
                    currentSum += numbers[k];
                    if (min > numbers[k]) {
                        min = numbers[k];
                    }
                    if (max < numbers[k]) {
                        max = numbers[k];
                    }
                }
                System.out.println("Subarray from index " + start + " to " + end);
                System.out.println("Current sum: " + currentSum);
                System.out.println("Min: " + min + " Max: " + max);
                System.out.println();
                ts++; // Increment total subarrays counter
            }
        }
        // Print total number of subarrays
        System.out.println("Total SubArrays: " + ts);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10}; // Initialize the array

        printSubArray(numbers); // Call method to print subarrays
    }
}
