import java.util.Scanner;
class learn {
    public static void main(String[] args) {

        /*------------------String Reverse----------------- */

        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse : ");
        String str=sc.nextLine();
        StringBuilder str1 = new StringBuilder();
        str1.append(str);  
        str1.reverse();
        System.out.print("String after reverse : ");
        System.out.println(str1);

/*------------------String Pallindrome Check----------------- */

        System.out.print("Enter a size of string : ");
        int n1=sc.nextInt();
        String st="";
        String st1="";
        String[] str2=new String[n1];
        System.out.println("Enter a string  : ");
        for(i=0;i<n1;i++){
            str2[i]=sc.next();
            st+=str2[i];
        }
        System.out.println(st);
        for(j=n1-1;j>=0;j--){          
            st1+=str2[j];
        }
        System.out.println("After reversing string:");
        System.out.println(st1);
        if(st.equals(st1)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}

/*------------Reverse String using function return------------*/

// import java.util.*;
// public class Test{
//     public static String ReverseString(String str){
//         String rstr="";
//         for(int i=0;i<=str.length()-1;i++){
//             rstr=str.charAt(i)+rstr;
//         }
//         return rstr;
//     }
//     public static void main(String args[]){
//         Scanner in = new Scanner (System.in);
//         System.out.println("Enter the string to be reversed");
//         String str = in.nextLine();
//         // Test obj = new Test();
//         String rstr=ReverseString(str);
//         System.out.print("Reverse String is "+rstr);
//     }
// }

/*------------Reverse String using void function------------*/

// import java.util.*;
// class Test{
//     public void Rev(String str){
//         String rstr="";
//         for(int i=0;i<=str.length()-1;i++){
//             rstr=str.charAt(i)+rstr;
//         }
//         System.out.println(rstr);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a String to Reverse : ");
//         String str=sc.nextLine();
//         System.out.println("Reverse string is : ");
//         Test obj = new Test();
//         obj.Rev(str);
//     }
// }

/*----------------- Second max Integer in array using return------------------ */

// import java.util.*;
// public class Demo{
//     public static int Smax(int []arr){
//         int max = Integer.MIN_VALUE;
//         int smax = Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 smax=max;
//                 max=arr[i];
//             }else if(arr[i] > smax && arr[i] != max) {
//                 smax = arr[i];
//             }
//         }
//         return smax;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a size of an array ");
//         int n=sc.nextInt();
//         int arr[]= new int[n];
//         System.out.println("Enter the array");  
//         for(int i=0; i<n; i++) {  
//             arr[i]=sc.nextInt();
//         }
//         int smaxx=Smax(arr);
//         System.out.println("Second max "+smaxx);
//     }
// }

/*----------------- Second max Integer in array using void------------------ */

// import java.util.*;
// public class Demo{
//     public void Smax(int []arr){
//         int max = Integer.MIN_VALUE;
//         int smax = Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 smax=max;
//                 max=arr[i];
//             }else if(arr[i] > smax && arr[i] != max) {
//                 smax = arr[i];
//             }
//         }
//         System.out.println("Second max is "+smax);
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a size of an array ");
//         int n=sc.nextInt();
//         int arr[]= new int[n];
//         System.out.println("Enter the array");  
//         for(int i=0; i<n; i++) {  
//             arr[i]=sc.nextInt();
//         }
//         Demo obj = new Demo();
//         obj.Smax(arr);
//         // int smaxx=Smax(arr);
//         // System.out.println("Second max "+smaxx);
//     }
// }


/*------------------Integer sorting and reverse----------------- */

//         System.out.println();
//         int temp=0;
//         int temp1=0;
//         System.out.print("Enter a size of array : ");
//         int n=sc.nextInt();
//         int [] arr =new int[n];
//         // int[] arr = new int[]{4,3,22,4,6,8,2,66,-1};
//         System.out.print("Array before sorting : " ); 
//         for(i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.print("Array after swap : ");
//         for(i=0;i<arr.length;i++){
//             for(j=i+1;j<arr.length;j++){
//                 temp1=arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp1;
//             }
//             System.out.print(arr[i]);
//             System.out.print(" ");
//         }
//         System.out.println();
//         System.out.print("Array after sorting : " );
//         for(i=0;i<arr.length;i++){
//             for(j=i+1;j<arr.length;j++){
//              if(arr[i]>arr[j]){
//                 temp=arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;
//                 }
//             }
//             System.out.print(arr[i]);
//             System.out.print(" ");
//         }
//         sc.close();
//     }
// }


/*

--------------fibonacci--------------

class fib{
    int a=0;
    int b=1;
    int n=10;
    int sum=0;
    int i=0;
    public void fibo(){
        if(i<n){
            i++;
            System.out.print(" "+a);
            sum=a+b;
            a=b;
            b=sum;
            fibo();
        }
    }
    public static void main(String... args){
        fib obj = new fib();
        obj.fibo();
    }
}

...........prime check.........

import java.util.*;
class learn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>2){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
    }
} 

...........palindrome check.........

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int temp=n1;
        int rev=0;
        while(n1!=0){
            int rem=n1%10;
            rev=rev*10+rem;
            n1=n1/10;
        }
        System.out.println(rev);
        if(temp==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}

----------------find missing number----------------

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int sum=0;
        int sum1=0;
        int diff=0;
        int [] arr = {10, 11, 12, 14, 15};
        int [] arr1 = new int[6];
        for(i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
            sum1+=arr1[i];
        }
        for(i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        diff=sum1-sum;
        System.out.print(diff);
    }
}

---------------recursion--------------

class sum{
    static int start=1;
    static int end=10;
    static void ans(){
        if(start<=end){
            System.out.print(" "+start);
            start++;
            ans();
        }
    }
    public static void main(String[] args){
        ans();
    }
}

--------------check prime using recurssion-----------

class sum{
    static int num=3;
    static int count=0;
    static int i=0;
    public static void ans(){
        i++;
        if(num%i==0){
            count+=1;
            ans();
        }
    }
    public static void cnt(){
        ans();
        if(count<=2){
            System.out.print("prime");
        }else{
            System.out.print("not prime");
        }
    }
    public static void main(String[] args){
        cnt();
    }
}

--------------max num of consecutive 1's ----------------


import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int count=0;
        int max=0;
        int amax=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count+=1;
                amax=count;
            }else{
                count=0;
            }
            if(amax>max){
                max=amax;
            }
        }
        System.out.print("Maximum number of 1's are : "+max);
    }
}

---------------String Pallindrome check using method function--------------

import java.util.*;
class palin{
        void pal(){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String[] str= new String[n];
        String st="";
        String st1="";
        for(int i=0;i<str.length;i++){
            str[i]=sc.next();
            st+=str[i];
        }
        for(int j=n-1;j>=0;j--){
            st1+=str[j];
        }
        System.out.println(st1);
        if(st.equals(st1)){
            System.out.println("Pal");
        }else{
            System.out.println("No Pal");
        }
    }
    public static void main(String[] args){
        palin obj = new palin();
        obj.pal();
    }
}

-----------------Factorial using functions----------------

class HelloWorld {
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return (n*(fact(n-1)));
        }
    }
    public static void main(String[] args) {
        int num=6;
        // num=n;
        int x=fact(num);
        System.out.println(x);
    }
}

-----------------Armstrong number----------------

import java.util.*;
class HelloWorld {
    static int orig=0;
    static int sum=0;
    static int num=1634;
    static int num1=num;
    public static void arms(){
        if(num>0){
            orig=num%10;
            sum+=Math.pow(orig,4);
            num=num/10;
            arms();
            // System.out.println(sum);
        }
    }
    public static void ans(){
        arms();
        if(sum==num1){
            System.out.println(num1+" is Armstrong");
        }else{
            System.out.println(num1+" is Not Armstrong");
        }
    }
    public static void main(String[] args) {
        ans();
        
    }
}

-----------------Armstrong number using function method using void----------------

import java.util.*;
class Armstrong{
    public static void Arms(int num){
        int temp=num;
        int num1=num;
        int count=0;
        int ans=0;
        while(temp>0){
            int ld = temp%10;
            count += 1;
            temp /= 10;
        }
        while(num1>0){
            // Arms();
            int ld1=num1%10;
            ans += Math.pow(ld1 , count);
            num1 /=10;
        }
        if(ans == num){
            System.out.println(num + " is Armstrong");
        }else{
            System.out.println(num + " is not an Armstrong "+"coz difference "+ans);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        Armstrong obj = new Armstrong();
        obj.Arms(n);
    }
}

----------------- Armstrong without static--------------

import java.util.*;
class Arms {
    int orig=0;
    int ld=0;
    int count=0;
    int sum=0;
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int num1=num;
    int num2=num;
    public void cnt(){
        if(num>0){
            ld=num%10;
            count+=1;
            num=num/10;
            cnt();
        }
    }
    public void arms(){
        cnt();
        System.out.println(" sum: "+sum);
        if(num2!=0){
            orig=num2%10;
            sum+=Math.pow(orig,count);
            num2=num2/10;
            arms();
        }
    }
    public void ans(){
        arms();
        if(sum==num1){
            System.out.println(num1+" is Armstrong");
        }else{
            System.out.println(num1+" is Not Armstrong");
        }
    }
    public static void main(String[] args) {
        Arms obj = new Arms();
        obj.ans();
        
    }
}

-------------Arsmtrong without using  math.pow() ----------------

import java.util.*;
class Arms {
    int orig=0;
    int ld=0;
    int count=0;
    int sum=0;
    int sum1=0;
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int num1=num;
    int num2=num;
    public void cnt(){
        if(num>0){
            ld=num%10;
            count+=1;
            num=num/10;
            cnt();
        }
    }
    public void arms(){
        cnt();
        if(num2!=0){
            orig=num2%10;
            int ln=orig;
            for(int i=1;i<count;i++){
                sum=orig*ln;
                orig=sum;
            }
            sum1=sum+sum1;
            System.out.println(" sum: "+sum1);
            // sum+=Math.pow(orig,count);
            num2=num2/10;
            arms();
        }
    }
    public void ans(){
        arms();
        if(sum1==num1){
            System.out.println(num1+" is Armstrong");
        }else{
            System.out.println(num1+" is Not Armstrong");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Arms obj = new Arms();
        obj.ans();
        
    }
}


--------------------removing space from string---------------

import java.util.*;
class Sharique{
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder str1=new StringBuilder();
        str1.append(str);
        String[] str2=null;
        str2=str.split(" ");
        for(int i=0;i<str2.length;i++){
            System.out.print(str2[i]);
        }
        System.out.println();
        System.out.println(str1);
    }
}

--------------------Using this keyword in constructor code------------------

class Student{
    String name;
    int roll;
    float fee;
    Student(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    Student(String name,int roll,float fee){
        this(name,roll);
        this.fee=fee;
    }
    void display(){
        System.out.println("Student name :"+name+" Roll no."+roll+" Fees: "+fee);
    }
}
class TestThis{
    public static void main(String[] args){
        Student obj = new Student("Sharique",7);
        Student obj1 = new Student("Ahmad",8,5000f);
        obj.display();
        obj1.display();
    }
}

---------same but another constructor program--------------------

class Ration{
    String Wheat;
    String Flour;
    String Daaal;
    int Totalcost;
    Ration(String Wheat,String Flour,String Daaal ){
        this.Wheat=Wheat;
        this.Flour=Flour;
        this.Daaal=Daaal;
    }
    Ration(String Wheat,String Flour,String Daaal,int Totalcost){
        this(Wheat,Flour,Daaal);
        this.Totalcost=Totalcost;
    }
    void display(){
        System.out.println("Cost of wheat is:"+Wheat+" Cost of flour is:"+Flour+" Cost of Daaal is:"+Daaal+" Total cost of Ration :"+Totalcost);
    }
}
class Total{
    public static void main(String[] args){
        Ration obj = new Ration("Rs."+60+"/kg","Rs."+50+"/kg","Rs."+40+"/kg");
        Ration obj1 = new Ration("Rs."+60+"/kg","Rs."+50+"/kg","Rs."+40+"/kg",150);
        obj.display();
        obj1.display();
    }
}

*/

/*---------------- */

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

/*-------------Using abstract class ------------ */

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

/*-------------Using interface class ------------ */

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

/*--------------Abstract Class------------ */

// abstract class Car{
//     abstract void Company();
//     public void Brand(){
//         System.out.println("Model is Verna");
//     }
// }
// class Model extends Car{
//     public void Company(){
//         System.out.println("Company is Hyundai");
//     }
// }
// class Milage extends Car{
//     public void Brand(){
//         System.out.println("Brand");
//     }
//     public void Company(){
//         System.out.println("Milage is 16km/ltr");
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         Car model = new Model();
//         model.Company();
//         model.Brand();
//         Car milage = new Milage();
//         milage.Company();
//         milage.Brand();
//     }
// }

/*--------------Array who is greater------------ */

// import java.util.*;
// class Compare{
//     public static void Match(int [] a, int [] b){
//         int acount=0;
//         int bcount=0;
//         for(int i=0;i<a.length;i++){
//             if(a[i]>b[i]){
//                 acount++;
//             }else if(a[i]<b[i]){
//                 bcount++;
//             }else if(a[i]==b[i]){
//                 continue;
//             }
//         }
//         // return new int[]{acount, bcount};
//         System.out.println(acount + " " + bcount);
//     }
// }
// public class Test{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=3;
//         int [] alice = new int[n];
//         int [] bob = new int[n];
//         // System.out.println("Enter array element for Alice ");
//         for(int i=0;i<alice.length;i++){
//             alice[i]=sc.nextInt();
//         }
//         // System.out.println("Enter array element for Bob ");
//         for(int j=0;j<bob.length;j++){
//             bob[j]=sc.nextInt();
//         }
//         Compare obj = new Compare();
//         obj.Match(alice, bob);
//     }
// }

/*-------------Array addition------------- */

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

//     /*
//      * Complete the 'aVeryBigSum' function below.
//      *
//      * The function is expected to return a LONG_INTEGER.
//      * The function accepts LONG_INTEGER_ARRAY ar as parameter.
//      */

//     public static long aVeryBigSum(List<Long> ar) {
//     // Write your code here
//     long sum=0;
//         for(int i=0;i<ar.size();i++){
//             sum+=ar.get(i);
//         }
//         return sum;
//     }
    
// }

// public class Solution {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//         int arCount = Integer.parseInt(bufferedReader.readLine().trim());

//         List<Long> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//             .map(Long::parseLong)
//             .collect(toList());

//         long result = Result.aVeryBigSum(ar);

//         bufferedWriter.write(String.valueOf(result));
//         bufferedWriter.newLine();

//         bufferedReader.close();
//         bufferedWriter.close();
//     }
// }



