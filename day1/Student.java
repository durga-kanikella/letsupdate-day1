import java.util.Scanner;
public class Student{
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
       
           int roll=sc.nextInt();
           sc.nextLine();
           String name=sc.nextLine();
           Float marks=sc.nextFloat();
        
       
            System.out.println("Roll: "+ roll);
            System.out.println("name: "+ name);
            System.out.println("marks: "+ marks);
        
        
    }
}
