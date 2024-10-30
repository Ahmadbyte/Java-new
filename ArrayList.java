// import java.util.*;
// class Test{
//     public static void Sum(List<Integer> arr){ // first we have to pass List. And also we will remove void when we want to return.
//         List<Integer> result = new ArrayList<>(); // Then here we have to create ArrayList because we are working in array.
//         int n=arr.size(); // fro size of  Array
//         int sum=0;
//         for(int num : arr){ // for each statement instead of for loop
//             sum+=num;
//         }
//         // return sum; 
//         System.out.print(sum); // printing instead returning.
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         List<Integer> arr1 = new ArrayList<>(); // New ArrayList to iterate 
//         for(int i=0;i<n;i++){ // loop for iteration.
//             arr1.add(sc.nextInt());
//         }
//         // int sum=Sum(arr);  // for return we will store method and print in next line;
//         // System.out.print(sum);
//         Test obj = new Test(); // for print we will create obj 
//         obj.Sum(arr1); // and we ll call method using obj.
//     }
// }

/*------------Find even in List using ArrayList---------- */

import java.util.*;
class Test{
    public static List<Integer> Even(List<Integer> arr){ // to return value in list we remove void and add List<Integer>
        List<Integer> even = new ArrayList<>(); // creating an ArrayList.
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)%2==0){ //we use arr.get(i) to get element from loop.
                even.add(arr.get(i));
            }
        }
        return even; // Then here we return
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr1 = new ArrayList<>(); // this is to add item in list.
        for(int i=0;i<n;i++){
            arr1.add(sc.nextInt()); // we use list.add to add 
        }
        List<Integer> result = Even(arr1); // Again we create new list to iterate through loop and to print element in list;
        for(int num : result){
            System.out.print(num+" ");
        }
        sc.close();
    }
}

/*------------Array Sliding Window------------- */

// import java.util.*;
// class Array {
//     public static void Sum(int[] arr , int k , int n){
//         int j=0;
//         int sum=0;
//         int max = Integer.MIN_VALUE;
//         while(j < n-(k-1)){
//             for(int i=j;i<k+j;i++){
//                 sum+=arr[i];
//                 System.out.print(arr[i]+" ");
//             }
//             if(sum>max){
//                 max=sum;
//             }
//             sum=0;
//             System.out.print(" ");
//             j++;
//         }
//         System.out.println("Max element is : "+max);
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter target element :");
//         int k = sc.nextInt();
//         System.out.println("Enter size of Array :");
//         int n=sc.nextInt();
//         int [] arr1 = new int[n];
//         System.out.println("Enter Array element :");
//         for(int i=0;i<n;i++){
//             arr1[i]=sc.nextInt();
//         }
//         Array obj = new Array();
//         obj.Sum(arr1,k,n);
//     }
// }
