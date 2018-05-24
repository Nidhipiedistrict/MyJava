import java.util.Scanner;

public class Tutorial{

     public static void main(String []args){
        
        int number=0;
       Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number ");
        
       number = scanner.nextInt();
        if(number%2==0){
             System.out.println("This is Even number");
        }
        else{
             System.out.println("This is odd number");
        }
        
     }
}