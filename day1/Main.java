import java.util.Scanner;
class Student{
    int roll;
    String name;
    Float marks;
    void input(){
        Scanner sc=new Scanner(System.in);
        roll=sc.nextInt();
        sc.nextLine();
        name=sc.nextLine();
        marks=sc.nextFloat();
    }
    public void display(){
        System.out.println("Roll: "+roll);
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);

    }
}
class Main{
    public static void main(String[] args){
        Student ob=new Student();
        ob.input();
        ob.display();
    }
}
