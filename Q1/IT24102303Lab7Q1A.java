import java.util.Scanner;

public class IT24102303Lab7Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for four subjects:");
        System.out.print("\n");
        System.out.print("Enter subjects Mark 1:");
        double mark1  = scanner.nextInt();
         System.out.print("Enter subjects Mark 2:");
        double mark2  = scanner.nextInt();
         System.out.print("Enter subjects Mark 3:");
        double mark3  = scanner.nextInt();
         System.out.print("Enter subjects Mark 4:");
        double mark4  = scanner.nextInt();
      
        double Average = (mark1 + mark2 + mark3 + mark4)/4; 

         System.out.println("Average is:"+ Average);
        
        if (Average >= 75 && Average <= 100){
         System.out.println("Overall Grad is : Distinction");
        }
        else if  (Average >= 50 && Average <= 74){
         System.out.println("Overall Grad is : Credit");
        }
        else {
         System.out.println("Overall Grad is : Fail");
        }


    }
}