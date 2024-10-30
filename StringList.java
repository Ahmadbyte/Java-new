import java.util.*;
class Safi{
    public static List<String> Name(List<String> arr){
        List <String> str = new ArrayList<>();
        String [] vowel={"a","e","i","o","u"};
        for(int i=0;i<arr.size();i++){
            if (Arrays.asList(vowel).contains(arr.get(i))) {
                str.add("1");
            } else {
                str.add(arr.get(i));
            }
        }
        return str;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        sc.nextLine();
        
        List <String> arr1 = new ArrayList<>();
        System.out.println("Enter " + n + " strings:");
        for(int i=0;i<n;i++){
            arr1.add(sc.nextLine());
        }
        
        List <String> result = Name(arr1);
        System.out.println("New String :");
        for(String str1 : result){
            System.out.print(str1+" ");
        }
    }
}

/*------------- Another method finding vowel in string-------------*/

// import java.util.*;
// class Ahmad{
//     public static String Sharique(String str){
//         String [] vowels ={"a","e","i","o","u","A","E","I","O","U"};
//         char[] strArray = str.toCharArray();
//         for(int i=0;i<strArray.length;i++){
//             for(String vowel : vowels){
//                 if (strArray[i] == vowel.charAt(0)) { 
//                     strArray[i] = '1'; 
//                     break;
//                 }
//             }
//         }
//         return new String(strArray);
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String str2 = sc.nextLine();
//         String str3=Sharique(str2);
//         System.out.print(str3);
//     }
// }

/*-------------------String substrig-------------------*/

// class Ahmad{
//     public static String Substring(String str){
//         // str="Sharique Ahmad";
//         String str1=str.substring(0,8 );
//         String str2=str.substring( 9,14);
//         return str1+""+str2;
//     }
//     public static void main(String[] args){
//         String str3 = "Sharique Ahmad";
//         String str4=Substring(str3);
//         System.out.println(str4);
//         System.out.println(str4.length());
//     }
// }

