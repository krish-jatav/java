package JavaBasics;

// What is Java?

// Ans => Java is a high-level, object-oriented programming language developed
// by Sun Microsystems
// (now owned by Oracle Corporation) in the mid-1990s. It was designed with the
// principle of
// "write once, run anywhere" (WORA), meaning that Java programs can run on any
// device that has
// a Java Virtual Machine (JVM) installed, regardless of the underlying hardware
// and software platform.

// Key features of Java include:

// Platform Independence: Java programs are compiled into bytecode, which can be
// executed on any platform with a JVM. This allows Java applications to be
// highly portable.

// Object-Oriented: Java follows an object-oriented programming paradigm,
// supporting concepts such as classes, objects, inheritance, polymorphism, and
// encapsulation.

// Robustness: Java has strong memory management, exception handling, and type
// checking mechanisms, which help in creating reliable and robust applications.

// Security: Java has built-in security features such as bytecode verification
// and a security manager to protect systems from malicious code.

// Multithreading: Java supports multithreading, allowing programs to perform
// multiple tasks concurrently, making it suitable for developing scalable and
// high-performance applications.

// Rich Standard Library: Java comes with a rich set of standard libraries (Java
// API) that provide support for various tasks such as I/O operations,
// networking, GUI development, and more.

// Automatic Garbage Collection: Java's automatic garbage collection mechanism
// manages memory allocation and deallocation, making memory management easier
// for developers.

// ==================================================================================================

// QUE => What is the difference between JDK, JRE, and JVM?

// Ans=>

// JDK (Java Development Kit) is used for Java development and includes tools
// needed for compiling,
// debugging, and running Java programs.
// JRE (Java Runtime Environment) is used for running Java applications and
// includes the JVM and core
// libraries but lacks development tools.
// JVM JVM (Java Virtual Machine) is an abstract computing machine responsible
// for executing Java bytecode
// on various platforms, providing platform independence for Java programs.

// ================================================================================================================

// first program in java

// public class basics {
// public static void main(String[] args) {
// int a = 20;
// if (a == 19) {
// System.out.println("Hello World");
// }else{
// System.out.println("no world");
// }

// }
// }
// OUTPUT: no world

// Print a pattern

// public class basics{
// public static void main(String[] args) {
// System.out.println("*");
// System.out.println("**");
// System.out.println("***");
// System.out.println("****");

// }
// }
// OUTPUT :
// *
// **
// ***
// ****

// Varibles in java

// In Java, a variable is a named memory location that stores data.
// Variables are used to hold values that can be manipulated and
// accessed within a program.

// Declaration--
// int age ; // Declares a variable named 'age' of type int
// Initialization--
// int age = 25; // Declares and initializes 'age' to 25

// Types: Java is a statically-typed language, which means every variable must
// have a specific data type. Common data types in Java include { int, double,
// boolean, char, }and reference types like String.

// program---

// public class basics{
// public static void main(String[]args){

// Declaring and initializing variables
// int num1 =10;
// int num2=15;
// int sum;

// Performing arithmetic operation
// sum = num1 + num2;

// Displaying the result
// System.out.println("sum of " + num1 +" and " + num2 + " is: "+sum);
// }
// }
// OUTPUT : sum of 10 and 15 is: 25

// Data Types in Java-----

// Data types specify the different sizes and values that can be stored in the variable.
// There are two types of data types in Java:

// Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.
// Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.
// tree structure for dataTypes https://media.geeksforgeeks.org/wp-content/uploads/20240307140133/data-types.png

//1. boolean data type
//2. byte data type
//3. char data type
//4. short data type
//5. int data type
//6. long data type
//7. float data type
//8. double data type

// public class basics {

//     public static void main(String[] args) {
//         int i = 10;
//         System.out.println(i);
//         byte b = 1;
//         System.out.println(b);
//         char c = 'a';
//         System.out.println(c);
//         short s = 2;
//         System.out.println(s);
//         boolean bo = 1==3;
//         System.out.println(bo);
//         long l = 173561168;
//         System.out.println(l);
//         float f = 125;
//         System.out.println(f);
//         double d =1234.1234;
//          System.out.println(d);
//     }
// }
