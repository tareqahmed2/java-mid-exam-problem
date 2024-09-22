// 1. Write a program to find maximum between two numbers.
// 2. Write a program to find maximum between three numbers.
import java.util.Scanner;

public class problem1 {

    public static void main(String[] args) throws Exception{

        Scanner maxInput=new Scanner(System.in);
        System.out.println("enter the all numbers");
        int number1=maxInput.nextInt();
        int number2=maxInput.nextInt();
        int number3=maxInput.nextInt();
        int max=number1;
        if (number2>number1 && number2>number3) {
            max=number2;
            
            
        }
        else if (number3>number1 && number3>number2) {
            max=number3;
            
        }
        System.out.printf("the maximum number is %d %n",max);
    }
}
