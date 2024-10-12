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