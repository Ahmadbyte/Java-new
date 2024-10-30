// class Student{
//     String name;
//     int roll;
//     float fee;
//     Student(String name,int roll){
//         this.name=name;
//         this.roll=roll;
//     }
//     Student(String name,int roll,float fee){
//         this(name,roll);
//         this.fee=fee;
//     }
//     void display(){
//         System.out.println("Student name :"+name+" Roll no."+roll+" Fees: "+fee);
//     }
// }
// class TestThis{
//     public static void main(String[] args){
//         Student obj = new Student("Sharique",7);
//         Student obj1 = new Student("Ahmad",8,5000f);
//         obj.display();
//         obj1.display();
//     }
// }

// abstract class Animal{
//     public abstract void sound();
//     public void sleep(){
//         System.out.println("The animal is sleeping");
//     }
// }

// class Dog extends Animal{
//     public void sound(){
//         System.out.println("The Dog barks");
//     }
// }

// class Cat extends Animal{
//     public void sound(){
//         System.out.println("The Cat meows");
//     }
// }

// class Main{
//     public static void main (String args []){
//         Animal peter = new Dog();
//         peter.sleep();
//         peter.sound();
//         // sc.close();
//     }
// }

// interface Animal{
//     void sound();
//     default void sleep(){
//         System.out.println("The animal is sleeping");
//     }
// }

// class Dog implements Animal{
//     public void sound(){
//         System.out.println("The Dog barks");
//     }
// }

// class Cat implements Animal{
//     public void sound(){
//         System.out.println("The Cat meows");
//     }
// }

// class Main{
//     public static void main (String args []){
//         Animal peter = new Dog();
//         peter.sleep();
//         peter.sound();
//         Animal cat = new Cat();
//         cat.sleep();
//         cat.sound();
//     }
// }

// arr[]={4,1,6,1,8,7,1};
// public class Array{
//     public static void main (String [] args){
//         int arr[]={4,11,6,1,8,9,1};
//         int max=0;
//         int smax=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 smax=max;
//                 max=arr[i];
//             }else if(arr[i]>smax && arr[i]<max ){
//                 smax=arr[i];
//             }
            
//         }
//         System.out.println(max);
//         System.out.println(smax);
//     }
// }

/*-----------Max element using for each---------- */

// import java.util.*;
// class Compare{
//     public static void Match(int [] a){
//         int max=a[0];
//         for(int num : a){
//             if(num>max)
//             max=num;
//         }
//         // return new int[]{acount, bcount};
//         System.out.println(max);
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=5;
//         int [] sum1 = new int[n];
//         // System.out.println("Enter array element for Alice ");
//         for(int i=0;i<sum1.length;i++){
//             sum1[i]=sc.nextInt();
//         }
//         Compare obj= new Compare();
//         obj.Match(sum1);
//     }
// }

/*------------2D Array Matrix --------------- */

// import java.util.*;
// public class Test{
//     public static void Matrix(int[][]arr){
//         int n=arr.length;
//         int simplesum=0;
//         int diagnolsum=0;
//         for(int i=0;i<arr.length;i++){
//             simplesum+=arr[i][i];
//             diagnolsum+=arr[i][n-1-i];
//         }
//         int difference=Math.abs(simplesum-diagnolsum);
//         System.out.println(difference);
//     }   
// // }
// // class Test1{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[][]=new int[n][n];
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         Test obj = new Test();
//         obj.Matrix(arr);
//     }
// }

/*------------Plus Minus using ArrayList---------- */

// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.function.*;
// import java.util.regex.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
// import static java.util.stream.Collectors.toList;

// class Result {

//     public static void plusMinus(List<Integer> arr) {
//     // Write your code here
//         double n=arr.size();
//         int countn=0;
//         int countp=0;
//         int count0=0;
//         for(int i : arr){
//             if(i>0){
//                 countp++;
//             }else if(i<0){
//                 countn++;
//             }else if(i==0){
//                 count0++;
//             }
//         }
//         double diffp = countp/n;
//         double diffn = countn/n;
//         double diff0 = count0/n;
//         System.out.printf("%.6f%n",diffp);
//         System.out.println(diffn);
//         System.out.println(diff0);
//     }
// }
// public class Solution {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         int n = Integer.parseInt(bufferedReader.readLine().trim());

//         List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//             .map(Integer::parseInt)
//             .collect(toList());

//         Result.plusMinus(arr);

//         bufferedReader.close();
//     }
// }

